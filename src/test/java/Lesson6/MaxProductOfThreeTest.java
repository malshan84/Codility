package Lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

	MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
	@Test
	void test1() {
		assertThat(maxProductOfThree.solution(new int[]{-3,1,2,-2,5,6})).isEqualTo(60);
	}

//	A[0] = -3
//	A[1] = 1
//	A[2] = 2
//	A[3] = -2
//	A[4] = 5
//	A[5] = 6

	// (0,1,2), (0,1,3), (0,1,4), (0,1,5)
	// (0,2,3), (0,2,4), (0,2,5)
	// (0,3,4), (0,3,5)
	// (0,4,5)
	// (1,2,3), (1,2,4), (1,2,5)
	// (1,3,4), (1,3,5)
	// (1,4,5)
	// (2,3,4), (2,3,5)
	// (2,4,5)
	// (3,4,5)

	@Test
	void test2() {
		assertThat(maxProductOfThree.solution(new int[]{-5, 5, -5, 4})).isEqualTo(125);
	}

	@Test
	void test3() {
		assertThat(maxProductOfThree.solution(new int[]{-5, -6, -4, -7, -10})).isEqualTo(-120);
	}
}