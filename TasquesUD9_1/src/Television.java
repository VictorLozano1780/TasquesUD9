/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Television extends Electrodomestico{
	private final double RESOLUCION = 20;
	private final boolean SINTONIZADOR = false;
	
	private double resolucion;
	private boolean sintonizador;
	/**
	 * 
	 */
	public Television() {
		this.resolucion = RESOLUCION;
		this.sintonizador = SINTONIZADOR;
	}
	/**
	 * @param resolucion
	 * @param sintonizador
	 */
	public Television(double resolucion, boolean sintonizador) {
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	/**
	 * @return the resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}
	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	/**
	 * @return the sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}
	/**
	 * @param sintonizador the sintonizador to set
	 */
	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	public double precioFinal() {
		double precio = super.precioFinal();
		if (this.resolucion > 40) {
			precio += precio * 0.3;
		} if (this.sintonizador) {
			precio += 50;
		}
		
		return precio;
		
	}
}
