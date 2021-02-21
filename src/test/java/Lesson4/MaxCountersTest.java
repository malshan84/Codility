package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountersTest {

	MaxCounters maxCounters = new MaxCounters();
	@Test
	void test1() {
		Assertions.assertArrayEquals(
				new int[]{3,3,3,4,3},
				maxCounters.solution(5, new int[]{3,4,4,6,1,6,4}));
	}

	@Test
	void test2() {
		Assertions.assertArrayEquals(
				new int[]{3, 2, 2, 4, 2},
				maxCounters.solution(5, new int[]{3,4,4,6,1,4,4}));
	}

	@Test
	void test3() {
		Assertions.assertArrayEquals(
				new int[]{1 ,1 ,1 ,1 ,1},
				maxCounters.solution(5, new int[]{1,6,6,6,6,6,6}));
	}
}