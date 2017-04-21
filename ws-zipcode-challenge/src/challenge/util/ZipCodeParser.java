package challenge.util;

import java.util.ArrayList;
import java.util.List;

public class ZipCodeParser {
  public static List<ZipCodeRange> parse(String[] zipRangeStrings) {
	  List<ZipCodeRange> ranges = new ArrayList<ZipCodeRange>();
	  for (String rangeString :  zipRangeStrings) {
		  if (!validateFormat(rangeString))
			  System.err.println("Range string " + rangeString + " is in an invalid format.  Use [nnnnn,nnnnn]");
		  else  
			  ranges.add(parseRangeString(rangeString));
	  }
	return ranges;
  }

  private static boolean validateFormat(String rangeString) {
	return rangeString.matches("\\[[0-9]+,[0-9]+\\]");  
  }
  
  /**
   * Parse a single range from an input string in the form [xxx,yyy]
   * @param rangeString
   * @return ZipCodeRange
   */
  private static ZipCodeRange parseRangeString(String rangeString) {
	String [] valuesWithBracketsParsed = rangeString.split("[\\[\\]]");
	  String lowAndHighValues[] = valuesWithBracketsParsed[1].split(",");
	  int lowEnd = Integer.parseInt(lowAndHighValues[0]);
	  int highEnd = Integer.parseInt(lowAndHighValues[1]);
	  return highEnd >= lowEnd ? 
		  new ZipCodeRange(lowEnd, highEnd) :
		  new ZipCodeRange(highEnd, lowEnd);
  }
}
