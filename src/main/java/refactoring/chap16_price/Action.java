package refactoring.chap16_price;

import refactoring.chap16.Movie;

public class Action extends Price {

	@Override
	public int getPriceCode() {
		return Movie.ACTION;
	}

	@Override
	public double getCharge(int aDaysRented) {
		// TODO Auto-generated method stub
		double result  = 0.0;
				
		result += 3;
		if(aDaysRented>3)
		result += (aDaysRented - 3) * 1.5;
			
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return 1;
	}

}
