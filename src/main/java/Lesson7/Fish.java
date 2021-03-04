package Lesson7;

import java.util.Stack;

public class Fish {
	public int solution(int[] A, int[] B){
		Stack<Integer> stack = new Stack<>();
		int N = A.length;
		int live = 0;
		for(int i=0; i<N; i++) {

			if (B[i] == 0) {
				if(stack.empty()) {
					live++;
				}else{
					while(!stack.empty()){
						if( stack.peek() > A[i]) {
							break;
						}else{
							stack.pop();
						}
					}
					if(stack.empty()) {
						live++;
					}
				}


			}else{
				stack.push(A[i]);
			}

		}
		return stack.size()+live;
	}
}
