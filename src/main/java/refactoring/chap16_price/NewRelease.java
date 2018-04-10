package refactoring.chap16_price;

import refactoring.chap16.Movie;

public class NewRelease extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		// TODO Auto-generated method stub
		double result  = 0.0;
		
		result += aDaysRented * 3;
		
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		// TODO Auto-generated method stub
		/*if((aDaysRented > 1) {
			return 2;
		}*/
		return aDaysRented>1?2:1;
	}

}
