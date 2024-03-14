package kr.or.ddit.study02.sec04;

import java.util.Scanner;   // ctrl + shift + o

public class printExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		printExample obj = new printExample();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}
	
	
	public void method3() {
		System.out.println("이름을 입력하세요 :");
		String name = sc.nextLine();

		System.out.println("나이을 입력하세요 :");
		String age = sc.nextLine();
		
		System.out.printf("이름 : %s, 나이 : %s", name, age);
		
		
	}
	
	
	
	public void method2() {
		//System.out.printf => ("형식지정문자열, 변수 리스트")
		
		// - 왼쪽 정렬
		// 0 남은 왼쪽 빈공간에 0채움
		// 8 <- 8개의 공간
		
		System.out.printf("숫자 : %d %d 입니다.\n", 1000, 2000); //c언어와 같이 %d를 2개 넣으면 숫자가 2개가 나타나게 됨
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000); // 빈공간 숫자 0으로 채움
	
		
	}
	
	
	
	
	public void method1() {
//		System.out.println 줄바꾸기 있음
		System.out.println("홍길동");
		System.out.println(" 34061");
		System.out.println(" 대전시 중구 계룡로");
		System.out.println();
		
		// 	System.out.print 줄바꾸기 x
		System.out.print("홍길동");
		System.out.print(" 34061");
		System.out.print(" 대전시 중구 계룡로");
		System.out.println();
		
		
	}
	
	
	
}
