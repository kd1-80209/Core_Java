package com.sunbeam;

import java.util.Scanner;

public class DrivingCostCalculator {
    public static void main(String[] args) {
    	double totalMilesDriven;
    	double costPerGallon;
    	double averageMilesPerGallon;
    	double parkingFees;
    	double tollsPerDay;
    	double fuelCost;
    	double totalCostPerDay;
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        totalMilesDriven = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: $");
        costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        averageMilesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: $");
        parkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: $");
        tollsPerDay = sc.nextDouble();

        
        fuelCost = (totalMilesDriven / averageMilesPerGallon) * costPerGallon;
        totalCostPerDay = fuelCost + parkingFees + tollsPerDay;

        System.out.println("Your daily driving cost is: $" + totalCostPerDay);
        System.out.println("Your daily driving cost is: $" + fuelCost);
    
    }
}
