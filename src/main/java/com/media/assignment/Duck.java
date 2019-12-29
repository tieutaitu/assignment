package com.media.assignment;

public class Duck extends Bird {
	@Override
	void say() {
		System.out.println("Quack, quack");
	}

	void swim() {
		System.out.println("I am swimming");
	}
}
