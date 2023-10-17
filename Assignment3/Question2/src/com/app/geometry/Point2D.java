package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
	public boolean isEqual(Point2D otherPoint)
	{
		return this.x==otherPoint.x && this.y==otherPoint.y;	
	}
	public double calculateDistance(Point2D otherPoint)
	{
		  double X = this.x - otherPoint.x;
	      double Y = this.y - otherPoint.y;
	      return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
	}
	
}