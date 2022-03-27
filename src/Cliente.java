
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente extends Dibujar{

	public static void main ( String [] args) {

		int numIntentos = 6;

		int longitudPalabra;

		char[] palabraF;
		Dibujar d = new Dibujar();
		
		try {

			// se crea la conexion

			String host = "LocalHost";

			Socket sc = new Socket(host, 2500); // conexion

			Scanner scan = new Scanner(System.in);

			System.out.println("Menu:");

			System.out.println();

			System.out.println("Opcion 1: Nueva partida");

			System.out.println();

			System.out.println("Opcion 2: Salir");

			int opcion = Integer.parseInt(scan.nextLine());

			OutputStream ostream = sc.getOutputStream();
			ObjectOutput s = new ObjectOutputStream(ostream);

			switch (opcion) {

			case 1:


				s.writeInt(opcion);
				s.flush();
				break;

			case 2:

				break;
			}

			InputStream istream = sc.getInputStream();

			ObjectInput in = new ObjectInputStream(istream);

			longitudPalabra = in.readInt();

			numIntentos = in.readInt();
			
			System.out.println(longitudPalabra);
			d.crea(longitudPalabra);
			d.dibujar(numIntentos);

			while(numIntentos != 0) {


					System.out.println();

					System.out.println("Escriba una letra");

					String letra = scan.nextLine();

					s.writeUTF(letra);

					s.flush();

					String palabra = in.readUTF();
					
					numIntentos = in.readInt();

					palabraF = palabra.toCharArray();
					
					d.setPalabra(palabraF);
					d.dibujar(numIntentos);

					if (!palabra.contains("_")) {
						System.out.println("Has Ganado");
						break;
					}
			}
			
			if (numIntentos == 0) {
			
				 System.out.println("Has perdido");
			}
			sc.close();
		} catch (Exception e) {

			System.err.println("excepcion " + e.toString() );

			e.printStackTrace() ;

		}
	}
}
