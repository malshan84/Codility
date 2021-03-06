package Lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {

	StoneWall stoneWall = new StoneWall();


//	H[0] = 8    H[1] = 8    H[2] = 5
//	H[3] = 7    H[4] = 9    H[5] = 8
//	H[6] = 7    H[7] = 4    H[8] = 8
// 8 8 5 7 9 8 7 4 8
// - - 5 7 8
//	   1 2 3 4 5 6 7

	@Test
	void test1() {
		assertThat(
				stoneWall.solution(new int[]{8,8,5,7,9,8,7,4,8})
		).isEqualTo(7);
	}
}