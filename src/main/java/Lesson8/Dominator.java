package Lesson8;

public class Dominator {
	public int getDominatorNum(int[] A){
		int size = 0;
		int value = 0;
		for(int a : A) {
			if(size == 0) {
				value = a;
				size++;
			}else{
				if(value != a) {
					size--;
				}else{
					size++;
				}
			}
		}

		int candidate = -1;
		if(size>0) {
			candidate = value;
		}
		int count = 0;
		int dominatorIndex = 0;
		for(int i=0; i<A.length; i++) {
			if(candidate == A[i]) {
				count++;
				dominatorIndex = i;
			}
		}

		if(count > A.length/2) {
			return dominatorIndex;
		}

		return -1;
	}
}
