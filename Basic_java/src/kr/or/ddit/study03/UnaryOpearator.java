package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOpearator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOpearator obj = new UnaryOpearator();
//		obj.method1();
		obj.method2();	
	}
	
	public void method2() {
		// 2. 증감연산자
		// ++ 변수 : 다른 연산을 수행하기 전에 1을 증가시킴
		// 변수 ++ : 다른 연산을 수행한 후에 1을 증가 시킴
		// -- 변수 : 다른 연산을 수행하기 전에 1을 감소 시킴
		// 변수 -- : 다른 연산을 수행한 후에 1을 감소시킴
		
		int val;
		int res;
		
		val = 10;
//		res = val++;
		res = val;
		val = val+1;
		System.out.println(val+", "+res);
	
		val = 10;
		res = ++val;
		System.out.println(val+", "+res);

		val = 10;
		res = val--;
		System.out.println(val+", "+res);

		val = 10;
		res = --val;
		System.out.println(val+", "+res);
		
				
		
	}
	
	
	
	
	
	
	
	
}
