package challenge;

import java.util.List;
import java.util.stream.Collectors;

import challenge.util.RangeListSimplifier;
import challenge.util.ZipCodeParser;
import challenge.util.ZipCodeRange;

/**
 * @author Gaurav Saki - Simplify expressions of multiple numeric ranges of ZIP
 *         codes
 */
public class ZipCodeRangeSimplifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0)
			System.err.println(
					"Enter space-separated pairs of ZIP codes, surrounded by brackets.  E.g. [94133,94133] [94200,94299] [94600,94699]");

		List<ZipCodeRange> simplified = simplifyRangeSet(args);
		System.out.println(simplified.stream().map(ZipCodeRange::toString).collect(Collectors.joining(" ")));
	}

	private static List<ZipCodeRange> simplifyRangeSet(String[] args) {
		List<ZipCodeRange> ranges = ZipCodeParser.parse(args);
		return RangeListSimplifier.simplifyRanges(ranges);
	}
}
