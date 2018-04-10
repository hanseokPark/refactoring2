package refactoring.chap16_statement;

import java.util.List;

import refactoring.chap16.Customer;
import refactoring.chap16.Rental;

public class HtmlTextStatement extends Statement {
	
	private static final HtmlTextStatement instance = new HtmlTextStatement();
	
	
	public static HtmlTextStatement getInstance() {
		return instance;
	}

	private HtmlTextStatement() {}
	
	
	
	public String value(Customer aCustomer) {
		StringBuilder result = new StringBuilder();
		List<Rental> rentals = aCustomer.getRentals();		
		
		result.append(headerString(aCustomer.getName()));
		
		// 비디오 종류별 대여료 계산
		for (Rental each : rentals) {
			result.append(eachRentalString(each));

		} // end of for-loop

		result.append(footerString(aCustomer));
		
		return result.toString();
	}// end of method statement
	
	
	
	protected String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <EM> %s%n </Em>%n<p>적립 포인트 : <EM> %s</Em><p> ", aCustomer.getTotalCharge(), aCustomer.getFrequentRenterPoints());
	}

	protected String eachRentalString(Rental each) {
		// TODO Auto-generated method stub
		return String.format("\t%-20s :\t%s%n", each.getMovie().getTitle(), each.getCharge());
	}

	protected String headerString(String name) {
		// TODO Auto-generated method stub
		return String.format("<H1><EM> %s 고객님의 대여 기록</EM></H1><P>%n",name);
	}
}
