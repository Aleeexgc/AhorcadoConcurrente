import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TratarPeticion extends Thread{ 

	private Socket sc;

	String[] palabras = {"elefante", "bombilla", "perro", "television"};

	String palabra = "";

	int numIntentos = 6;

	int longitudPalabra;


	TratarPeticion(Socket s) {

		sc = s;

	}

	public void run() {

		try {

			InputStream istream = sc.getInputStream();

			ObjectInput in = new ObjectInputStream(istream);

			OutputStream ostream = sc.getOutputStream();

			ObjectOutput s = new ObjectOutputStream(ostream);


			if (in.readInt() == 1) {

				palabra = palabras[(int)(Math.random()*3)];

				longitudPalabra = palabra.length();

				s.writeInt(longitudPalabra);
				s.writeInt(numIntentos);

				s.flush();

			}

			char[] palabraT= new char[longitudPalabra];
			
			for (int i = 0; i < palabraT.length; i++) {
				
				palabraT[i] =  '_';
				
		}

			while(numIntentos != 0) {				
				String palabraR = "";
				String letra = in.readUTF();


				if(palabra.contains(letra)) {


					for (int i = 0; i < palabra.length(); i++) {

						if (palabra.charAt(i) == letra.charAt(0)) {

							palabraT[i] = palabra.charAt(i);
						} else {

							if((!Character.isLetter(palabraT[i]))) {
								palabraT[i] =  '_';
							}
						}

					}

					for (int i = 0; i < palabraT.length; i++) {
						
						palabraR+=palabraT[i];
					}
					s.writeUTF(palabraR);

					s.writeInt(numIntentos);

					s.flush();

				} else {

					numIntentos--;

					for (int i = 0; i < palabraT.length; i++) {
						
						palabraR+=palabraT[i];
					}
					
					s.writeUTF(palabraR);

					s.writeInt(numIntentos);

					s.flush();
				}
				
				if (!palabraR.contains("_")) {
					
					break;
				}

			}

			sc.close();

		} catch (Exception e) {

			System.err.println("excepcion " + e.toString() );

			e.printStackTrace() ;

		}
	}

}
