package kr.or.ddit.Homework10;

public class student {
	String name;
	String Stu_No;

	
	public student(String name,String Stu_No) {
		this.name=name;
		this.Stu_No=Stu_No;
	}


	@Override
	public String toString() {
		return "student [name=" + name + ", Stu_No=" + Stu_No + "]";
	}

	

}
