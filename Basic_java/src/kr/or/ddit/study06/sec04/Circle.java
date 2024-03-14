package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle Circle  = new Circle();
		double r = 10;
		System.out.println("반지름" + r+ "짜리 원의 넓이는 "+ Circle.C(r));
		System.out.println("반지름" + r+ "짜리 원의 넓이는 "+ Circle.D(r));
		r=5;
		System.out.println("반지름" + r+ "짜리 원의 넓이는 "+ Circle.D(r));
	}


	public double C(double r) {
		return r*r*Math.PI;
	}
	// 반지름을 매개변수(파라미터)로 받아 넓이를 구하는 메소드를 작성하시오
	
	// 반지름 * 반지름 * 파이
	
	// 반지름은 매개변수(파라미터)로 받아 원의 둘레를 구하는 메소드 작성
	public double D(double r) {
		return r*Math.PI*2;
	}
	// 반지름 * 파이 * 2
}
