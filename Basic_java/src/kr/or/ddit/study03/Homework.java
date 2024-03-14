package kr.or.ddit.study03;

import java.util.Scanner;

public class Homework {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework obj = new Homework();
//		obj.question1();
		obj.question2();
	}
	
	public void question1() {
		/*
		 * question 변수에 랜덤한 숫자 
		 * 1~ 100 숫자가 입력되어 있다.
		 * 
		 * if 문 조건식을 완성하여 해당 숫자를 맞추는 
		 * 프로그램을 완성하시오.
		 * 
		 * 1번 시행시 cnt 값이 1증가 되어야함
		 */
		
		//math.random()
		// 0~0.999999 까지의 double 값
		//랜덤한 값을 만듬
		int question = (int)(Math.random()*100)+1;
		int cnt=0;
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.(1~100)");
			int ans = sc.nextInt();
			if(question<ans) {
				System.out.println("더 작은 수를 입력하세요");
				cnt++;
			}
			if(question>ans) {
				System.out.println("더 큰은 수를 입력하세요");
				cnt++;
			}
			if(question==ans) {
				System.out.println("정답입니다.");
				cnt++;
				break;
			}
		}
		System.out.println(cnt + "번 시행 되었습니다.");
	}
	
	
	public void question2() {
		/*
		 * 논리 연산자 : && || !을 이용할것
		 * 
		 * 4의 배수 윤년 1992 1996 2004
		 * 100의 배수 평균 1700 1800 1900
		 * 400의 배수 윤년 1600 2000
		 */
		
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		
		if(year%400==0||(year%4==0 && year%100!=0)) {
			System.out.println(year + " 년은 윤년입니다");
		}
		else {
			System.out.println(year + " 년은 평년입니다");
		}
		
		/*
		 * boolean four = year %4==0;
		 * boolean hund = year %100==0;
		 * boolean fhund = year %400==0;
		 * 
		 * if(fhund || (four && hund))
		 * 
		 */
		
	}
	
	
}

