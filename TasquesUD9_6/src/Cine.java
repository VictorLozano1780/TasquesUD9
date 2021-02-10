
/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Cine {
	protected String pelicula;
	protected double precio;
	protected String[][] asientos = { { "8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H", "8I" },
			{ "7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H", "7I" },
			{ "6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H", "6I" },
			{ "5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H", "5I" },
			{ "4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H", "4I" },
			{ "3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H", "3I" },
			{ "2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I" },
			{ "1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I" } };
	
	public void imprimir() {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				System.out.print(asientos[i][j] + " ");
			}
			System.out.println();
		}
	}
	/**
	 * 
	 */
	public Cine() {
	}

	/**
	 * @param pelicula
	 * @param precio
	 */
	public Cine(String pelicula, double precio, String[][] asientos) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.asientos = asientos;
	}

	/**
	 * @param pelicula
	 * @param precio
	 */
	public Cine(String pelicula, double precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}

	/**
	 * @return the pelicula
	 */
	public String getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the asientos
	 */
	public String[][] getAsientos() {
		return asientos;
	}
	/**
	 * @param asientos the asientos to set
	 */
	public void setAsientos(String[][] asientos) {
		this.asientos = asientos;
	}
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";
	}
	/**
	 * @param num1
	 * @param num2
	 */
	public void setAsientos(int num1, int num2) {
		this.asientos[num1][num2] = "[]";
		// TODO Auto-generated method stub
		
	}

}
