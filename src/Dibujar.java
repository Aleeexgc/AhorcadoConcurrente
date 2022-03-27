
public class Dibujar{

	private char[] palabra = null;

	public void crea(int longitud) {

		if (palabra == null) {

			palabra= new char[longitud];

			for (int j = 0; j < longitud; j++) {

				palabra[j]='_';

			}
		}
	}

	public char[] getPalabra() {
		return palabra;
	}



	public void setPalabra(char[] palabra) {	
		
		this.palabra = palabra;

	}

	public void dibujar(int i) {

		switch (i) {
		case 6:
			System.out.println(" ---------------------");
			for (int j = 0; j < 15; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 5:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			for (int j = 0; j < 10; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 4:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 3:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / |   ");
			System.out.println(" |                 /   |   ");
			System.out.println(" |                /    |   ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 2:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 1:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    /  ");
			System.out.println(" |                   /      ");
			System.out.println(" |                  /       ");
			for (int j = 0; j < 2; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 0:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | X  X  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    / \\");
			System.out.println(" |                   /   \\  ");
			System.out.println(" |                  /     \\ ");
			for (int j = 0; j < 2; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			System.out.println("GAME OVER");
			break;
		}

		System.out.print("           PALABRA: ");

		for (int j = 0; j < palabra.length; j++) {

			System.out.print(palabra[j] + " ");

		}

		System.out.println();
	}


}
