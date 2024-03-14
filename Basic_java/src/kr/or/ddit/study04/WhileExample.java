package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
	
	public void method1() {
		//
		System.out.println("10번찍어 안넘어가는 나무 없다");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i+"번");
	
		}
		System.out.println("나무가 넘어갔습니다.");
	}
	
	public void method2() {
		int i = 1;
		while(i>0) {
			i=i+100000000;
			System.out.println(i);
		}
	}
	
	public void method3() {
		String menu = "** 커피 메뉴 **\n";
		menu += "1. 아메리카노\t 3000원\n";
		menu += "2. 카페라떼\t 3000원\n";
		menu += "3. 카라멜 마끼아또\t 3500원\n";
		menu += "4. 딸기 에이드\t 4000원\n";
		menu += "5. 종료\n";
		
		int sum =0;
		
		String bill = "";
		while(true) {
			System.out.println(menu);
			System.out.println("음료를 선택하세요");
			int choice = sc.nextInt();
			if (choice ==1) {
				sum+=3000;
				bill += "아메리카노 3000원\n";
			}
			if (choice ==2) {
				sum+=3000;
				bill += "카페라떼 3000원\n";
			}
			if (choice ==3) {
				sum+=4000;
				bill += "카라멜 마끼아또 4000원\n";
			}
			if (choice ==4) {
				sum+=4000;
				bill += "딸기 에이드4000원\n";
			}
			if (choice ==5) {
				break;
			}
			System.out.println("총금액은 : "+sum);
			System.out.println("-----------------------");
			System.out.println(bill);
		}
		
		//for(; ;){ } ->  while문과 같은 원리로 사용됨
	}

	public void method4() {  // 최초 1번 실행함
		int i = 1;
		do {
			System.out.println(i+++"번실행");
		}while(i<10);
	}


}
