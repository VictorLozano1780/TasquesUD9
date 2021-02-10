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
		Serie serie[] = new Serie[5];
		Videojuego game[] = new Videojuego[5];

		serie[0] = new Serie("The walking dead", 200, "Terror", "Pepe Viyuela");
		serie[1] = new Serie("La que se avicina", 12, "Comedia", "Santiago Iglesias");
		serie[2] = new Serie("Aida", 20, "Terror", "Aida Palau");
		serie[3] = new Serie("Gladiator", 1, "Historia", "Pedro Casado");
		serie[4] = new Serie("2 hombres y medio", 5, "Comedia", "Maria Jose");

		game[0] = new Videojuego("The last of us", 15, "Mundo abierto", "Naughty Dog");
		game[1] = new Videojuego("The last of us part 2", 19, "Mundo abierto", "Naughty Dog");
		game[2] = new Videojuego("GTA5", 50, "Violencia", "Rockstar");
		game[3] = new Videojuego("GTA San Andreas", 17, "Violencia", "Rockstar");
		game[4] = new Videojuego("GTA Vicer City", 18, "Violencia", "Rockstar");

		serie[0].entregar();
		serie[2].entregar();
		serie[4].entregar();

		game[1].entregar();
		game[2].entregar();
		
		imprimirEntregados(serie);
		imprimirEntregados(game);
		horasVideojuego(game);
		temporadas(serie);
	}

	/**
	 * @param serie
	 */
	private static void temporadas(Serie[] serie) {
		Serie ganador = serie[0];
		for(Serie e : serie) {
			if(ganador.compareTo(e.getTemporadas())) {
				ganador = e;
			}
		}
		System.out.println("\nSerie con mas temporadas: ");
		System.out.println(ganador.toString());
	}

	/**
	 * @param game
	 */
	private static void horasVideojuego(Videojuego[] game) {
		Videojuego ganador = game[0];
		for(Videojuego e : game) {
			if(ganador.compareTo(e.getHorasEstimadas())) {
				ganador = e;
			}	
		}
		
		System.out.println("\nVideojuego con mas horas: ");
		System.out.println(ganador.toString());
		
	}

	/**
	 * @param game
	 */
	private static void imprimirEntregados(Videojuego[] game) {
		int entregados = 0;
		for (int i = 0; i < game.length; i++) {
			if (game[i].isEntregado()) {
				entregados++;
			}
		}
		System.out.println("\nHay " + entregados + " videojuegos entregados: \n");
		for (int i = 0; i < game.length; i++) {
			if (game[i].isEntregado()) {
				System.out.println(game[i].toString());
			}
		}
	}

	/**
	 * @param serie
	 */
	private static void imprimirEntregados(Serie[] serie) {
		int entregados = 0;
		for (int i = 0; i < serie.length; i++) {
			if (serie[i].isEntregado()) {
				entregados++;
			}
		}
		System.out.println("\nHay " + entregados + " series entregadas: \n");
		for (int i = 0; i < serie.length; i++) {
			if (serie[i].isEntregado()) {
				System.out.println(serie[i].toString());
			}
		}
		
	}

}
