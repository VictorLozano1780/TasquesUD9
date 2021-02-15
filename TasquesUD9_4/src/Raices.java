/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Raices {
	private int a;
	private int b;
	private int c;

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}

	public void obtenerRaices(double num1, double num2) {
		System.out.println(num1);
		System.out.println(num2);
	}

	public void obtenerRaiz(double num1) {
		System.out.println(num1);
	}

	public double getDiscriminante(int a, int b, int c) {
		return b* b - 4 * a * c;
	}

	public boolean tieneRaices(int a, int b, int c) {
		if (getDiscriminante(a, b, c) > 0) {
			return true;
		}
		return false;
	}

	public boolean tieneRaiz(int a, int b, int c) {
		if (getDiscriminante(a, b, c) == 0) {
			return true;
		}
		return false;
	}

	public void calcular(int a, int b, int c) {
		double x1, x2;
		if (tieneRaices(a, b, c)) {
			x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			obtenerRaices(x1, x2);
		} else if (tieneRaiz(a, b, c)) {
			x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			obtenerRaiz(x1);
		} else {
			System.out.println("No tiene solucion");
		}

	}
}
