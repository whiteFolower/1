package kr.or.ddit.study06.sec06;

public class Book {
	// 책이름 저자 출판사 출반일
	//toString get/setter  만들어서 호출해볼것

	private String name;
	private String name1;
	private String pd;
	private String day;
	
	public Book() {
		super();
		this.name = name;
		this.name1 = name1;
		this.pd = pd;
		this.day = day;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getPd() {
		return pd;
	}
	public void setPd(String pd) {
		this.pd = pd;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", name1=" + name1 + ", pd=" + pd + ", day=" + day + "]";
	}
	


}
