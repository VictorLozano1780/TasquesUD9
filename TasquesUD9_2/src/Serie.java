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
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {
		return this.entregado;

	}

	@Override
	public boolean compareTo(Object a) {
		if (this.temporadas < (int) a) {
			return true;
		} else {
			return false;
		}
	}
}
