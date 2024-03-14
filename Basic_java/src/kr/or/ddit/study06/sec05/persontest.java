package kr.or.ddit.study06.sec05;

public class persontest {
	public static void main(String[] args) {
		person p1 = new person("장원영", 25);
		person p2 = new person("권나라", 25);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("=======================");
		p1.newYear();
		System.out.println(p1);
		System.out.println(p2);
	
	}
}
