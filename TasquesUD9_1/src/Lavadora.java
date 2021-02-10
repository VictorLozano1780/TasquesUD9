/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Lavadora extends Electrodomestico{
	private final double CARGA = 5;
	
	private double carga;

	/**
	 * 
	 */
	public Lavadora() {
		this.carga = CARGA;
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public double precioFinal(){
		double precio = super.precioFinal();
		
		if (this.carga > 30) {
			precio += 50;
		}
		return precio;
		
	}

	
	
}
