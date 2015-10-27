package com.capgemini.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathematicalOperationsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAbs() {
		assertNotEquals(0, MathematicalOperations.abs(Integer.MIN_VALUE));
		assertNotEquals(Integer.MIN_VALUE, MathematicalOperations.abs(Integer.MIN_VALUE));
		for (int i = 0; i < 12; ++i) {
			int pow2 = (int) Math.pow(2, i);
			assertEquals(pow2, MathematicalOperations.abs(-pow2));
		}
	}

	@Test
	public void testNumberIsParity() {
		// given
		int number = 6;

		// when
		boolean result = MathematicalOperations.parityNumber(number);
		// then
		Assertions.assertThat(result).isTrue();
	}

	@Test
	public void testNumberIsNotParity() {
		// given
		int number = 5;

		// when
		boolean result = MathematicalOperations.parityNumber(number);
		// then
		Assertions.assertThat(result).isFalse();
	}

	@Test
	public void maxIntegerValueExponentiationTest() {

		// given
		int number = Integer.MAX_VALUE;

		// when
		long result = MathematicalOperations.exponentiation(number);
		// then
		Assertions.assertThat(result).isEqualTo(4611686014132420608L);

	}
	@Test
	public void minIntegerValueExponentiationTest() {

		// given
		int number = Integer.MIN_VALUE;

		// when
		long result = MathematicalOperations.exponentiation(number);
		// then
		Assertions.assertThat(result).isEqualTo(4611686018427387904L);

	}

}
