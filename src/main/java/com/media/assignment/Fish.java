package com.media.assignment;

class Fish extends Bird {
	private String size;
	private String color;

	public Fish() {
		super();
	}

	protected Fish(String size, String color) {
		super();
		this.setSize(size);
		this.setColor(color);
	}
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
