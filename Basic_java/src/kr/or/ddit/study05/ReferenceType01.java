package kr.or.ddit.study05;

import java.util.Scanner;

public class ReferenceType01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType01 obj = new ReferenceType01();
		obj.method1();
	}
	
	
	public void method1() {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "강감찬";
		String str4 =  new String ("강감찬");
		String str5 =  new String ("강감찬");
		
		System.out.println(str1 == str2); // == 스택에서의 값이 같은지를 비교함, 스택에 없는 string은 힙영역에 저장이 되어 값이 같지 않음
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		//string으로 입력한 홍길동이 10번 저장한다고 다른값으로 저장되지않고, 10번을 저장해도 1번만 저장된것으로 나온다
		// 나머지는 주소값을 비교하여 다르게 나온다.
		// new String 은 힙영역에서 다른 변수로 저장되어 값이 같아 질수 없다.
		
		System.out.println(str3.equals(str4)); // equals 를 사용하여 같은 값인지 결과값을 비교
		// string 비교시 equals 사용
		
		
		// 정수 ,실수, 논리 는 스택에서 저장
		// String 은 힙영역에서만 저장 후 스택으로 주소값만 불러와 사용한다. 
	}
}
