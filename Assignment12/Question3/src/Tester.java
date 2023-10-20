import java.util.Scanner;

public class Tester {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.print("Enter Your Choice = ");
		int choice = scan.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner scan = new Scanner(System.in);
		while ((choice = menu()) != 0) {

			switch (choice) {
			case 1: // Addition
				System.out.print("Enter Number 1 = ");
				double x = scan.nextDouble();
				System.out.print("Enter Number 2 = ");
				double y = scan.nextDouble();
				calculate(x, y, (n1, n2) -> n1 + n2);

				break;
			case 2:// Subtraction

				System.out.print("Enter Number 1 = ");
				double a = scan.nextDouble();
				System.out.print("Enter Number 2 = ");
				double c = scan.nextDouble();
				calculate(a, c, (n1, n2) -> n1 - n2);

				break;
			case 3:// Multiplication

				System.out.print("Enter Number 1 = ");
				double o = scan.nextDouble();
				System.out.print("Enter Number 2 = ");
				double p = scan.nextDouble();
				calculate(o, p, (n1, n2) -> n1 * n2);

				break;
			case 4:// Division

				System.out.print("Enter Number 1 = ");
				double w = scan.nextDouble();
				System.out.print("Enter Number 2 = ");
				double q = scan.nextDouble();
				calculate(w, q, (n1, n2) -> n1 / n2);

				break;

			default:// Invalid Input
				System.out.println("Plz Enter Valid Choice");
				break;
			}
			System.out.println("Menu Driven is Ended ");

		}
	}

}
