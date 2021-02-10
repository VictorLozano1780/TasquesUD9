/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Serie implements Entregable {

	private final int TEMPORADAS = 3;
	private final boolean ENTREGADO = false;

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	/**
	 * 
	 */
	public Serie() {
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
	}

	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
	}

	/**
	 * @param titulo
	 * @param temporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
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
	 * @return the temporadas
	 */
	public int getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
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
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "\nInformación de la Serie\n" + "Titulo: " + titulo + "\nTemporadas: " + temporadas + "\nGenero: " + genero
				+ "\nCreador: " + creador + "\nEntregado: " + entregado;
	}

	@Override
	public void entregar() {
		this.entregado = true; // Ponemos el metodo entregar para que la variable entregado sea true

	}

	@Override
	public void devolver() {
		this.entregado = false;// Ponemos el metodo entregar para que la variable entregado sea false

	}

	@Override
	public boolean isEntregado() {
		return this.entregado; // Devuelve el estado de entregado

	}

	@Override
	public boolean compareTo(Object a) {
		if (this.temporadas < (int) a) { // Comprueba si el numero de temporadas es mas pequeño que el anterior mas
											// grande pasado por parametro
			return true; // Si es mas grande devuelve true
		} else {
			return false; // Si es mas pequeño false
		}
	}
}
