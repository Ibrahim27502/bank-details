package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
	System.out.println("saving amount is 1,80,000");

	}
	public void fixed() {
	System.out.println("fixed amount is 80,000");

}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
		
	}
}
