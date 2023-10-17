import java.util.Scanner;

public class JavaTest {
	public static void main(String[] args) {
		int num;
			
				System.out.println("Java Test");
		
				Scanner scan = new Scanner (System.in);
				
				System.out.print("Enter Number = ");
				num = scan.nextInt();
			
				System.out.println("Given Number = "+ num);
				
				String n1 = Integer.toBinaryString(num);
				
				System.out.println("Binary equivalent = "+ n1);
				
				String n2 = Integer.toOctalString(num);
				
				System.out.println("Octal equivalent = " + n2 );
				
				String n3 = Integer.toHexString(num);
				
				System.out.println("Hexadecimal equivalent = " + n3);
				
		}

}
