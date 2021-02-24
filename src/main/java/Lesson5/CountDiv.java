package Lesson5;

public class CountDiv {
	public int solution(int A, int B, int K){

		if(K == 0) {
			return 0;
		}

		if(A == B) {
			return B%K == 0 ? 1 : 0;
		}

		int count = 0;
		if(A%K == 0) {
			count++;
		}
		count+=(B/K) - (A/K);
		return count;
	}
}
