package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

	FrogRiverOne frogRiverOne = new FrogRiverOne();

	@Test
	void test1() {
		Assertions.assertEquals(
				6,
				frogRiverOne.getEarliestTime(5,new int[]{1,3,1,4,2,3,5,4})
		);
	}

	@Test
	void test2() {
		Assertions.assertEquals(
				0,
				frogRiverOne.getEarliestTime(1,new int[]{1})
		);
	}
}