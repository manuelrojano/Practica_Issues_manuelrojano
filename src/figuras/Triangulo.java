package figuras;

public class Triangulo extends FiguraCerrada {

	public Triangulo(double dimension1, double dimension2) throws Exception {
		super(dimension1, dimension2);
	}

	@Override
	protected double calcularArea() {
		return (dimension1 * dimension2 / 2);
	}

	@Override
	public String toString() {
		return "Triangulo " + super.toString();
	}
	
}
