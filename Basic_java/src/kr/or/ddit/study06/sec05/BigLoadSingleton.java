package kr.or.ddit.study06.sec05;

public class BigLoadSingleton {
	private static BigLoadSingleton instance = null;

	BigLoadSingleton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static BigLoadSingleton getInstance() {

		if (instance == null) {
			instance = new BigLoadSingleton();
		}
		return instance;
	}
}
