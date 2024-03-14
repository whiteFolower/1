package kr.or.ddit.Homework.home306;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.security.auth.Subject;

public class cobojaba {

	public static void main(String[] args) {
		
//		String[] names = {"장원영","권나라","임수향","손담비","김미연","손희진"};
//		String[] subjects = {"국어", "영어", "수학", "사획", "과학", "Java", "Oracle", };
//		int[] score = new int[names.length*subjects.length];
//		int[] namesum = new int[names.length];
//		double[] nameAvg = new double[names.length];
//		for(int i =0; i<score.length; i++) {
//			int num = (int)(Math.random()*50)+50;
//			score[i]=num;
//		}
//		
//		for(int i =0; i<names.length; i++) {
//			for(int j =0; j<score.length; j++)  {
//				
//		}
//	}
//		System.out.println(Arrays.toString(namesum));
		
		String[] names = {"장원영","권나라","임수향","손담비","김미연","손희진"};
		for(int i =0; i<names.length; i++) {
			
		}
		
		
	}
}

/*
 * 스코어에 잇는 0~6을 1번, 7~13을 2번에게  
//6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)

//7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
//(단, names의 길이를 이용한다.)		

//8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
//(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)

//9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
//(단, subjects의 길이를 이용한다.)

//10. subSum의 요소에 과목별 합계를 저장한다. (5점)
 * 
 */

class Student{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNamesum() {
		return namesum;
	}
	public void setNamesum(int namesum) {
		this.namesum = namesum;
	}
	public double getNameAvg() {
		return nameAvg;
	}
	public void setNameAvg(double nameAvg) {
		this.nameAvg = nameAvg;
	}
	public int getSubsum() {
		return subsum;
	}
	public void setSubsum(int subsum) {
		this.subsum = subsum;
	}
	public double getSubAvg() {
		return subAvg;
	}
	public void setSubAvg(double subAvg) {
		this.subAvg = subAvg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	String name;
	String subject;
	int score;
	int namesum;
	double nameAvg;
	int subsum;
	double subAvg;
	int rank;
	
}
