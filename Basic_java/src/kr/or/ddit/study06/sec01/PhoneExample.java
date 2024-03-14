package kr.or.ddit.study06.sec01;

public class PhoneExample {
	public static void main(String[] args) {
		Phone ph1 = new Phone();
		ph1.name = "아이폰6";
		ph1.year = 5;
		ph1.camera = "1600만 화소";
		
		Phone ph2 = new Phone();
		ph2.name = "갤럭시20+";
		ph2.year = 5;
		ph2.camera = "1500만 화소";
	 	
		System.out.println(ph1);
		System.out.println(ph2);
	}
}
