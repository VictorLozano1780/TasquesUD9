/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Espectador extends Cine{
	private String nombre;
	private int edad;
	private double dinero;
	/**
	 * 
	 */
	public Espectador() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param edad
	 * @param dinero
	 */
	public Espectador(String pelicula, double precio, String nombre, int edad, double dinero) {
		super(pelicula, precio);
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the dinero
	 */
	public double getDinero() {
		return dinero;
	}
	/**
	 * @param dinero the dinero to set
	 */
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
}
