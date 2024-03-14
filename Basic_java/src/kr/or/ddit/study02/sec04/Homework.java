package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class Homework {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework obj = new Homework();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
	}
	
	public void method1() {

		System.out.println("실수를 입력해 주세요 : ");
		String a1_str = sc.nextLine();
		double a1 = Double.parseDouble(a1_str);
		System.out.println(Math.floor(a1 * 100) / 100.0);
	}

	public void method2() {

		System.out.println("소문자를 입력하세요 : ");
		String a2_str = sc.nextLine();
		char a2 = a2_str.charAt(0);
		int i2 = a2 - 32;
		char c2 = (char) i2;
		System.out.println(c2);
	}

	public void method3() {
		System.out.println("대문자를 입력하세요 : ");
		String a3_str = sc.nextLine();
		char a3 = a3_str.charAt(0);
		int i3 = a3 + 32;
		char c3 = (char) i3;
		System.out.println(c3);
	}

	public void method4() {
		System.out.println("숫자를 입력하세요 : ");
		String a4_str = sc.nextLine();
		int a4 = Integer.valueOf(a4_str);
		int s1 = (int) (a4 / 100);
		int s2 = (int) ((a4 - s1 * 100) / 10);
		int s3 = (int) (a4 % 10);
		System.out.println(s1 + s2 + s3);
	}

	public void method5() {
		System.out.println("소수점를 입력하세요 : ");
		String a5_str = sc.nextLine();
		char c5 = a5_str.charAt(4);
		int i5 = c5 - 48;
		double i6 = (double) (i5 * 0.01);
		double i7 = Double.parseDouble(a5_str);
		int i8 = (int) ((i6 + i7) * 10);
		double i9 = (double) i8 / 10;
		System.out.println(i9);

	}
	
	
}

