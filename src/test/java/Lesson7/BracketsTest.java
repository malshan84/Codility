package Lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BracketsTest {

	Brackets brackets = new Brackets();
	@Test
	void test1() {
		assertThat(brackets.solution("{[()()]}")).isEqualTo(1);
	}

	@Test
	void test2() {
		assertThat(brackets.solution("{[()()}")).isEqualTo(0);
	}

	@Test
	void test3() {
		assertThat(brackets.solution("")).isEqualTo(1);
	}

	@Test
	void test4() {
		assertThat(brackets.solution("{[((")).isEqualTo(0);
	}

	@Test
	void test5() {
		assertThat(brackets.solution("))]}")).isEqualTo(0);
	}

	@Test
	void test6() {
		assertThat(brackets.solution("{[())]}")).isEqualTo(0);
	}
}