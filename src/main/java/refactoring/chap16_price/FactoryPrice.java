package refactoring.chap16_price;

public class FactoryPrice {
	public static Price createPrice(PriceType type) {
		switch(type) {
			case REGULAR:
				return Regular.getInstance();
			case NEW_RELEASE:
				return NewRelease.getInstance();
			case CHILDRENS:
				return Children.getInstance();
			case ACTION:
				return Action.getInstance();
			default:
				return null;
		}
	}
}
