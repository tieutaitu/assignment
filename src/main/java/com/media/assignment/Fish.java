package com.media.assignment;

class Fish extends Bird {

	@Override
	void sing() {
		System.out.println("I cannot sing");
	}

	@Override
	public void walk() {
		System.out.println("I cannot walk");
	}

	public void swim() {
		System.out.println("I am swimming");
	}
}
