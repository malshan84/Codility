package Lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StoneWallTest {

	StoneWall stoneWall = new StoneWall();


//	H[0] = 8    H[1] = 8    H[2] = 5
//	H[3] = 7    H[4] = 9    H[5] = 8
//	H[6] = 7    H[7] = 4    H[8] = 8
//
//4 8
//5
	@Test
	void test1() {
		assertThat(
				stoneWall.getMinNumOfBlocks(new int[]{8,8,5,7,9,8,7,4,8})
		).isEqualTo(7);
	}
}