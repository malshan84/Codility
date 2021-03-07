package Lesson3;

// https://app.codility.com/demo/results/trainingYUP4RD-D66/
public class FrogJmp {
	public int getMinimalJumpCount(int X, int Y, int D) {
		return (Y-X)%D == 0 ? (Y-X)/D : ((Y-X)/D)+1;
	}
}
