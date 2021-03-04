package Lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FishTest {

	Fish fish = new Fish();

	@Test
	void test1() {
		assertThat(
				fish.solution(
						new int[]{4,3,2,1,5},
						new int[]{0,1,0,0,0}
				)
		).isEqualTo(2);
	}

	@Test
	void test2() {
		assertThat(
				fish.solution(
						new int[]{4,3,2,1,5},
						new int[]{1,0,0,0,0}
				)
		).isEqualTo(1);
	}

	@Test
	void test3() {
		assertThat(
				fish.solution(
						new int[]{4,3,2,1,5},
						new int[]{1,0,0,1,0}
				)
		).isEqualTo(1);
	}

	@Test
	void test4() {
		assertThat(
				fish.solution(
						new int[]{4,3,2,1,5},
						new int[]{0,0,0,0,0}
				)
		).isEqualTo(5);
	}

	@Test
	void test5() {
		assertThat(
				fish.solution(
						new int[]{4,3,2,1,5},
						new int[]{1,1,1,1,1}
				)
		).isEqualTo(5);
	}

	@Test
	void test6() {
		assertThat(
				fish.solution(
						new int[]{4,3,7,1,5},
						new int[]{1,1,0,0,1}
				)
		).isEqualTo(3);
	}

	@Test
	void test7() {
		assertThat(
				fish.solution(
						new int[]{1,2,3,4,5},
						new int[]{1,0,1,0,0}
				)
		).isEqualTo(3);
	}

	@Test
	void test8() {
		assertThat(
				fish.solution(
						new int[]{5,4,3,2,100},
						new int[]{1,0,1,0,1}
				)
		).isEqualTo(3);
	}

	@Test
	void test9() {
		assertThat(
				fish.solution(
						new int[]{2,1},
						new int[]{0,1}
				)
		).isEqualTo(2);
	}

	@Test
	void test10() {
		assertThat(
				fish.solution(
						new int[]{2},
						new int[]{1}
				)
		).isEqualTo(1);
	}

//	A[0] = 4    B[0] = 1
//	A[1] = 3    B[1] = 1
//	A[2] = 2    B[2] = 0
//	A[3] = 1    B[3] = 1
//	A[4] = 5    B[4] = 0

// 4,2,1,5
// 3
}