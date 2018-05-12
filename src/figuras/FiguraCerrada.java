package figuras;

public abstract class FiguraCerrada {

	protected double dimension1;
	protected double dimension2;

	FiguraCerrada(double dimension1, double dimension2) throws Exception {
		setDimension1(dimension1);
		setDimension2(dimension2);
	}
	
	abstract double calcularArea();
	
	protected double getDimension1() {
		return dimension1;
	}

	private void setDimension1(double dimension1) throws DimensionNoValidaException {
		if(dimension1 <= 0) {
			throw new DimensionNoValidaException("La dimension no puede ser negativa");
		}
		this.dimension1 = dimension1;
	}

	protected double getDimension2() {
		return dimension2;
	}

	private void setDimension2(double dimension2) throws DimensionNoValidaException {
		if(dimension2 <= 0) {
			throw new DimensionNoValidaException("La dimension no puede ser negativa");
		}
		this.dimension2 = dimension2;
	}
	

	@Override
	public String toString() {
		return "[Dimension1: " + dimension1 + ", Dimension2: " + dimension2 + ", Area: "
				+ calcularArea() + "]";
	}
	
	protected double getArea() {
		return calcularArea();
	}
}
