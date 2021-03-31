
public class SquareGeneric {
	private double side;
	private double area;
	
	public SquareGeneric() {
		side = 0.0;
	}
	public SquareGeneric(double s) {
		side = s; 
		calculateArea();
	}
	
	protected double calculateArea() {
		area=Math.pow(side, 2);
		return area;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "SquareGenerics [side=" + side + ", area=" + area + "]";
	}
}
