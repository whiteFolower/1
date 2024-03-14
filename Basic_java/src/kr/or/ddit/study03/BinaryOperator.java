package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method5() {
		// 대입연산자 연산자
		// = : '=' 오른쪽의 값으 '=' 왼쪽에 저장 우선 순위가 가장 늦다
		// '=' 과 산술 연산자와 결합
		// a = a+b -> a+=b
		// a = a-b -> a-=b
		// a = a/b -> a/=b
		// a = a*b -> a*=b
		// a = a%b -> a%=b
		
		int a = 10;
		int b = 4;
		System.out.println("a = a+b -> a+=b=>"+(a+=b));
		System.out.println("a = a-b -> -+=b=>"+(a-=b));
		System.out.println("a = a*b -> a*=b=>"+(a*=b));
		System.out.println("a = a/b -> a/=b=>"+(a/=b));
		System.out.println("a = a%b -> a%=b=>"+(a%=b));
		
	}
	
	public void method4() {
		// 시프트 연산자
		// >> <<
		// 숫자 >> 정수  => 숫자를 정수만큼 오른쪽으로 평행이동
		// => 숫자를 2^정수 나눈 몫이됨
		System.out.println(12>>2);
		System.out.println(12<<2);
		
	}
	
	
	public void method3() {
		//논리 연산자 
		//		& (and)    |   or
		// 45 : 00101101	 00101101
		// 25 : 00011001	 00011001
		// 		00001001=>9  00111101=>52
		
		int a = 45;
		int b = 25;
		System.out.println(a&b);
		System.out.println(a|b);
		
		// xor
 		System.out.println(a^b);
 		// not
 		System.out.println(~a);
	}
	
	
	
	public void method2() {
		// 관계연산자
		// >, <, ==, >=, <=, !=
	
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score<=90) {
			System.out.println("A 학점");
		}

		else if (score==100) {
			System.out.println("A+ 학점");
		}
		
		
		
	}

	public void method1() {
		// 논리 연산자
		// A && B : A,B중 하나라도 거짓이면 거짓 AND
		// A || B : A, B 하나라도 참이면 참 OR
		// !   	  : 참 거짓을 뒤바꿈 NOT
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b);   // false
		System.out.println(a||b);	// true
		System.out.println(a&&!b);	// true

	}

}
	