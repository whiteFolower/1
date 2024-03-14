package kr.or.ddit.Homework;

import java.util.Arrays;

public class Homework09 {
	public static void main(String[] args) {
		Homework09 obj = new Homework09();
		obj.method1();
	}
	
	public void method1() {
		// 학생 5명ㅇ을 만들고 각각 데이터를 입력할것
		Student s1 = new Student();
		s1.name = "장원영";
		s1.kor = 88;
		s1.eng = 98;
		s1.math = 95;

		Student s2 = new Student();
		s2.name = "나라";
		s2.kor = 97;
		s2.eng = 95;
		s2.math = 92;

		Student s3 = new Student();
		s3.name = "오또맘";
		s3.kor = 99;
		s3.eng = 80;
		s3.math = 85;

		Student s4 = new Student();
		s4.name = "설현";
		s4.kor = 82;
		s4.eng = 75;
		s4.math = 65;

		Student s5 = new Student();
		s5.name = "손희진";
		s5.kor = 95;
		s5.eng = 85;
		s5.math = 91;

		Student[] s = { s1, s2, s3, s4, s5 };

		// 총점 구하기
		for (int i = 0; i < s.length; i++) {
			int sum = 0;
			s[i].sum = s[i].kor + s[i].eng + s[i].math;
		}

		// 평균 구하기
		for (int i = 0; i < s.length; i++) {
			s[i].avg = s[i].sum / 3.0;
		}

		// 등수구하기
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].sum < s[j].sum) {
					s[i].ran++;
				}
			}
		}

		// 출력하기
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		// 정렬하기
		for(int i = 0; i<s.length-1; i++) {
			for(int j = i+1; j<s.length; j++) {
				if(s[i].sum < s[j].sum) {
					Student temp = new Student();
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		// 출력하기
		System.out.println("------------------------------------------------");
		System.out.println("등수별 정리");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}

	class Student {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		int ran = 1;

		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum
					+ ", avg=" + avg + ", ran=" + ran + "]";
		}

	}

}
