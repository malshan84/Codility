package Lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MinAvgTwoSliceTest {

	MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

	@Test
	void test1() {
		assertThat(minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,8}))
				.isEqualTo(1);
	}

	@Test
	void test2() {
		assertThat(minAvgTwoSlice.solution(new int[]{-3, -5, -8, -4, -10}))
				.isEqualTo(2);
	}
}