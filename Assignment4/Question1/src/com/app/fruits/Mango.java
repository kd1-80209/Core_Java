package com.app.fruits;

public class Mango extends Fruit {
	public Mango() {
		this("","",0.0,true);

	}

	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
		this.taste();
	}
	public String taste() {
		return "sweet";
	}

}
