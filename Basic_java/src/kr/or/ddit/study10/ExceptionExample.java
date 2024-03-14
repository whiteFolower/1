package kr.or.ddit.study10;

import java.util.Scanner;

// 트라이캐치 부분
// 이셉션

public class ExceptionExample {
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.process();
	}
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력하세요");
		
		try {
			double num = sc.nextInt();
			System.out.println("입력된 결과 : "+num);
		}catch (IndexOutOfBoundsException e) { //배열 범위 밖으로 넘어간다
			System.out.println(e);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e);
		}finally {//트라이 , 캡쳐 실패해도 들어갈때 접속이 종료가 되어야 할때  접속이 반드시 종료되어야할때 사용
			
		}
		
		System.out.println("프로그램이 완료 되었습니다.");
	
	}


	}

// try 부분에서 실행되다 실패하면 catch 문으로 넘어간다