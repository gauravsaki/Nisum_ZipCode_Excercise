package challenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZipCodeRangeTest {

	/**
	 * test basic creation values
	 */
	@Test
	public void testCreationValues() {
		int low = 0;
		int high = 1000;
		ZipCodeRange pair = new ZipCodeRange(low, high);
		assertEquals("Low must be retrieved", pair.low(), low);
		assertEquals("High must be retrieved", pair.high(), high);
	}

}
