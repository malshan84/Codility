package Lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DistinctTest {

	Distinct distinct = new Distinct();
	@Test
	void test1() {
		assertThat(distinct.solution(new int[]{2,1,1,2,3,1})).isEqualTo(3);
	}
//	A[0] = 2    A[1] = 1    A[2] = 1
//	A[3] = 2    A[4] = 3    A[5] = 1
}