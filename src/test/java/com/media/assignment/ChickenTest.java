package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Duck class.
 */
public class ChickenTest extends AbstractTest {

	@Test
	public void test_chicken_can_fly() {
		Duck chicken = new Duck();

		chicken.fly();
		assertEquals("I am flying\n", os.toString());
	}

	@Test
	public void test_chicken_can_sing() {
		Duck chicken = new Duck();

		chicken.sing();
		assertEquals("I am singing\n", os.toString());
	}

	@Test
	public void test_chicken_can_walk() {
		Duck chicken = new Duck();

		chicken.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_chicken_can_swim() {
		Duck chicken = new Duck();

		chicken.swim();
		assertEquals("I am swimming\n", os.toString());
	}

	@Test
	public void test_chicken_say_quack_quack() {
		Duck chicken = new Duck();

		chicken.say();
		assertEquals("Quack, quack\n", os.toString());
	}
}
