public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		// Default to square of side length 1
		n = 4;
		side = 1.0;
		x = 0.0;
		y = 0.0;
	}

	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;

		x = 0.0;
		y = 0.0;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
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

	public double getPerimeter() {
		return side * n;
	}

	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}

	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println(
			"Polygon 1 has " 
			+ polygon1.getN() 
			+ " sides that are " 
			+ polygon1.getSide() 
			+ " units long."
		);
		System.out.println(
			"Polygon 1 has a perimeter of " 
			+ polygon1.getPerimeter() 
			+ " and and area of " 
			+ polygon1.getArea() 
			+ "."
		);

		System.out.println(""); // New line

		System.out.println(
			"Polygon 2 has " 
			+ polygon2.getN() 
			+ " sides that are " 
			+ polygon2.getSide() 
			+ " units long."
		);
		System.out.println(
			"Polygon 2 has a perimeter of " 
			+ polygon2.getPerimeter() 
			+ " and and area of " 
			+ polygon2.getArea() 
			+ "."
		);

		System.out.println(""); // New line

		System.out.println(
			"Polygon 3 has " 
			+ polygon3.getN() 
			+ " sides that are " 
			+ polygon3.getSide() 
			+ " units long."
		);
		System.out.println(
			"Polygon 3 has a perimeter of " 
			+ polygon3.getPerimeter() 
			+ " and and area of " 
			+ polygon3.getArea() 
			+ "."
		);
	}
}