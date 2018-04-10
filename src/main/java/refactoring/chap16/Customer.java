package refactoring.chap16;

import java.util.ArrayList;
import java.util.List;

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
	
	public String statement() {
	
		
		StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록\n");
	
	
		//비디오 종류별 대여료 계산
		for(Rental each:rentals) {			
			
			
			//이번에 대여한느 비디오 정보와 대여료를 출력
			result.append("\t"+each.getMovie().getTitle());
			result.append("\t"+String.valueOf(each.getCharge())+"\n");
			
			
		}//end of for-loop
		
		//푸터행 추가
		result.append("누적 대여료 : " + String.valueOf(getTotalCharge())+"\n");
		result.append("적립 포인트 : " + String.valueOf(getFrequentRenterPoints()));
		
		return result.toString();
	}//end of method statement

	private int getFrequentRenterPoints() {
		int result = 0;
		
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
	
	public String htmlstatement() {	
		StringBuilder result = new StringBuilder("<H1><EM>" + getName() + " 고객님의 대여 기록</EM></H1><P>\n");	
	
		//비디오 종류별 대여료 계산
		for(Rental each:rentals) {
			result.append(each.getMovie().getTitle() + ": ");
			result.append(String.valueOf(each.getCharge())+"<br>\n");	
			
		}//end of for-loop
		
		result.append("<p>누적 대여료 : <EM>");		
		result.append(String.valueOf(getTotalCharge()) + "</Em>\n");
		
		result.append("<p>적립 포인트 : <EM>");		
		result.append(String.valueOf(getFrequentRenterPoints()) + "</Em>\n");
		
		return result.toString();
	}//end of method statement
	
}










