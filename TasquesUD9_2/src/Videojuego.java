/**
 * 
 */

/**
 * @author V�ctor Lozano
 *
 */
public class Videojuego implements Entregable {
	final private int HORAS = 10;
	final private boolean ENTREGADO = false;

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;

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
	 * @param compa�ia
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
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
	 * @return the compa�ia
	 */
	public String getCompa�ia() {
		return compa�ia;
	}

	/**
	 * @param compa�ia the compa�ia to set
	 */
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "\nVideojuego:" + "\nTitulo: " + titulo + "\nHorasEstimadas: " + horasEstimadas + "\nGenero: " + genero
				+ "\nCompa�ia=" + compa�ia + "\nEntregado: " + entregado;
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
