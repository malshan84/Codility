package Lesson7;

import java.util.Stack;

public class StoneWall {
	public int getMinNumOfBlocks(int[] H){
		Stack<Integer> stack = new Stack<>();
		int numOfBlocks = 0;
		for(int h : H) {
			while (!stack.isEmpty() && stack.peek() > h) {
				stack.pop();
				numOfBlocks++;
			}

			if(stack.isEmpty() || stack.peek() < h) {
				stack.push(h);
			}
		}
		return numOfBlocks+stack.size();
	}
}
