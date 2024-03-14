package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class scannerExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		scannerExample obj = new scannerExample();
		obj.method1();
	}
		
	
	public void method1() {
		System.out.println("국어 점수를 입력하세요 :");
		String kor_str = sc.nextLine();
		int kor = Integer.valueOf(kor_str);
				
		
		System.out.println("영어 점수를 입력하세요 :");
		String eng_str = sc.nextLine();
		int eng = Integer.valueOf(eng_str);
		
		
		System.out.println("수학 점수를 입력하세요 :");
		String math_str = sc.nextLine();
		int math = Integer.valueOf(math_str);
		
		
		int result = kor+eng+math;
		double avg = (double)result/3;
		System.out.println("총점은 "+ result + "평균은 : " + avg);
		
		
		
		
		
		
	}

	public void method2() {
		System.out.println("메소드 2");
	}	
	
}
// 템플릿 등록하는 방법 -> 	public static void main(String[] args) {
//scannerExample obj = new scannerExample();     윈도우 -> 환경설정 -> java 검색  -> 에디터 -> Templater 에 new -> 
// insert variable -> enclosing type으로 값을 넣어주면 단축키가 생성됨