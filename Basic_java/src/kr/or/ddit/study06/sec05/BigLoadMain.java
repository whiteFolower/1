package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("클래스를 생성합니다");
		BigLoadSingleton bs1 = BigLoadSingleton.getInstance();
		System.out.println("클래스를 생성합니다");
		BigLoadSingleton bs2 = BigLoadSingleton.getInstance();
		System.out.println("클래스를 생성합니다");
		BigLoadSingleton bs3 = BigLoadSingleton.getInstance();
		Date date2 = new Date();
		for(int i = 0; i<10000; i++) {
			BigLoadSingleton.getInstance();
		}
		System.out.println(date2.getTime()-date.getTime()+"ms");
	}
}
// Atrl + shift + a 지정 모두 선택




      
      
      
      
      
      
      
      
      

