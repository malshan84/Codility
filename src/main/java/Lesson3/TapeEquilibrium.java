package Lesson3;

import java.util.Arrays;

//https://app.codility.com/demo/results/training84S6N4-VS6/
public class TapeEquilibrium {
	public int getMinimalDifference(int[] A){

		int sumFront = 0;
		int minDiff = Integer.MAX_VALUE;
		int sumBack = Arrays.stream(A).sum();

		for(int i = 0; i < A.length-1; i++) {
			sumFront+=A[i];
			sumBack-=A[i];
			int diff = Math.abs(sumFront - sumBack);
			if(minDiff > diff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
}
