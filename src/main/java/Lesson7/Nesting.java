package Lesson7;

import java.util.Stack;

public class Nesting {
	public int solution(String S){
		Stack<Character> stack = new Stack<>();
		for(char c : S.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			}else{
				if(stack.isEmpty()) {
					return 0;
				}
				stack.pop();
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}
}
