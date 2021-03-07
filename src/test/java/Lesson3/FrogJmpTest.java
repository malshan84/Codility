package Lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {
	FrogJmp frogJmp = new FrogJmp();
	@Test
	void getMinimalJumpCount() {
		assertThat(frogJmp.getMinimalJumpCount(10,85,30)).isEqualTo(3);
	}
}