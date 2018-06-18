package refactoring.chap16_price;

import refactoring.chap16.Movie;

public class Regular extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		// TODO Auto-generated method stub
		double result  = 0.0;
		
		result += 2;
		if(aDaysRented>2)
			result += (aDaysRented - 2) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		// TODO Auto-generated method stub
		return 1;
	}

	public static Price getInstance() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
