package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Rooster class.
 */
public class RoosterTest extends AbstractTest {

	@Test
	public void test_rooster_can_sing() {
		Rooster rooster = new Rooster();

		rooster.sing();
		assertEquals("I am singing\n", os.toString());
	}

	@Test
	public void test_rooster_can_walk() {
		Rooster rooster = new Rooster();

		rooster.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_rooster_say_cook_a_doodle_doo() {
		Rooster rooster = new Rooster();

		rooster.say();
		assertEquals("Cock-a-doodle-doo\n", os.toString());
	}
}
