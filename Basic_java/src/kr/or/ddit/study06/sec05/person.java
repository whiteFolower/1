package kr.or.ddit.study06.sec05;

public class person {
	static int year = 2023;
	String name;
	int age;
	
	public void newYear() {
		year++;
		age++;
	}
	
	
	
	
	@Override
	public String toString() {
		return year+ "년[name=" + name + ", age=" + age + "]";
	}




	public person (String name, int age) {
		this.name = name;
		this.age = age;
	}
}
