package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class Typechang03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Typechang03 obj = new Typechang03();
//		obj.method1();
		obj.method2();
	}
	
	public void method1() {
		int i1 = 100;
		short s2 = 101;
		long l3 = 102; 
		byte b4 = 103;
		double d5 = 3.14;
		float f6 = 3.14f;
		boolean B7 = true;
		char c8 = 'A';	
	}
	
	public void method2() {
		
		// int -> long
		int i1 = 100;
		long l1 = i1;
		
		// long -> int 
		long l2 = 100;
		int i2 = (int)l2;
		
		// char -> int
		char c3 = 'a';
		int i3 = c3;
		
		// int -> char
		int i4 = 10;
		char c4 = (char)i4;
		
		// int -> double
		int i5 = 10;
		double d5 = i5;
		
		// double -> int
		double d6 = 10.55;
		int i6 = (int)d6;
		System.out.println(i6);
		
		// int -> string
		int i7 = 10;
		String s7 = String.valueOf(i7);
		//String s7 = ""+i7;
		
		// string -> int
		String s8 = "10.5";
//		int i8 = Integer.valueOf(s8);
		double d8 = Double.parseDouble(s8);
		
		// char -> string
		char c9 = 'a';
		String s9 = ""+c9;
		
		
		// string -> char 
		String s10 = "abcd";
		char c10 = s10.charAt(4);
		System.out.println("s10->c1 : "+s10+", "+c10);
		
		

		
	}
	
}

	