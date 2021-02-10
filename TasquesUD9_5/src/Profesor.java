/**
 * 
 */

/**
 * @author V�ctor Lozano
 *
 */
public class Profesor extends Persona{
	
	private String materias;
	private boolean disponible;
	/**
	 * 
	 */
	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Profesor(String nombre, int edad, char sexo, String materias, boolean disponible) {
		super(nombre, edad, sexo);
		if (materias.equals("matem�ticas") || materias.equals("filosof�a") || materias.equals("f�sica")) {
			this.materias = materias;
		}
		this.disponible = disponible;
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Profesor(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the materias
	 */
	public String getMaterias() {
		return materias;
	}

	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(String materias) {
		this.materias = materias;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Profesor: "
				+ "\nNombre: " + nombre 
				+ "\nEdad: " + edad
				+ "\nSexo: " + sexo
				+ "\nMateria: " + materias
				+ "\nDisponible: " + disponible;
	}


}
