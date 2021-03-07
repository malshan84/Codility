package Lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
	PermMissingElem permMissingElem = new PermMissingElem();

	@Test
	void getMissingElement() {
		assertThat(permMissingElem.getMissingElement(new int[]{2,3,1,5})).isEqualTo(4);
	}
}