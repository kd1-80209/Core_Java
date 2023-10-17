import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String string;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter String = ");
		string = scan.nextLine();
		try {
			if (string.length() > 80)
				throw new ExceptionLineTooLong("Error",1000,"String should not be longer than 80");
		} catch (ExceptionLineTooLong e) {
		e.printStackTrace();
		}

//		System.out.println("Entered String is = " + string);
//		System.out.println("Entered String Length = "+string.length());

	}

}
