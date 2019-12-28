package com.media.assignment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Abstract test class for general functions.
 */
public abstract class AbstractTest extends TestCase {
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
}
