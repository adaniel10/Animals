package com.fdmgroup.animals;

public class Elephant extends Animal {

	public Elephant(String name, String color, int numOfLegs, int weight) {
		super(name, color, numOfLegs, weight);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("NYOOOOOOO!!!");
	}
	
	public void stomp() {
			try {
				if(weight < 100)
					throw new IllegalStompWeightException();
				else
					System.out.println("STOMP STOMP STOMP!");
			} catch (IllegalStompWeightException e) {
				e.printStackTrace();
			} finally {
				System.out.println("in the finally block");
			}		
	}
	
}
