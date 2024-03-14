package kr.or.ddit.study06.sec03;

public class Tv {
	String company;
	int year;
	double size;

	
	public Tv(String company, int year, double size) {
		this.company = company;
		this.year = year; 
		this.size = size;
	
		
	}


	@Override //부모클래스가 만든것이 마음에 안들면 재정의 함
	public String toString() {
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
	
	
}
