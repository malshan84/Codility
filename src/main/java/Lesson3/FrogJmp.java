package Lesson3;

// https://app.codility.com/demo/results/trainingYUP4RD-D66/
public class FrogJmp {
	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		int k = (Y-X)%D == 0 ? (Y-X)/D : ((Y-X)/D)+1;
		return k;
	}

	public static void main(String[] args) {
		int result = new FrogJmp().solution(10,20,30);
		System.out.println(result);
	}
}
