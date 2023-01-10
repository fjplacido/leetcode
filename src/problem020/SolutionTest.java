package problem020;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testCase1() {
		Solution solution = new Solution();
		String input = "()";
		assertTrue(solution.isValid(input));
	}

	@Test
	public void testCase2() {
		Solution solution = new Solution();
		String input = "()[]{}";
		assertTrue(solution.isValid(input));
	}

	@Test
	public void testCase3() {
		Solution solution = new Solution();
		String input = "(]";
		assertTrue(!solution.isValid(input));
	}

}
