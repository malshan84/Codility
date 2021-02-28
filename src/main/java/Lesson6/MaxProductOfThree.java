package Lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
	public int solution(int[] A){
		Arrays.sort(A);

		int result = Integer.MIN_VALUE;
		int i = A.length-1;
		result = Integer.max(result, A[0]*A[1]*A[2]);
		result = Integer.max(result, A[0]*A[1]*A[i]);
		result = Integer.max(result, A[i]*A[i-1]*A[i-2]);

		return result;
	}
}