package challenge;

public class ZipCodeRange {

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
	
	public String toString() {
		return "[" + m_low + "," + m_high + "]";
	}
}
