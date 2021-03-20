package Lesson8;

public class EquiLeader {
	public int getCount(int[] A){
		int size = 0;
		int value = 0;
		int equiLeaderNum = 0;
		for (int a : A) {
			if (size == 0) {
				value = a;
				size++;
			} else {
				if (value != a) {
					size--;
				} else {
					size++;
				}
			}
		}

		int total = 0;
		for(int a : A){
			if(a == value) total++;
		}

		if(total <= (A.length/2)){
			return 0;
		}

		int leftCount = 0;
		for(int i=0; i<A.length; i++) {
			if(value == A[i]) {
				leftCount++;
			}
			if((leftCount > (i+1)/2) && ((total - leftCount) > ((A.length - i-1)/2))) {
				equiLeaderNum++;
			}
		}

		return equiLeaderNum;
	}
}
