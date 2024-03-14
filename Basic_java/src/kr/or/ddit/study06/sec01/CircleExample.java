package kr.or.ddit.study06.sec01;

public class CircleExample {
	public static void main(String[] args) {
		//클래스 하나 생성 후 데이터를 입력 및 출력 할것
		// 원의 넓이 pi*r*r
		double PI = Math.PI;
		Circle c1 = new Circle();
		c1.r = 5;
		c1.x = 5;
		c1.y = 5;
		c1.area = (PI*c1.r*c1.r);
		System.out.println(c1);
	
		
	}
}
