package kr.or.ddit.study04;

import java.util.Scanner;

public class Homework04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework04 obj = new Homework04();
		obj.process ();
	
	
	}
	
	public void process () {
		/*
		 * 
		 * 컴퓨터가 랜덤으로 내는 가위바위 보랑
		 * 내가 입력한 가위바위보를 비교해서 승패를 출력
		 * 
		 * 컴퓨터 : 가위 ,사람, 보
		 * -> 결과 : 졋다/ 이겻다. 비겻다
		 *		
		 *	math 램덤을 사용해서 컴퓨터가 가위바위보를 내게 할것
		 */
		int a = (int) (Math.random() * 2.1);
		int a2 = (int) a;
		System.out.println("숫자를 입력하세요 : ");
		int a1 = sc.nextInt();

		if (a2 == a1) {
			System.out.println("비겻습니다");
		} else if (a2 == 1 && a1 == 0) {
			System.out.println("졌습니다");
		} else if (a2 == 2 && a1 == 1) {
			System.out.println("졌습니다");
		} else if (a2 == 0 && a1 == 2) {
			System.out.println("졌습니다");
		} else if (a1 == 1 && a2 == 0) {
			System.out.println("이겼습니다");
		} else if (a1 == 2 && a2 == 1) {
			System.out.println("이겼습니다");
		} else if (a1 == 0 && a2 == 2) {
			System.out.println("이겼습니다");
		}

	}
	
}