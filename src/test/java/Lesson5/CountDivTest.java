package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountDivTest {
	CountDiv countDiv = new CountDiv();
	@Test
	void test1() {
		Assertions.assertEquals(
				3,
				countDiv.getCount(6,11,2));
	}

	@Test
	void test2() {
		Assertions.assertEquals(
				0,
				countDiv.getCount(6,11,0));
	}

	@Test
	void test3() {
		Assertions.assertEquals(
				0,
				countDiv.getCount(6,11,12));
	}

	@Test
	void test4() {
		Assertions.assertEquals(
				1,
				countDiv.getCount(0,0,11));
	}

	@Test
	void test5() {
		Assertions.assertEquals(
				0,
				countDiv.getCount(10,10,7));
	}

	@Test
	void test6() {
		Assertions.assertEquals(
				20,
				countDiv.getCount(11,345,17));
	}

	@Test
	void test7() {
		Assertions.assertEquals(
				8,
				countDiv.getCount(0,14,2));
	}
}