package Lesson4;

import java.util.HashSet;

public class FrogRiverOne {
	public int solution(int X, int[] A){
		HashSet<Integer> dest = new HashSet<>();

		for(int i = 0; i < A.length; i++) {
			dest.add(A[i]);
			if(dest.size() == X) {
				return i;
			}
		}
		return -1;
	}
}
