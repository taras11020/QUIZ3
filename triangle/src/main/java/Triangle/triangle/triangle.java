package Triangle.triangle;

public class triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public triangle() {
		side1 = 1.0;
		side2 = 1.0;
	    side3 = 1.0;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public triangle(double sidea, double sideb, double sidec) {
		this.side1 = sidea;
		this.side2 = sideb;
		this.side3 = sidec;
	}


	@Override
	public double getPerimeter() {
		double p = side1 + side2 + side3;
		return p;
	}

	@Override
	public double getArea() {
		double t = getPerimeter() / 2;
		return Math.sqrt(t * ((t - side1) * (t - side2) * (t - side3)));
	}

	public String toString() {
		return "Triangle has the following dimensions: Side1=" + side1 + "Side2=" + side2 + "Side3=" + side3;
	}

	}
