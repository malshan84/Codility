package Lesson5;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q){

		int[] A = new int[S.length()+1];
		int[] C = new int[S.length()+1];
		int[] G = new int[S.length()+1];

		for(int i = 0; i<S.length(); i++) {
			A[i+1] = S.charAt(i) == 'A' ? A[i]+1 : A[i];
			C[i+1] = S.charAt(i) == 'C' ? C[i]+1 : C[i];
			G[i+1] = S.charAt(i) == 'G' ? G[i]+1 : G[i];
		}

		int[] R = new int[P.length];
		int p;
		int q;
		for(int i = 0; i< P.length; i++) {
			p = P[i];
			q = Q[i];

			if(A[p]<A[q+1]) {
				R[i] = 1;
				continue;
			}

			if(C[p]<C[q+1]) {
				R[i] = 2;
				continue;
			}

			if(G[p]<G[q+1]) {
				R[i] = 3;
				continue;
			}

			R[i] = 4;
		}
		return R;
	}
}
