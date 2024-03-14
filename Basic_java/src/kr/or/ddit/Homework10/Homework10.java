package kr.or.ddit.Homework10;

import java.util.Scanner;

public class Homework10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework10 hw = new Homework10();
//		hw.method1();
//		hw.method2();
//		hw.method3();

		hw.method4();
	}
	
	
	public void method1() {
		// 1. 다음을 만족하는 Student 클래스를 작성하시오.
	      // String 학과 정수형의 학번을 필드로 선언
	      // 해당 메소드에서 클래스를 생성 및 적당한 값을 입력 후 출력
		student s1 = new student("AI설계", "A001");
		System.out.println(s1);
	}
	
	
	public void method2() {
	// 제조사 생산년도 크기를 출력하는 Tv 클래스를 설계	
		Tv t1 = new Tv("Samsung", "2023년", 40.6);
		System.out.println(t1);
	}
	
	
	public void method3() {
		// 세 과목의 성적을 입력 받고 총점과 평균을 출력 할수 있는  Grade 클래스 설계
		Grade g1 = new Grade(80, 90, 100);
		System.out.println(g1);
	}
	
	
	public void method4() {
		//원동을 나타내는 Cylinder 클래스는 Crircle 형의 원과 실수형의 높이를 필드로 선언
		// 부피를 자동계산할것.
		// 부피구하는 공식 원의 넓이 * 높이
		Circle c1 = new Circle(7, 10);
		System.out.println(c1);
		
	}
	
	
	
}
