package Lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {
	TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

	@Test
	void test1() {
		Assertions.assertEquals(
				1,
				tapeEquilibrium.getMinimalDifference(new int[]{3,1,2,4,3})
		);
	}

	@Test
	void test2(){
		Assertions.assertEquals(
				20,
				tapeEquilibrium.getMinimalDifference(new int[]{-10, -20, -30, -40, 100})
		);
	}

	@Test
	void test3(){
		Assertions.assertEquals(
				2,
				tapeEquilibrium.getMinimalDifference(new int[]{-1,1})
		);
	}

	@Test
	void test4(){
		Assertions.assertEquals(
				1,
				tapeEquilibrium.getMinimalDifference(new int[]{1, 1, 3})
		);
	}
}