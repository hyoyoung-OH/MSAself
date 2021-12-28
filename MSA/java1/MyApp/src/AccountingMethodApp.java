
public class AccountingMethodApp {
	public	static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
	
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
	}

	public static void print() {
		System.out.println("Value of Supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getExpense() );
		System.out.println("Income : " + getincome() );		
		System.out.println("Dividend 1: " + getDividend1());		
		System.out.println("Dividend 2: " + getDividend2());		
		System.out.println("Dividend 3: " + getDividend3());
	}

	public static double getDividend1() {
		return getincome()* 0.5;
	}

	public static double getDividend2() {
		return getincome()* 0.3;
	}

	public static double getDividend3() {
		return getincome()* 0.2;
	}

	public static double getincome() {
		return valueOfSupply-getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
