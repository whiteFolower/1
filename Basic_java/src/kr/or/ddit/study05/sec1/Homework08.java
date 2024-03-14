package kr.or.ddit.study05.sec1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework08 obj = new Homework08();
		obj.process();
	}
	
		
	public void process() {
		/*
		 * 
		 * 5명, 3과목 성적과 이름을 배열에 저장하고
		 * 총점, 평균, 등수를 구하셈
		 */
		
		String[] stuName = {"장원영", "임수향", "나라", "샤샤", "몰루"};
		// 국어 영어 수학 총점 평균 등수
		//  80 70 80  0  0  1
		int [][] scores = { {100, 100, 95, 0, 0, 1},
							{100, 75, 80, 0, 0, 1},	
							{80, 70, 95, 0, 0, 1},
							{65, 72, 99, 0, 0, 1},
							{80, 91, 87, 0, 0, 1} };
		
		// 1 총점구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += scores[i][j];
			}
			scores[i][3] = sum;
			// 2. 평균 구하기
			scores[i][4] = sum / 3;
		}
	       
	       
	       
	       
	       //3. 등수 구하기
			for (int i = 0; i < scores.length; i++) {
				for (int j = 0; j < scores.length;j++) {
					if (scores[i][3] < scores[j][3]){
						scores[i][5]++;
					}
				}
			}
	      
	       
//	       //4. 출력하기
//			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
//			System.out.println("======================================================");
//			for (int i = 0; i < scores.length; i++) {
//				System.out.print(stuName[i] + "\t");
//				for (int j = 0; j < scores[i].length; j++) {
//					System.out.print(scores[i][j] + "\t");
//				}
//				System.out.println();
//			}
		
		// 5 정렬하기
			for(int i=0; i<scores.length-1; i++) {
				for(int j=0; j<scores.length-1;j++) {
					if(scores[j][5] >scores[j+1][5]) {
					int []temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
					String sTemp = stuName[j];
					stuName[j] = stuName[j+1];
					stuName[j+1] = sTemp;
					
				}
			}
		}
		
		// 6 출력하기
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
			System.out.println("======================================================");
			for (int i = 0; i < scores.length; i++) {
				System.out.print(stuName[i] + "\t");
				for (int j = 0; j < scores[i].length; j++) {
					System.out.print(scores[i][j] + "\t");
				}
				System.out.println();
			}
	}
}