package refactoring.chap16_statement;

import java.util.List;

import refactoring.chap16.Customer;
import refactoring.chap16.Rental;

public abstract class Statement {
	public Statement() {}
	
	public String value(Customer aCustomer) {
		StringBuilder result = new StringBuilder();		
		List<Rental> rentals = aCustomer.getRentals();
		
		result.append(headerString(aCustomer.getName()));
	
		//비디오 종류별 대여료 계산
		for(Rental each:rentals) {				
			result.append(eachRentalString(each));
						
			
		}//end of for-loop
		
		//푸터행 추가
		result.append(footerString(aCustomer));
		
		
		return result.toString();
	}//end of method statement

	protected abstract String footerString(Customer aCustomer);

	protected abstract String eachRentalString(Rental each);

	protected abstract String headerString(String name);

}