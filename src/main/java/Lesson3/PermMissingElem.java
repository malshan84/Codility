package Lesson3;
// https://app.codility.com/demo/results/trainingK53ZGV-Z45/
public class PermMissingElem {
	public int getMissingElement(int[] A) {
		int sumOfElements = 0;
		int sumOfIntegersToRange = A.length+1;

		for(int i=0; i<A.length; i++) {
			sumOfElements+=A[i];
			sumOfIntegersToRange+=i+1;
		}
		return sumOfIntegersToRange-sumOfElements;
	}
}
