/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos 5 objetos con datos inventados
		Serie serie[] = new Serie[5];
		Videojuego game[] = new Videojuego[5];

		serie[0] = new Serie("The walking dead", 200, "Terror", "Pepe Viyuela");
		serie[1] = new Serie();
		serie[2] = new Serie("Aida", 20, "Terror", "Aida");
		serie[3] = new Serie("Gladiator", 1, "Historia", "Pedro");
		serie[4] = new Serie("2 hombres y medio", 5, "Comedia", "Maria Jose");

		game[0] = new Videojuego("The last of us", 15, "Mundo abierto", "Naughty Dog");
		game[1] = new Videojuego();
		game[2] = new Videojuego("GTA5", 50, "Violencia", "Rockstar");
		game[3] = new Videojuego("GTA San Andreas", 17, "Violencia", "Rockstar");
		game[4] = new Videojuego("GTA Vicer City", 18, "Violencia", "Rockstar");

		// llamamos al metodo entregar en la clase Serie
		serie[0].entregar();
		serie[2].entregar();
		serie[4].entregar();

		// llamamos al metodo entregar en la clase Videojuego
		game[1].entregar();
		game[2].entregar();

		// llamamos a los metodos de imprimir el cual nos pondr por pantalla el numero
		// de series y videojuegos que estan entregados
		imprimirEntregados(serie);
		imprimirEntregados(game);

		// Llamamos a los metodos que ven cuantas temporadas y horas estimadas de juego
		// tienen los objetos
		horasVideojuego(game);
		temporadas(serie);
	}

	/**
	 * @param serie
	 */
	private static void temporadas(Serie[] serie) {
		Serie ganador = serie[0]; // Hacemos que la 1a serie sea la mas grande por el momento
		for (Serie e : serie) {
			if (ganador.compareTo(e.getTemporadas())) { // Usamos el metodo compareTo del objeto Serie para comprobar si
														// el ultimo numero mayor guardado es mas grande o mas pequeño y
														// actualiza si es mas grande
				ganador = e;
			}
		}
		System.out.println("\nSerie con mas temporadas: "); // Imprime la serie mas grande con el metodo toString
		System.out.println(ganador.toString());
	}

	/**
	 * @param game
	 */
	private static void horasVideojuego(Videojuego[] game) {
		Videojuego ganador = game[0]; // Hacemos que el 1r Videojuego sea el que tiene mas horas por el momento
		for (Videojuego e : game) {
			if (ganador.compareTo(e.getHorasEstimadas())) {// Usamos el metodo compareTo del objeto Videojuego para comprobar
															// si el ultimo numero mayor guardado es mas grande o mas pequeño y
															// actualiza si es mas grande
				ganador = e;
			}
		}

		System.out.println("\nVideojuego con mas horas: "); // Imprime el videojuego con mas horas con el metodo toString
		System.out.println(ganador.toString());

	}

	/**
	 * @param game
	 */
	private static void imprimirEntregados(Videojuego[] game) {
		int entregados = 0;
		for (int i = 0; i < game.length; i++) { //Comprueba cuantos videojuegos hay entregados
			if (game[i].isEntregado()) {
				entregados++;
			}
		}
		System.out.println("\nHay " + entregados + " videojuegos entregados: \n"); // Imprime por pantalla cuantos videojuegos hay entregados
		for (int i = 0; i < game.length; i++) {
			if (game[i].isEntregado()) { 
				System.out.println(game[i].toString()); //Imprime el videojuego solo si esta entregado
			}
		}
	}

	/**
	 * @param serie
	 */
	private static void imprimirEntregados(Serie[] serie) {
		int entregados = 0;
		for (int i = 0; i < serie.length; i++) { //Comprueba cuantas series hay entregadas
			if (serie[i].isEntregado()) {
				entregados++;
			}
		}
		System.out.println("\nHay " + entregados + " series entregadas: \n"); //Imprime cuantas series han sido entregadas
		for (int i = 0; i < serie.length; i++) {
			if (serie[i].isEntregado()) {
				System.out.println(serie[i].toString()); //Imprime la Serie en el caso de que este entregada
			}
		}

	}

}
