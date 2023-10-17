import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter x coordinate ");
//		double x = sc.nextDouble();
//		System.out.println("Enter y coordinate ");
//		double y = sc.nextDouble();
//		System.out.println("Enter diameter ");
//		double diameter = sc.nextDouble();

		Circle c1 = new Circle();
		try {
			c1.setDiameter(-100);
			System.out.println(c1);
		} catch (DiameterIsNegativeException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
