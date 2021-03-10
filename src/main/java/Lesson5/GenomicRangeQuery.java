package Lesson5;

public class GenomicRangeQuery {
	public int[] fetch(String S, int[] P, int[] Q){

		int[] A = new int[S.length()+1];
		int[] C = new int[S.length()+1];
		int[] G = new int[S.length()+1];

		for(int i = 0; i<S.length(); i++) {
			A[i+1] = S.charAt(i) == 'A' ? A[i]+1 : A[i];
			C[i+1] = S.charAt(i) == 'C' ? C[i]+1 : C[i];
			G[i+1] = S.charAt(i) == 'G' ? G[i]+1 : G[i];
		}

		int[] R = new int[P.length];
		int start;
		int end;
		for(int i = 0; i< P.length; i++) {
			start = P[i];
			end = Q[i]+1;

			if(A[start]!=A[end]) {
				R[i] = 1;
			}
			else if(C[start]!=C[end]) {
				R[i] = 2;
			}
			else if(G[start]!=G[end]) {
				R[i] = 3;
			}
			else {
				R[i] = 4;
			}
		}
		return R;
	}
}
