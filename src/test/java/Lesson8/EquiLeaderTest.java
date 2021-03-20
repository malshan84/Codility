package Lesson8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EquiLeaderTest {
	EquiLeader equiLeader = new EquiLeader();
	@Test
	void getCount() {
		assertThat(equiLeader.getCount(new int[]{4,3,4,4,4,2})).isEqualTo(2);
	}
}