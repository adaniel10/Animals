package com.fdmgroup.animals;

public class IllegalStompWeightException extends Exception{

	public IllegalStompWeightException() {
		super("Not heavy enough to stomp");
	}
}
