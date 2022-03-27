import java.net.*;
import java.lang.*;


public class Servidor {

	public static void main ( String [] args) {
		
		ServerSocket serverAddr = null;
		
		Socket sc = null;
		
		try {
			
			serverAddr = new ServerSocket(2500);
			
		} catch (Exception e){
			
			System.err.println("Error creando socket");
			
		}

		
		while (true){
			
			try {
				
				sc = serverAddr.accept(); // esperando conexión
				
				new TratarPeticion(sc).start();
				
				
			} catch(Exception e) {
				
				System.err.println("excepcion " + e.toString() );
				
				e.printStackTrace() ;
				
			}
			
		}
		
	}
	
}
