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

	public double getCharge() {
		return movie.getCharge(daysRented);
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}

	
	
}
