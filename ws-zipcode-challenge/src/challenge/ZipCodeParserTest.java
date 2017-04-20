package challenge;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ZipCodeParserTest {

	@Test
	public void testParsedSize() {
		List<ZipCodeRange>ranges = ZipCodeParser.parse(new String[] {"[10000,20000]", "[30000,40000]"});
		assertEquals("Two ranges were parsed", ranges.size(), 2);
	}
	
	@Test
	public void testParsedValues() {
		List<ZipCodeRange> ranges = ZipCodeParser.parse(new String[] {"[10000,20000]", "[30000,40000]"});

		assertEquals("Low end parsed on first range", ranges.get(0).low(), 10000);
		assertEquals("High end parsed on first range", ranges.get(1).high(), 20000);
		
		assertEquals("Low end parsed on second range", ranges.get(1).low(), 30000);
		assertEquals("High end parsed on second range", ranges.get(1).high(), 40000);
	}

}