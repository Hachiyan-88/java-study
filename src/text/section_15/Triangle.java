package text.section_15;

public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3 ) {
		if (side1 + side2 <= side3 ||
				side2 + side3 <= side1 ||
				side3 + side1 <= side2) {
				throw new IllegalArgumentException("三角形が成立しません");
		}
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s * (s - side1) * (s- side2) * (s-side3));
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4,5);
		double area = t.calculateArea();
		System.out.println("3,4,5の三角形の面積は" + area);
	}

}
