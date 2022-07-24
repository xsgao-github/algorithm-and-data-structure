package ads.java.blind75;

import java.util.Stack;

public class LC0020ValidParentheses {
	public boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (char chr : str.toCharArray()) {
			if (chr == '(' || chr == '[' || chr == '{') {
				stack.push(chr);
			} else {
				// no open parentheses
				if (stack.size() == 0) {
					return false;
				}

				// non-match parentheses
				char c = stack.pop();
				if (c == '(' && chr != ')' || c == '[' && chr != ']' || c == '{' && chr != '}') {
					return false;
				}
			}
		}

		// no closing parentheses
		if (stack.size() > 0) {
			return false;
		}

		return true;
	}
}
