/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Pelicula extends Cine{
	private double duracion;
	private int edadMinima;
	private String director;
	/**
	 * 
	 */
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param titulo
	 * @param duracion
	 * @param edadMinima
	 * @param director
	 */
	public Pelicula(String pelicula, double precio, double duracion, int edadMinima, String director) {
		super(pelicula, precio);
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	/**
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the edadMinima
	 */
	public int getEdadMinima() {
		return edadMinima;
	}
	/**
	 * @param edadMinima the edadMinima to set
	 */
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Pelicula [duracion=" + duracion + ", edadMinima=" + edadMinima + ", director="
				+ director + "]";
	}
	
	
}
