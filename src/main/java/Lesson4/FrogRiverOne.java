package Lesson4;

import java.util.HashSet;

public class FrogRiverOne {
	public int getEarliestTime(int X, int[] A){
		HashSet<Integer> positions = new HashSet<>();

		for(int i = 0; i < A.length; i++) {
			positions.add(A[i]);
			if(positions.size() == X) {
				return i;
			}
		}
		return -1;
	}
}
