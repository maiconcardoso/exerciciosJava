public class LendoNumeroInteiro {
	private int intNumber;
	private int nextNumber;
	private int beforeNumber;

	public LendoNumeroInteiro (int intNumber) {
		this.intNumber = intNumber;
	}

	public void calcBeforeNumberAndNextNumber() {
		beforeNumber = --intNumber;
		intNumber++;
		nextNumber = ++intNumber;
		intNumber--;
	}

	public String toString() {
		return "Integer Number: " + intNumber + "\nBefore Number:  " + beforeNumber +
		"\nNext Number: " + nextNumber;	
	}

	public static void main(String[] args) {
		LendoNumeroInteiro readNumber = new LendoNumeroInteiro(365);
		readNumber.calcBeforeNumberAndNextNumber();
		System.out.println(readNumber.toString());
	}
}