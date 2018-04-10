package refactoring.chap16_price;

public abstract class Price {
	public abstract int getPriceCode();
	
	
	public abstract double getCharge(int aDaysRented);
	
	
	public abstract int getFrequentRenterPoints(int aDaysRented);
	
}
