package Lesson4;

import java.util.Arrays;

public class PermCheck {
	public int solution(int[] A){
		Arrays.sort(A);

		int prev = 0;

		for (int a : A) {
			if (prev + 1 != a) {
				return 0;
			}
			prev = a;
		}

		return 1;
	}
}
