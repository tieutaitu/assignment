package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Duck class.
 */
public class DuckTest extends AbstractTest {

	@Test
	public void test_duck_can_fly() {
		Duck duck = new Duck();

		duck.fly();
		assertEquals("I am flying\n", os.toString());
	}

	@Test
	public void test_duck_can_sing() {
		Duck duck = new Duck();

		duck.sing();
		assertEquals("I am singing\n", os.toString());
	}

	@Test
	public void test_duck_can_walk() {
		Duck duck = new Duck();

		duck.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_duck_can_swim() {
		Duck duck = new Duck();

		duck.swim();
		assertEquals("I am swimming\n", os.toString());
	}

	@Test
	public void test_duck_say_quack_quack() {
		Duck duck = new Duck();

		duck.say();
		assertEquals("Quack, quack\n", os.toString());
	}
}
