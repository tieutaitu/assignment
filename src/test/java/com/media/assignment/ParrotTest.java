package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Parrot class.
 */
public class ParrotTest extends AbstractTest {

	@Test
	public void test_parrot_can_sing() {
		Parrot parrot = new Parrot();

		parrot.sing();
		assertEquals("I am singing\n", os.toString());
	}

	@Test
	public void test_parrot_can_walk() {
		Parrot parrot = new Parrot();

		parrot.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_parrot_say_with_dog_neighbor() {
		Dog dog = new Dog();
		Parrot parrot = new Parrot();

		parrot.setNeighbor(dog);
		parrot.say();
		assertEquals("Woof, woof\n", os.toString());
	}
	
	@Test
	public void test_parrot_say_with_cat_neighbor() {
		Cat cat = new Cat();
		Parrot parrot = new Parrot();

		parrot.setNeighbor(cat);
		parrot.say();
		assertEquals("Meow\n", os.toString());
	}
	
	@Test
	public void test_parrot_say_with_rooster_neighbor() {
		Rooster rooster = new Rooster();
		Parrot parrot = new Parrot();

		parrot.setNeighbor(rooster);
		parrot.say();
		assertEquals("Cock-a-doodle-doo\n", os.toString());
	}
}
