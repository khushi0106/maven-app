package demo_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShowGrade {

	@Test
	void lessthan60() {
		assertEquals('F', Grade.showgrade(59));
	}
	@Test
	void lessthan70() {
		assertEquals('D', Grade.showgrade(69));
	}
	@Test
	void lessthan80() {
		assertEquals('C', Grade.showgrade(79));
	}
	@Test
	void lessthan90() {
		assertEquals('B', Grade.showgrade(89));
	}
	@Test
	void lessthan100() {
		assertEquals('A', Grade.showgrade(99));
	}

}
