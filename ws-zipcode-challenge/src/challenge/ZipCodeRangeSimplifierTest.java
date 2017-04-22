package challenge;

import static org.junit.Assert.*;
import org.junit.Test;

public class ZipCodeRangeSimplifierTest {

	@Test
	public void testEmpty() {
		ZipCodeRangeSimplifier.main(new String[0]);
		assertTrue("Maybe an error but didn't crash", true);
	}

	@Test
	public void testBadFormat() {
		ZipCodeRangeSimplifier.main(new String[] { "m" });
		assertTrue("Maybe an error but didn't crash", true);
	}

	@Test
	public void testNormalInput() {
		ZipCodeRangeSimplifier.main(new String[] { "[10000,20000]", "[20000,30000]" });
		assertTrue("Doesn't crash", true);
	}
}
