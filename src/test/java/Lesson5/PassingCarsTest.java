package Lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PassingCarsTest {

	PassingCars passingCars = new PassingCars();

	@Test
	void test1() {
//		A[0] = 0
//		A[1] = 1
//		A[2] = 0
//		A[3] = 1
//		A[4] = 1
		assertThat(passingCars.solution(new int[]{0,1,0,1,1}))
				.isEqualTo(5);
	}

	@Test
	void test2() {
//		A[0] = 1
//		A[1] = 0
		assertThat(passingCars.solution(new int[]{1,0}))
				.isEqualTo(0);
	}
}