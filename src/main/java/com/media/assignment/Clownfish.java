package com.media.assignment;

class Clownfish extends Fish {
	public Clownfish() {
		super("small", "orange");
	}

	@Override
	void eat() {
		System.out.println("I eat other fish");
	}
}
