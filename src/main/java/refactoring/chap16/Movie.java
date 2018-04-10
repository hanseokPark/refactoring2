package refactoring.chap16;

import refactoring.chap16_price.Action;
import refactoring.chap16_price.Children;
import refactoring.chap16_price.NewRelease;
import refactoring.chap16_price.Price;
import refactoring.chap16_price.Regular;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	public static final int ACTION = 3;
	
	private String title;
	private Price price;
	

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return price.getPriceCode();
	}
	
	public void setPriceCode(int apriceCode) {
		switch(apriceCode) {
		case REGULAR:
			price = new Regular();
			break;
		case CHILDRENS:
			price = new Children();
			break;
		case NEW_RELEASE:
			price = new NewRelease();
			break;
		case ACTION:
			price = new Action();
			break;
		default :
			throw new IllegalArgumentException("가격 코드가 잘못되었습니다.");
		}
	}
	
	public String getTitle() {
		return title;
	}

	double getCharge(int aDaysRented) {		
		return price.getCharge(aDaysRented);
	}

	public int getFrequentRenterPoints(int aDaysRented) {
		return price.getFrequentRenterPoints(aDaysRented);
	}
	
}
