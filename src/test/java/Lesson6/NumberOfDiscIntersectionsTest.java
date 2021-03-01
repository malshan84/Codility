package Lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfDiscIntersectionsTest {

	NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
	@Test
	void test1() {
		assertThat(numberOfDiscIntersections.solution(new int[]{1,5,2,1,4,0})).isEqualTo(11);
	}

	@Test
	void test2() {
		assertThat(numberOfDiscIntersections.solution(new int[]{1,1,1})).isEqualTo(3);
	}

	@Test
	void test3() {
		assertThat(
				numberOfDiscIntersections.solution(new int[]{1, 2147483647, 0}))
				.isEqualTo(2);
	}


}