package kr.or.ddit.study06.sec06;

public class Person {
	//이름 나이 성별로 각각 선언
	private String name;
	private int age;
	private String sex;
	
	
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Person() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("입력할수 없는 데이터 입니다");
			return;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	

	}



