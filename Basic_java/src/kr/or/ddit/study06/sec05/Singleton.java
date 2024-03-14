package kr.or.ddit.study06.sec05;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() { // 내 클래스 에서만 접근이 가능

	}

	public static Singleton getInstance() { // 모든 클래스에서 접근이 가능
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
 