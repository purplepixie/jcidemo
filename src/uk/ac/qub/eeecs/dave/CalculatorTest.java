package uk.ac.qub.eeecs.dave;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(c.add(10,1), 11);
	}
	
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertEquals(c.sub(10,1), 9);
	}
}
