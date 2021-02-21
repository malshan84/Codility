package Lesson4;

import java.util.Arrays;

public class MaxCounters {
	public int[] solution(int N, int[] A){
		int max = Integer.MIN_VALUE;
		int maxCounter = 0;
		int[] result = new int[N];
		Arrays.fill(result, 0);

		for (int a : A) {
			if (a > N) {
				maxCounter = max;
				continue;
			}

			if (result[a-1] < maxCounter) {
				result[a-1] = maxCounter;
			}

			result[a-1] ++;

			if (result[a-1] > max) {
				max = result[a-1];
			}
		}

		for(int i = 0; i < result.length; i++) {
			if(result[i] < maxCounter) {
				result[i] = maxCounter;
			}
		}

		return result;
	}
}
