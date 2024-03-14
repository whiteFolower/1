package kr.or.ddit.study05;

import java.util.Scanner;

public class ReferenceType02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType02 obj = new ReferenceType02();
		obj.method1();
	}


	public void method1() {  //디버깅
		int a = 10;
		int b = 11;
		
		if(true) {
			int c=7;   // F8을 눌러 c,d 값을 사라지게 함 
			int d=5;
		}
		if(true) {
			int e = 9;	// f8사용하여 e,f값을 사라지게함
			String f = "테스트";
		}
		int g = 0;
	}
}
