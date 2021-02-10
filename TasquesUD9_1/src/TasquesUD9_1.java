/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD9_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico elec[] = new Electrodomestico[10];
		elec[0] = new Electrodomestico(100, "blanco", 'F', 50);
		elec[1] = new Electrodomestico(200, "azul", 'A', 100);
		elec[2] = new Electrodomestico(400, "rojo", 'D', 75);
		elec[3] = new Lavadora(100, "azul", 'C', 100, 30);
		elec[4] = new Lavadora(300, "rojo", 'D', 50, 40);
		elec[5] = new Lavadora(150, "azul", 'A', 90, 70);
		elec[6] = new Television(110, "negro", 'A', 100, 30, true);
		elec[7] = new Television(200, "blanco", 'B', 200, 50, true);
		elec[8] = new Television(110, "negro", 'C', 100, 10, false);
		elec[9] = new Television(110, "negro", 'A', 100, 15, true);

		calculaElectrodomestico(elec);

	}

	/**
	 * @param elec
	 */
	private static void calculaElectrodomestico(Electrodomestico[] elec) {
		double precioElec = 0;
		double precioLavadora = 0;
		double precioTele = 0;
		
		for (Electrodomestico e : elec) {
			if (e instanceof Electrodomestico) {
				precioElec += e.precioFinal();
			}
			if (e instanceof Lavadora) {
				precioLavadora += e.precioFinal();
				precioElec += precioLavadora;
			}
			if (e instanceof Television){
				precioTele += e.precioFinal();
				precioElec += precioTele;
			}
		}
		System.out.println("Precio final Electrodomesticos: " + precioElec);
		System.out.println("Precio final Lavadoras: " + precioLavadora);
		System.out.println("Precio final Tele: " + precioTele);

	}

}
