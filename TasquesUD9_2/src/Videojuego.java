/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Videojuego implements Entregable {
	final private int HORAS = 10;
	final private boolean ENTREGADO = false;

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	/**
	 * 
	 */
	public Videojuego() {
		this.horasEstimadas = HORAS;
		this.entregado = ENTREGADO;
	}

	/**
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
	}

	/**
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param compañia
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = ENTREGADO;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the compañia
	 */
	public String getCompañia() {
		return compañia;
	}

	/**
	 * @param compañia the compañia to set
	 */
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "\nVideojuego:" + "\nTitulo: " + titulo + "\nHorasEstimadas: " + horasEstimadas + "\nGenero: " + genero
				+ "\nCompañia=" + compañia + "\nEntregado: " + entregado;
	}

	@Override
	public void entregar() { // Ponemos el metodo entregar para que la variable entregado sea true
		this.entregado = true;

	}

	@Override
	public void devolver() { // Ponemos el metodo entregar para que la variable entregado sea false
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() { // Devuelve el estado de entregado
		return this.entregado;

	}

	@Override
	public boolean compareTo(Object a) {
		if (this.horasEstimadas < (int) a) { // Si las horasEstimadas son menores que el anterior objeto devuelve true
			return true;
		}
		return false; // Si no lo es devuelve false
	}

}
