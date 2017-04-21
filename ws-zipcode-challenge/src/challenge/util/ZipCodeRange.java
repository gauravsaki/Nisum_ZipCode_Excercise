package challenge.util;

public class ZipCodeRange implements Comparable<ZipCodeRange> {

	int m_low = 0;
	int m_high = 0;
	public ZipCodeRange(int low, int high) {
		m_low = low;
		m_high = high;
	}
	
	public int high() {
		return m_high;
	}
	
	public int low() { 
		return m_low;
	}
	
	@Override
	public String toString() {
		return "[" + m_low + "," + m_high + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof ZipCodeRange) && (((ZipCodeRange)obj).high() == high()) &&
				(((ZipCodeRange)obj).low() == low());
	};

	@Override
	public int hashCode() {
		// reasonably unique fast value
		return low();
	}

	@Override
	public int compareTo(ZipCodeRange that) {
	    final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
		if (this == that || this.equals(that))
			return EQUAL;

		if (low() < that.low() || (low() == that.low() && high() < that.high()))
			return BEFORE;
		return AFTER;
	}
}
