package kr.or.ddit.study06.sec03;

public class student {
	String name;
	String phone;
	String gender;
	
	
	
	public student() {
		
	}
	
	
	public student(String name, String phone, String gender) { //()안에 들어있는걸 파라미터라고함
		System.out.println(name);
		System.out.println(phone);
		System.out.println(gender); 
		
		
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.gender); //처음엔 널값만 있음
		
		
		this.name = name; //this. 으로 해당하는 정보를 입력해준다. 외부에서 데이터가 들어오는것
		this.gender = gender;
		this.phone = phone;
		
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.gender);
	
		
	}
}
