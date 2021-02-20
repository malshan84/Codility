package Lesson3;

import java.util.Arrays;

//https://app.codility.com/demo/results/training84S6N4-VS6/
public class TapeEquilibrium {
	public int solution(int[] A){

		int sumFront = 0;
		int result = 0;
		int sumBack = Arrays.stream(A).sum();

		for(int i = 0; i < A.length-1; i++) {
			sumFront+=A[i];
			sumBack-=A[i];
			int tmp = Math.abs(sumFront - sumBack);
			if(i == 0 || result > tmp) {
				result = tmp;
			}
		}
		return result;
	}
}
