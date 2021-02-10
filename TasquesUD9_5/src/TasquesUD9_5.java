
/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD9_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona pers[] = new Persona[10];
		pers[0] = new Estudiante("Pepe", 15, 'H', 8.3);
		pers[1] = new Estudiante("Jesus", 20, 'H', 8.2);
		pers[2] = new Estudiante("Maria", 16, 'M', 6.3);
		pers[3] = new Estudiante("Alberta", 16, 'M', 7.3);
		pers[4] = new Estudiante("Juana", 17, 'M', 9.3);
		pers[5] = new Estudiante("Paca", 21, 'M', 1.3);
		pers[5] = new Estudiante("Ramon", 16, 'H', 3.3);
		pers[6] = new Estudiante("Maria Jose", 18, 'M', 2.6);
		pers[7] = new Estudiante("Jose Maria", 18, 'H', 9.9);
		pers[8] = new Estudiante("Diego", 20, 'H', 4.9);
		pers[9] = new Profesor("Julian", 70, 'H');

		Aula aula[] = new Aula[3];
		aula[0] = new Aula(10, 5, "matemáticas");
		aula[1] = new Aula(11, 8, "física");
		aula[2] = new Aula(12, 10, "filosofía");
		Estudiante e1 = null;
		Profesor p1 = null;
		Aula a1 = null;

		asistenciaAlumno(e1, pers);
		asistenciaProfe(p1, pers);
		randomClaseProfe(p1, pers);
		randomAula(a1, aula);
		puedeDarseClase(pers, aula, e1, p1, a1);
	}

	/**
	 * @param pers
	 * @param aula
	 * @param e1
	 * @param p1
	 * @param a1
	 */
	private static void puedeDarseClase(Persona[] pers, Aula[] aula, Estudiante e1, Profesor p1, Aula a1) {
		String profe;
		int alumnosVienen = 0;
		int alumnoAprobado = 0;
		int alumnaAprobada = 0;
		int clase = 0;
		for (Persona e : pers) {// Bucle de personas
			if (e instanceof Profesor) { // Si es profesor..
				profe = ((Profesor) e).getMaterias(); // Coger materia
				for (int j = 0; j < aula.length; j++) {
					if (profe.equals(aula[j].getDestinada())) { // Comprueba si la materia del profesor es igual a
																// alguna aula
						clase = j;
						System.out.println(e); // Imprime el profesor
						System.out.println(aula[j].toString()); // Imprime el aula
						j = aula.length; // Deja de comprobar las siguientes aulas
					}
				}
			}
			if (e instanceof Estudiante) { // Comprueba cuantos alumnos vienen
				if (((Estudiante) e).isDisponible()) {
					alumnosVienen++;
				}
			}
		}
		if (alumnosVienen * 2 >= aula[clase].getMaxEstudiantes() && alumnosVienen <= aula[clase].getMaxEstudiantes()) {
			System.out.println("Vienen " + alumnosVienen);// Imprime cuantos estudiantes vienen
			for (Persona e : pers) {
				if (e instanceof Estudiante) {
					if (((Estudiante) e).isDisponible() && e.getSexo() == 'H'
							&& ((Estudiante) e).getCalificacion() >= 5) {
						alumnoAprobado++;
					} else if (((Estudiante) e).isDisponible() && e.getSexo() == 'M'
							&& ((Estudiante) e).getCalificacion() >= 5) {
						alumnaAprobada++;
					}
				}
			}
			System.out.println("Por ahora hay aprobados " + alumnoAprobado + " chicos"); // Imprime chicos aprobados
			System.out.println("Por ahora hay aprobadas " + alumnaAprobada + " chicas");// Imprime chicas aprobadas

		} else {
			System.out.println("No hay suficientes alumnos, són solo " + alumnosVienen);
		}
	}

	/**
	 * @param a1
	 * @param aula
	 */
	private static void randomAula(Aula a1, Aula[] aula) {
		for (Aula e : aula) {
			if (e instanceof Aula) {
				int numero = (int) (Math.random() * 3);
				if (numero == 0) {
					((Aula) e).setDestinada("matemáticas");
				} else if (numero == 1) {
					((Aula) e).setDestinada("filosofía");
				} else {
					((Aula) e).setDestinada("física");
				}
			}
		}

	}

	/**
	 * @param p1
	 * @param pers
	 */
	private static void randomClaseProfe(Profesor p1, Persona[] pers) {
		for (Persona e : pers) {
			if (e instanceof Profesor) {
				int numero = (int) (Math.random() * 3);
				if (numero == 0) {
					((Profesor) e).setMaterias("matemáticas");
				} else if (numero == 1) {
					((Profesor) e).setMaterias("filosofía");
				} else {
					((Profesor) e).setMaterias("física");
				}
			}
		}

	}

	/**
	 * @param p1
	 * @param pers
	 * 
	 *             Creamos un bucle que ponga la asistencia de los alumnos al 20%
	 */
	private static void asistenciaProfe(Profesor p1, Persona[] pers) {
		for (Persona e : pers) {
			if (e instanceof Profesor) {
				p1 = (Profesor) e;
				int numero = (int) (Math.random() * 6);
				if (numero == 0) {
					p1.setDisponible(false);
				} else {
					p1.setDisponible(true);
				}
			}
		}

	}

	/**
	 * @param l1
	 * @param pers
	 * 
	 *             Creamos un bucle que ponga la asistencia de los alumnos al 50%
	 */
	private static void asistenciaAlumno(Estudiante e1, Persona[] pers) {
		for (Persona e : pers) {
			if (e instanceof Estudiante) {
				e1 = (Estudiante) e;
				int numero = (int) (Math.random() * 2);
				if (numero == 0) {
					e1.setDisponible(false);
				} else {
					e1.setDisponible(true);
				}
			}
		}

	}
}
