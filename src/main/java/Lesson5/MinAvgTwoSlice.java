package Lesson5;

public class MinAvgTwoSlice {
	public int solution(int[] A) {
		double tmp = Integer.MAX_VALUE;
		int result = 0;
		for(int i = 0; i<A.length-1; i++) {

			double avg = (A[i] + A[i+1])/2.0;
			if(avg < tmp) {
				tmp = avg;
				result = i;
			}

			if(A.length <= i+2) {
				continue;
			}

			avg = (A[i] + A[i+1] + A[i+2])/3.0;
			if(avg < tmp) {
				tmp = avg;
				result = i;
			}
		}
		return result;
	}
}

//  A[0] = 4
//	A[1] = 2
//	A[2] = 2
//	A[3] = 5
//	A[4] = 1
//	A[5] = 5
//	A[6] = 8
// (0,1), (1,2), (2,3), (3,4), (4,5), (5,6)
// (0,1,2), (1,2,3), (2,3,4), (3,4,5), (4,5,6)
// (0,1,2,3), (1,2,3,4), (2,3,4,5), (3,4,5,6)
// (0,1,2,3,4), (1,2,3,4,5), (2,3,4,5,6)
// (0,1,2,3,4,5), (1,2,3,4,5,6)
// (0,1,2,3,4,5,6)