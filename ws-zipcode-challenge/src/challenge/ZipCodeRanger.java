package challenge;

/**
 * @author Kevin Fries
 *  Simplify expressions of multiple numeric ranges of ZIP codes
 */
public class ZipCodeRanger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("Enter space-separaed pairs of ZIP codes, surrounded by brackets.  E.g. [94133,94133] [94200,94299] [94600,94699]");
			ZipCodeParser.parse(args);

	}

}
