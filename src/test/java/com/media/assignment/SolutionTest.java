package com.media.assignment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Solution class.
 */
public class SolutionTest extends TestCase {
	protected final ByteArrayOutputStream os = new ByteArrayOutputStream();
	protected final PrintStream ps = System.out;

	@Before
	public void setUp() {
		System.setOut(new PrintStream(os));
	}

	@After
	public void tearDown() {
		System.setOut(ps);
	}

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
