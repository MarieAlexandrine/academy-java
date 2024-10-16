package week2;

public class Triangle {
	public int perimeterCalculator(int a, int b, int c) {
		int perimeter = a + b + c;
		return (perimeter);
	}

	public int areaCalculator(int b, int h) {
		int area = b * h / 2;
		return (area);
	}

	public static void main(String[] args) {
		Triangle object = new Triangle();
		int a = 7, b = 10, c = 35;
		int perimeter = object.perimeterCalculator(a, b, c);
		int area = object.areaCalculator(7, 10);

		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe area of the triangle is: " + area);

	}

}
