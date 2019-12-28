package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Solution class.
 */
public class BirdTest extends AbstractTest {

	@Test
	public void test_bird_can_fly() {
		Bird bird = new Bird();

		bird.fly();
		assertEquals("I am flying\n", os.toString());
	}

	@Test
	public void test_bird_can_sing() {
		Bird bird = new Bird();

		bird.sing();
		assertEquals("I am singing\n", os.toString());
	}

	@Test
	public void test_bird_can_walk() {
		Bird bird = new Bird();

		bird.walk();
		assertEquals("I am walking\n", os.toString());
	}
}
