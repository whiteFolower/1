package kr.or.ddit.Homework10;

public class Tv {
	String name;
	String year;
	double size;
	
	public Tv(String name, String year, double size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [name=" + name + ", year=" + year + ", size=" + size + "]";
	}
}
