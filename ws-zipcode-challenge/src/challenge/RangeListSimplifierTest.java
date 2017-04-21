package challenge;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RangeListSimplifierTest {

	@Test
	public void testRangeSimplifierOneRange() {
		ZipCodeRange ranges[] = {new ZipCodeRange(10000, 20000)};
		
		assertEquals(Arrays.asList(ranges), RangeListSimplifier.simplifyRanges(Arrays.asList(ranges)));
	}

	@Test
	public void testRangeSimplifierTwoRanges() {
		ZipCodeRange ranges[] = {new ZipCodeRange(30000, 40000), new ZipCodeRange(20000, 30000)};
		ZipCodeRange rangesSimplified[] = {new ZipCodeRange(20000, 40000)};
		assertEquals(Arrays.asList(rangesSimplified), RangeListSimplifier.simplifyRanges(Arrays.asList(ranges)));
	}
}
