package kr.or.ddit.Homework;

import java.util.Calendar;
import java.util.Scanner;

public class Homework17 {
	public static void main(String[] args) {
		Homework17 hw = new Homework17();
		hw.process();
	}

	public void process() {
		Scanner sc = new Scanner(System.in);
		// 달력출력하기.
		// 다음달을 입력하면 다음달 달력 출력
		// 이전달을 입력하면 이전달 달력 출력
		Calendar cal = Calendar.getInstance();

		while (true) {
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DAY_OF_WEEK);
			int last = cal.getActualMaximum(Calendar.DATE);
			cal.set(Calendar.DATE, 1);

			System.out.println("========================================================");
			System.out.println("\t\t\t" + year + "년" + month + "월 ");
			System.out.println("========================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for (int i = 0; i < cal.get(Calendar.DAY_OF_WEEK) - 1; i++) {
				System.out.print(" \t");
			}
			for (int i = 0; i < last; i++) {
				System.out.print(cal.get(Calendar.DATE) + "\t");
				cal.add(Calendar.DATE, 1);
				if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
					System.out.println();
				}
			}
			cal.add(Calendar.MONTH, -1);
			System.out.println();
			System.out.println("<<이전달 1\t\t\t\t\t\t다음달 2>>");
			System.out.println("원하는 달을 입력하세요 : ");
			int mo = sc.nextInt();

			if (mo == 2)
				cal.add(Calendar.MONTH, 1);
			else if (mo == 1)
				cal.add(Calendar.MONTH, -1);
			else {
				break;
			}

		}
	}
}

			
		
		

			
			
			
		