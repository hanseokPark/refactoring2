package refactoring.chap16;

public class Rental {
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie amovie, int adaysRented) {
		this.movie = amovie;
		this.daysRented = adaysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	double getCharge() {
		double result  = 0;
		
		switch(getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(getDaysRented()>2)
				result += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(getDaysRented()>3)
			result += (getDaysRented() - 3) * 1.5;
			break;
		}
		return result;
	}

	int getFrequentRenterPoints() {
		if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
				getDaysRented() > 1) {
			return 2;
		}else {
			return 1;
		}		
	}

	
	
}
