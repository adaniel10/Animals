package com.fdmgroup.animals;

public class Animal {
	
	private String name;
	private String color;
	private int numOfLegs;
	protected int weight;
	
	public Animal(String name, String color, int numOfLegs, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		
		if(numOfLegs < 0)
			throw new IllegalNumberOfLegsException("Legs cannot be less than zero!");
		else
			this.numOfLegs = numOfLegs;
	}
	
	public void makeNoise() {
		System.out.println("GENERIC NOISE");
	}

}
