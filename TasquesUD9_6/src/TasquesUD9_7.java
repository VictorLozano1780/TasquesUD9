
/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD9_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Espectador espec[] = new Espectador[30];
		Cine cine = new Cine();
		Pelicula peli = new Pelicula("El hobbit", 10.0, 150, 12, "Pepe");
		
		System.out.println("Cine al principio");
		cine.imprimir();
		generarEspectadores(espec);
		sentarEspectadores(espec, peli, cine);
		System.out.println("\nCine con gente sentada\n");
		cine.imprimir();
	}

	/**
	 * @param espec
	 * @param peli 
	 * @param cine 
	 */
	private static void sentarEspectadores(Espectador[] espec, Pelicula peli, Cine cine) {
		for (int i = 0; i < espec.length; i++) {
			int num1 = (int) (Math.random()*8);
			int num2 = (int) (Math.random()*9);
			if(espec[i].getEdad() >= peli.getEdadMinima() && espec[i].getDinero() >= peli.getPrecio()) {
				while(cine.getAsientos()[num1][num2] == "OO") {
					num1 = (int) (Math.random()*8);
					num2 = (int) (Math.random()*9);
				}
				cine.setAsientos(num1, num2);
			}
		}
	}

	/**
	 * @param espec
	 */
	private static void generarEspectadores(Espectador[] espec) {
		for (int i = 0; i < espec.length; i++) {
			espec[i] = new Espectador("El hobbit", 10.0, "Persona" + i, (int) (Math.random()*40), Math.random()*60);
		}
	}

}
