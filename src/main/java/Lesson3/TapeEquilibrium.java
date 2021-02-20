package Lesson3;

public class TapeEquilibrium {
	public int solution(int[] A){
		int sum = 0;
		int result = 0;
		for(int a : A) {
			sum+=a;
		}

		int frontSum = A[0];

		for(int index=1; index<A.length-1; index++) {
			int backSum = sum - frontSum;
			int d = Math.abs(frontSum - sum + frontSum);
			if(result >= d || index == 1) {
				result = d;
			}
			frontSum+=A[index];
		}

		return result;
	}

	public static void main(String[] args) {
		int result = new TapeEquilibrium().solution(new int[]{-10, -20, -30, -40, 100});
		System.out.println(result);
	}
}
