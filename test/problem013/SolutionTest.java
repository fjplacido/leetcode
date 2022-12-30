package problem013;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testCase1() {
		Solution solution = new Solution();
		assertEquals(3, solution.romanToInt("III"));
	}

	@Test
	public void testCase2() {
		Solution solution = new Solution();
		assertEquals(58, solution.romanToInt("LVIII"));
	}

	@Test
	public void testCase3() {
		Solution solution = new Solution();
		assertEquals(1994, solution.romanToInt("MCMXCIV"));
	}

	@Test
	public void testCase4() {
		Solution solution = new Solution();
		assertEquals(621, solution.romanToInt("DCXXI"));
	}
}
