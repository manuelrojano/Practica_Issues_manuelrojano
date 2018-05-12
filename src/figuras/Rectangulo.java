package figuras;

public class Rectangulo extends FiguraCerrada{
	
	Rectangulo(double dimension1, double dimension2) throws Exception {
		super(dimension1, dimension2);
	}

	@Override
	protected double calcularArea() {
		double area = dimension1 * dimension2;
		return area;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo " + super.toString();
	}
}
