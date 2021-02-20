package Lesson3;
// https://app.codility.com/demo/results/trainingK53ZGV-Z45/
public class PermMissingElem {
	public int solution(int[] A) {
		int sumA = 0;
		int total = A.length+1;

		for(int i=0; i<A.length; i++) {
			sumA+=A[i];
			total+=i+1;
		}
		return total-sumA;
	}

	public static void main(String[] args) {
		int result = new PermMissingElem().solution(new int[]{2,3,1,6,7,8,4});
		System.out.println(result);
	}
}
