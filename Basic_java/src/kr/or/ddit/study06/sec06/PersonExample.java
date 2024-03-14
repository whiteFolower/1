package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 =  new Person();
//		p1.name = "장원영";
		p1.setName("장원영");
		p1.setAge(20);
		p1.setSex("여");
		
		Person p2 = new Person();
		p2.name = "권나라";
		p2.sex = "여자";
		System.out.println("나이를 입력하세요");
		p2.age = sc.nextInt();
	}
}
