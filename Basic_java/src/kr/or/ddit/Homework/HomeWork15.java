package kr.or.ddit.Homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
		hw.process();
	}
	public void process() {
		Scanner sc = new Scanner(System.in);
		
		// 주사위 2개 던진 전체 값을 히스토그램으로 나타내기
		/*
		 * 		2 : **
		 * 		3 : ****
		 * 		4 : ******
		 * 		5 : ********
		 * 		6 : **********
		 * 		7 : *****
		 * 		8 : **********
		 * 		9 : ********
		 * 		10: ******
		 * 		11: ****
		 * 		12: **
		 * 		
		 * 
		 */
		
		// 주사위 2개를 던졌을 때 두개의 값을 더해서 저장
		// 만약 주사위를 100번 던지는걸 반복했을 때 더한 값이 2인게 3번 나왔으면 백분율로 계산했을때 3%
		// 그러므로 2 : *** 다음과 같이 *을 세개 찍을 것
		// 주사위값은 랜덤으로 랜덤 값의 범위는 1~6짜리 주사위 2개
		
		System.out.print("주사위를 던질 횟수를 입력하세요 : ");
		int num = sc.nextInt();
		printHistoGram(num);
		
		
		
	}
	
	public int throwOneDice() {
		Random rand =new Random();	
		return rand.nextInt(6)+1;
	}
	public int throwTwoDice() {
		return throwOneDice()+throwOneDice();
	}
	
	
	public int[] rollNum(double num) {
		int count[] = new int[11];
		for(int i=0;i<num;i++) {
			int sum = throwTwoDice();
			count[sum-2]++;
		}
		return count;
	}

	public void printHistoGram(double num) {
		int[] count = rollNum(num);
		System.out.println((int)(num)+"번 시행");
		for(int i=0;i<count.length;i++) {
			System.out.print(i+2+"\t");
			for (int j=0;j<(count[i])/num*100;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}





}
