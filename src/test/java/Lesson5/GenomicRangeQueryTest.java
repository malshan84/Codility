package Lesson5;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {
	GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
	@Test
	void test1() {
		assertArrayEquals(
				new int[]{2,4,1},
				genomicRangeQuery.solution(
						"CAGCCTA",
						new int[]{2,5,0},
						new int[]{4,5,6})
		);
	}

	@Test
	void test2() {
		assertArrayEquals(
				new int[]{1},
				genomicRangeQuery.solution(
						"A",
						new int[]{0},
						new int[]{0})
		);
	}


}
//2132241