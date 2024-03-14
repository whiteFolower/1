package kr.or.ddit.study05;

import java.util.Scanner;

public class ReferenceType03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType03 obj = new ReferenceType03();
		obj.method1();
		
	}
	
	public void method1() {
		String str1 = "";
		String str2 = null;  // null 아예 없는 값을 말함, 주소값도 없는 상태를 말함
	}
}
