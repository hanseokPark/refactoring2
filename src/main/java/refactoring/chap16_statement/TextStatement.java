package refactoring.chap16_statement;

import refactoring.chap16.Customer;
import refactoring.chap16.Rental;

public class TextStatement extends Statement{
	private static final TextStatement instance = new TextStatement();
	
	
	public static TextStatement getInstance() {
		return instance;
	}

	private TextStatement() {}

	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("누적 대여료 : %s%n 적립포인트: %s ", aCustomer.getTotalCharge(), aCustomer.getFrequentRenterPoints());
	}
	
	@Override
	protected String eachRentalString(Rental each) {
		// TODO Auto-generated method stub
		return String.format("\t%-20s\t%s%n", each.getMovie().getTitle(), each.getCharge());
	}
	
	@Override
	protected String headerString(String name) {
		// TODO Auto-generated method stub
		return String.format("%s 고객님의 대여 기록\n",name);
	}

}
