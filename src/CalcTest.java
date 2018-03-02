import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void calcFail() {
		SimpleCalc c = new SimpleCalc();
		assertTrue(c.add(1, 1)==3);
	}

}
