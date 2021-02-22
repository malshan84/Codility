package Lesson4;

import java.util.Arrays;

public class MissingInteger {
	public int solution(int[] A){

		Arrays.sort(A);
		if(A[A.length-1] <= 0) {
			return 1;
		}

		int prev = 0;

		for(int a : A) {
			if(a<=0) {
				continue;
			}

			if(prev == a) {
				continue;
			}

			if(a-prev != 1) {
				return prev+1;
			}
			prev = a;
		}

		return A[A.length-1] + 1;
	}
}
