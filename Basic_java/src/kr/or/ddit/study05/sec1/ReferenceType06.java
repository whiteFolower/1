package kr.or.ddit.study05.sec1;

import java.util.Scanner;

public class ReferenceType06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType06 obj = new ReferenceType06();
		obj.method1();
	}
	
	
	
	public void method1() {
		String str1 = "";
		String str2 = null;
		
//		if(str1.equals(str2) || str1 == null) {
//			System.out.println("빈문자열1");
//		}
//		
//		if(str2.equals(str1) || str1 == null) {
//			System.out.println("빈문자열2");
//		}
		
		if(str2==null || str2.equals(str1)) {
		System.out.println("빈문자열3");
		}

		
	
	
	
	
	}
}
