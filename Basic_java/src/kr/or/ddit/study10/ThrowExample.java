package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {
		ThrowExample te = new ThrowExample();
		try {
			String nickname = te.inputNick();			
		} catch (Exception e) {
		}
	}

	public String inputNick() throws Exception {

		Scanner sc = new Scanner(System.in);
		String nickname = sc.next();
		if (nickname.contains("18")) {    //일부러 에러를 발생하여 부적절한 언어를 걸러줄수있다.
			throw new Exception();

		}
		return nickname;
	}
}
