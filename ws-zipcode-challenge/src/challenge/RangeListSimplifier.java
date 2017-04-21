package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import challenge.util.ZipCodeRange;

public class RangeListSimplifier {
	public static List<ZipCodeRange> simplifyRanges(List<ZipCodeRange> ranges) {
		Collections.sort(ranges);
		ArrayList<ZipCodeRange> simplified = new ArrayList<ZipCodeRange>();

		for (ZipCodeRange range: ranges) {
			if (simplified.isEmpty())
				// add the first element.
				simplified.add(range);
			else if (simplified.get(simplified.size() - 1).high() < range.low())
				// new range does not overlap.  Add it.
				simplified.add(range);
			else
				mergeWithOverlapRange(simplified, range);
		}
		return simplified;
	}

	private static void mergeWithOverlapRange(ArrayList<ZipCodeRange> simplified, ZipCodeRange range) {
		ZipCodeRange last = simplified.remove(simplified.size() - 1);
		simplified.add(new ZipCodeRange(last.low(), range.high()));
	}
}