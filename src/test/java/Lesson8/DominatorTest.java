package Lesson8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DominatorTest {

	Dominator dominator = new Dominator();

	@Test
	void test01() {
		assertThat(
				dominator.getDominatorNum(new int[]{3,2,3,-1,3,4,3,5,3})
		).isEqualTo(8);
	}

	@Test
	void test02() {
		assertThat(
				dominator.getDominatorNum(new int[]{1,1,1,1,2,2,2})
		).isEqualTo(3);
	}

	@Test
	void test03() {
		assertThat(
				dominator.getDominatorNum(new int[]{})
		).isEqualTo(-1);
	}

	@Test
	void test04() {
		assertThat(
				dominator.getDominatorNum(new int[]{1})
		).isEqualTo(0);
	}
}

