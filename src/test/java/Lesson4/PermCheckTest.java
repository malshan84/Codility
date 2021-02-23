package Lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {
	PermCheck permCheck = new PermCheck();
	@Test
	void test1() {
		assertEquals(
				1,
				permCheck.solution(new int[]{4,1,3,2}));
	}

	@Test
	void test2() {
		assertEquals(
				0,
				permCheck.solution(new int[]{4,1,3}));
	}

	@Test
	void test3() {
		assertEquals(
				1,
				permCheck.solution(new int[]{1}));
	}

	@Test
	void test4() {
		assertEquals(
				0,
				permCheck.solution(new int[]{4}));
	}
}