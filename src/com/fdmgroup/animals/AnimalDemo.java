package com.fdmgroup.animals;

public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal", "White", 0, 100);
		animal.makeNoise();
		
		Parrot parrot = new Parrot("Paulie", "Red", 2, 60);
		parrot.fly();
		
		Elephant elephant = new Elephant("Stompy", "Grey", 4, 10);
		elephant.stomp();

	}

}
