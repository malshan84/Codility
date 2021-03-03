package Lesson7;

import java.util.Stack;

public class Brackets {
	public int solution(String S){

		if(S.isEmpty()) {
			return 1;
		}

		Stack<Character> stack = new Stack<>();
		for(char s : S.toCharArray()) {
			if(s == '{' || s == '[' || s == '(') {
				stack.push(s);
				continue;
			}

			if(stack.isEmpty() || !isPair(stack.pop(), s)) {
				return 0;
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}

	boolean isPair(char o, char c) {
		boolean result;
		switch (o) {
			case '{':
				result = c == '}';
				break;
			case '(':
				result = c == ')';
				break;
			case '[':
				result = c == ']';
				break;
			default:
				result = false;
		}
		return result;
	}
}

