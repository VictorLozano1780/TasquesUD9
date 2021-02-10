/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Aula {
	private int identificador;
	private int maxEstudiantes;
	private String destinada;

	/**
	 * 
	 */
	public Aula() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param identificador
	 * @param maxEstudiantes
	 * @param destinada
	 */
	public Aula(int identificador, int maxEstudiantes, String destinada) {
		this.identificador = identificador;
		this.maxEstudiantes = maxEstudiantes;
		if (destinada.equals("matemáticas") || destinada.equals("filosofía") || destinada.equals("física")) {
			this.destinada = destinada;
		}
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the maxEstudiantes
	 */
	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	/**
	 * @param maxEstudiantes the maxEstudiantes to set
	 */
	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	/**
	 * @return the destinada
	 */
	public String getDestinada() {
		return destinada;
	}

	/**
	 * @param destinada the destinada to set
	 */
	public void setDestinada(String destinada) {
		this.destinada = destinada;
	}

	@Override
	public String toString() {
		return "Aula: " + identificador
				+ "\nAlumnos máximos: " + maxEstudiantes
				+ "\nAula destinada a: " + destinada;
	}

}
