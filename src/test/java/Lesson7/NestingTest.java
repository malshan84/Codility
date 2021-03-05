package Lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NestingTest {

	Nesting nesting = new Nesting();

	@Test
	void test1() {
		assertThat(nesting.solution("(()(())())"))
				.isEqualTo(1);
	}

	@Test
	void test2() {
		assertThat(nesting.solution("(()"))
				.isEqualTo(0);
	}

	@Test
	void test3() {
		assertThat(nesting.solution("(()()())"))
				.isEqualTo(1);
	}

	@Test
	void test4() {
		assertThat(nesting.solution("(())"))
				.isEqualTo(1);
	}
}