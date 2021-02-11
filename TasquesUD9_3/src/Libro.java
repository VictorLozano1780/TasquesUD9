/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPags;
	
	
	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numPags
	 */
	public Libro(String isbn, String titulo, String autor, int numPags) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the numPags
	 */
	public int getNumPags() {
		return numPags;
	}
	/**
	 * @param numPags the numPags to set
	 */
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPags + " páginas"; 
	}
	
	public boolean compareTo(Object a) {
		if(this.numPags < (int)a) {
			return true;
		}return false;
		
		
		
	}
	
}
