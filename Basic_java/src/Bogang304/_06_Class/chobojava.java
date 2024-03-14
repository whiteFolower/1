package Bogang304._06_Class;

import java.text.DecimalFormat;
import java.util.Arrays;

public class chobojava {

	public static void main(String[] args) {
		String[] names = { "장원영", "권나라", "임수향", "김미연", "손희진", "손가희" };
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Java", "Oracle" };
		int[][] score = new int[names.length][subjects.length];
		int[] nameSum = new int[names.length];
		double[] nameAvg = new double[names.length];
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				int ran = (int) (Math.random() * 50) + 50;
				score[i][j] = ran;
				nameSum[i] += score[i][j];
			}
		}
		
		for(int i =0; i<names.length; i++) {
			nameAvg[i] = nameSum[i]/7.0;
		}
		
		DecimalFormat dou = new DecimalFormat("#.##");
//		System.out.println(Arrays.deepToString(score));
//		System.out.println(Arrays.toString(nameSum));
		
		for(double nameavg : nameAvg) {
//			System.out.printf(dou.format(nameavg));	
//			System.out.print("   ");
		}

		int[] subSum = new int[subjects.length]; 
		for(int i =0; i<subjects.length; i++) {
			for(int j=0; j< names.length; j++) {
				subSum[i] += score[j][i];
			}
		}
//		System.out.println(Arrays.toString(subSum));

		double[] subAvg = new double[subjects.length];
		for(int i =0; i<subjects.length; i++) {
			subAvg[i] = subSum[i]/6.0;
		}
		
		System.out.println(Arrays.toString(subAvg));
		
//12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
//(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
		
//13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
//(단, names의 길이를 이용한다.)
		
//14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
	}




}	