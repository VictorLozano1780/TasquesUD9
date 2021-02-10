/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Electrodomestico {
	final private double PRECIO_BASE = 100;
	final private String COLOR = "blanco";
	final private char CONSUMO = 'F';
	final private double PESO = 5;

	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;

	/**
	 * 
	 */
	public Electrodomestico() {
		super();
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
		} else {
			letra = CONSUMO;
		}
	}

	public String comprobarColor(String color) {
		if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
				&& !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
			color = "blanco";
		}
		return color;
	}

	public double precioFinal() {
		double precioFinal = this.precioBase;

		switch (this.consumo) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}

		if (this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}

		return precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color
				+ ", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
}
