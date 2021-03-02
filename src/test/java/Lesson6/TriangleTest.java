package Lesson6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

	Triangle triangle = new Triangle();

//	A[0] = 10    A[1] = 2    A[2] = 5
//	A[3] = 1     A[4] = 8    A[5] = 20
//  1,2,5,8,10,20
// (10,5,8)
	@Test
	void test1() {
		assertThat(triangle.solution(new int[]{10,2,5,1,8,20})).isEqualTo(1);
	}

//	A[0] = 10    A[1] = 50    A[2] = 5
//	A[3] = 1
//	the function should return 0.
// 50,10,5,1
	@Test
	void test2() {
		assertThat(triangle.solution(new int[]{10,50,5,1})).isEqualTo(0);
	}

// 5,3,3 => 1
// 3,3,5
	@Test
	void test3() {
		assertThat(triangle.solution(new int[]{5,3,3})).isEqualTo(1);
	}
//1, 1, 1, 1, 5, 5, 5 => 1

	@Test
	void test4() {
		assertThat(triangle.solution(new int[]{1, 1, 1, 1, 5, 5, 5})).isEqualTo(1);
	}
}