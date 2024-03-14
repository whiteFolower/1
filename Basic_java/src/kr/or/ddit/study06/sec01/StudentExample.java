package kr.or.ddit.study06.sec01;

public class StudentExample {
	public static void main(String[] args) {
		student stu1 = new student();
		stu1.kor = 90;
		stu1.eng = 80; 
		stu1.math = 90;
		stu1.avg = (stu1.kor + stu1.eng+stu1.math)/3.0;
		stu1.name = "장원용";
		
		student stu2 = new student();
		stu2.kor = 95;
		stu2.eng = 83; 
		stu2.math = 91;
		stu2.avg = (stu2.kor + stu2.eng+stu2.math)/3.0;
		stu2.name = "카리나";
		
		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 평균 : %f",stu1.name, stu1.kor,
				stu1.eng, stu1.math,stu1.avg);
		System.out.println();
		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 평균 : %f",stu2.name, stu2.kor,
				stu2.eng, stu2.math,stu2.avg);
	}
}
