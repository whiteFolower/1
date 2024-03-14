package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "장원영";
		s1.phone = "아이폰15";
		s1.gender = "여";
		
		student s2 = new student();		
		s2.name = "손희진";
		s2.phone = "갤럭시 24";
		s2.gender = "여";
		
		
		student s3Student = new student("나라", "010-0000-0000","여");
		
		System.out.println(s1+""+s2);
	}
}
