public class Circle {
	private double x;// x-coordinate
	private double y;// y-coordinate
	private double diameter;

	public Circle() {
		this(0, 0, 100);
	}

	public Circle(double x, double y, double diameter) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws DiameterIsNegativeException {

		if (diameter >= 0.0) {

			this.diameter = diameter;
		} else
			// throw new DiameterIsNegativeException();
			throw new DiameterIsNegativeException("The diameter should be non negative");
	}


	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", diameter=" + diameter + "]";
	}

}
