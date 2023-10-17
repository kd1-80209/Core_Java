package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {
	
    public static void main(String[] args) {
    	int numPoints;
    	double x,y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points to plot: ");
        numPoints = scanner.nextInt();

        Point2D[] points = new Point2D[numPoints];

        for (int i = 0; i < numPoints; i++) {
            System.out.print("Enter x-coordinate for point " + (i + 1) + ": ");
            x = scanner.nextDouble();
            System.out.print("Enter y-coordinate for point " + (i + 1) + ": ");
            y = scanner.nextDouble();

            points[i] = new Point2D(x, y);
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between specified points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	int index; 
                    System.out.print("Enter the index of the point: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < numPoints) {
                        System.out.println("Point " + index + " details: " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index. Please retry.");
                    }
                    break;

                case 2:
                    System.out.println("Coordinates of all points:");
                    for (int i = 0; i < numPoints; i++) {
                        System.out.println("Point " + i + " details: " + points[i].getDetails());
                    }
                    break;

                case 3:
                	double distance; 
                	int endIndex; 
                    System.out.print("Enter the index of the start point: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the index of the end point: ");
                    endIndex = scanner.nextInt();

                    if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
                        if (!points[startIndex].isEqual(points[endIndex])) {
                            distance = points[startIndex].calculateDistance(points[endIndex]);
                            System.out.println("Distance between point " + startIndex + " and point " + endIndex + ": " + distance);
                        } else {
                            System.out.println("Points are located at the same position.");
                        }
                    } else {
                        System.out.println("Invalid indices. Please retry.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please retry.");
                    break;
            }
        } while (choice != 4);

    }
}
