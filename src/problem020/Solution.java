package problem020;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();

		String s1 = "(])";
		System.out.println("Input: " + s1 + ", -> " + solution.isValid(s1));
	}

	public boolean isValid(String s) {

		Stack<String> stack = new Stack<>();

		for (char c : s.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				stack.push(String.valueOf(c));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (c == ')' && stack.peek().equals("(")) {
					stack.pop();
				} else if (c == '}' && stack.peek().equals("{")) {
					stack.pop();
				} else if (c == ']' && stack.peek().equals("[")) {
					stack.pop();
				} else {
					stack.push(String.valueOf(c));
				}
			}
		}
		return stack.isEmpty();
	}

}