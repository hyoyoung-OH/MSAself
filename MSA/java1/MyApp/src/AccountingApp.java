
public class AccountingApp {

	// 공급가액
	public static double valueOfSupply = 10000.0;
	// 부가가치세율
	public static double vatRate = 0.1;
	// 부가세
	// double vat = valueOfSupply * vatRate;
	public static double vat = getVAT();
	
	// 합계
	//double total = valueOfSupply + vat;
	public static double total = getTOTAL();

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

	public static double getTOTAL() {
		return valueOfSupply + vat;
	}

	public static void main(String[] args) {

		System.out.println("Value of Supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);

	}

}
