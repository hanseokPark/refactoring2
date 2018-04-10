package refactoring.chap16;

import java.util.ArrayList;
import java.util.List;

import refactoring.chap16_statement.HtmlTextStatement;
import refactoring.chap16_statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	
	public Customer(String aname) {
		this.name = aname;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement() {
		return TextStatement.getInstance().value(this);
	}
	
	public String htmlstatement() {	
		return HtmlTextStatement.getInstance().value(this);
	}
	
	public int getFrequentRenterPoints() {
		int result = 0;
		
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}	

	public double getTotalCharge() {
		double result = 0;
		
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
	

	
}










