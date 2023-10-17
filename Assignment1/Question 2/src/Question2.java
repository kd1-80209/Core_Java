import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Value 1 = ");
		if (scan.hasNextDouble() != scan.hasNextInt())
		{
			double n1 = scan.nextDouble();
			System.out.println("Number 1 = " + n1); 
			
			System.out.print("Enter Value 2 = ");
 			if(scan.hasNextDouble() != scan.hasNextInt())
           {
 				double n2 = scan.nextDouble();
 				System.out.println("Number 2 =" + n2);
        	   
 				System.out.println("Average = " + (n1 + n2)/2);
           }
 			else 
 				
 				System.out.println("Entered Values are not of Double Type");
		}
		else 
			System.out.println("Invalid Input");
		
	
		}

}
