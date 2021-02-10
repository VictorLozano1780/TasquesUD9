/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Estudiante extends Persona {

	private double calificacion;
	private boolean disponible;

	/**
	 * 
	 */
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Estudiante(String nombre, int edad, char sexo, double calificacion) {
		super(nombre, edad, sexo);
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion = calificacion;
		}
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
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
		return "Estudiante: "
				+ "\nNombre: " + nombre 
				+ "\nEdad: " + edad
				+ "\nSexo: " + sexo
				+ "\nCalificacion: " + calificacion
				+ "\nDisponible: " + disponible;
	}
	

}
