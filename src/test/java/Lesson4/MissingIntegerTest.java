package Lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {
	MissingInteger missingInteger = new MissingInteger();
	@Test
	void test1() {
		assertEquals(
				5,
				missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));

	}

	@Test
	void test2() {
		assertEquals(
				4,
				missingInteger.solution(new int[]{1,2,3}));

	}

	@Test
	void test3() {
		assertEquals(
				1,
				missingInteger.solution(new int[]{-1,-2,0}));

	}

	@Test
	void test4() {
		assertEquals(
				2,
				missingInteger.solution(new int[]{1,6,4,7,-1,-4,-6,5,100,4,5,77}));

	}

	@Test
	void test5() {
		assertEquals(
				1,
				missingInteger.solution(new int[]{4, 5, 6, 2}));

	}

	@Test
	void test6() {
		assertEquals(
				1,
				missingInteger.solution(new int[]{2}));

	}

	@Test
	void test7() {
		assertEquals(
				2,
				missingInteger.solution(new int[]{1}));

	}
}