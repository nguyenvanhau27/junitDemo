package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcultorTest {

	@Test
	public void testMul() throws Exception {
		Calcultor testSubject;
		int a = 5;
		int b = 4;
		int result;
		int expected = 20;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.mul(a, b);
		assertEquals(expected, result);
	}
	@Test
	public void testAdd() throws Exception {
		Calcultor testSubject;
		int a = 5;
		int b = 4;
		int result;
		int expected = 9;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		assertEquals(expected, result);
	}
	@Test
	public void testSub() throws Exception {
		Calcultor testSubject;
		int a = 5;
		int b = 4;
		int result;
		int expected = 1;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.sub(a, b);
		assertEquals(expected, result);
	}
	@Test
	public void testDiv() throws Exception {
		Calcultor testSubject;
		int a = 4;
		int b = 2;
		int result;
		int expected = 2;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.div(a, b);
		assertEquals(expected, result);
	}

	private Calcultor createTestSubject() {
		// TODO Auto-generated method stub
		return new Calcultor();
	}
}
