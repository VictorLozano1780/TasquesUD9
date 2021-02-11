/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD9_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro[] = new Libro[2];
		
		libro[0] = new Libro("12341413", "El quijote", "Paco pepe", 100);
		libro[1] = new Libro("23874823", "El quijote 2", "Paco pepe", 105);
		
		imprimirLibros(libro);
		comparar(libro);
	}

	/**
	 * @param libro
	 */
	private static void comparar(Libro[] libro) {
		Libro masPaginas = libro[0];
		for (int i = 1; i < libro.length; i++) {
			if(masPaginas.compareTo(libro[i].getNumPags())) {
				masPaginas = libro[i];
			}
		}
		System.out.println("El libro con más paginas es:");
		System.out.println(masPaginas.toString());
		
	}

	/**
	 * @param libro
	 */
	private static void imprimirLibros(Libro[] libro) {
		for (int i = 0; i < libro.length; i++) {
			System.out.println(libro[i]);
		}
	}

}
