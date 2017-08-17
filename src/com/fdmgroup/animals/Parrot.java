package com.fdmgroup.animals;

public class Parrot extends Animal {
	
	public Parrot(String name, String color, int numOfLegs, int weight) {
		super(name, color, numOfLegs, weight);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("SQWAKKKK!!!");
	}
	
	public void fly() {
			try {
				if(weight > 50)
					throw new IllegalFlyWeightException();
				else
					System.out.println("I Believe I Can Fly");
			} 
			catch (IllegalFlyWeightException e) {
				e.printStackTrace();
			}
		
	}
}
