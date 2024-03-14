package kr.or.ddit.study02.sec02;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년 365.2422 일이다.
		// 1년은 xxx일 x시간 x분 x초입니다. 출력 할것

		double year = 365.2422;

		int days = (int) year;
		int hour = (int) (0.2422 * 24);
		int min = (int) (0.8128 * 60);
		int sec = (int) (0.768 * 60);
		System.out.println("1년은 " + days + "일 " + hour + "시간 " + min + "분 " + sec + "초 입니다");

	}
}
 