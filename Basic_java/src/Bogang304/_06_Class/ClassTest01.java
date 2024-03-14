package Bogang304._06_Class;

public class ClassTest01 {
	
	/*
	 * Person 클래스를 만들고 부모 클래스를 설계
	 * 
	 * 필드는 이름, 나이
	 * 생성자는 기본생성자, 이름을 입력받을 커스텀 생성자
	 * 
	 * 메소드는 걷다, 뛰다를 가지고 있다.
	 * ::: 부모에서 실행합니다 / 걷다
	 * ::: 부모에서 실행합니다 / 뛰다
	 * 
	 * 자식 클래스에 해당하는  Student를 설계
	 * 필드는 학급반
	 * 생성자는 기본생성자
	 * 메소드는 걷다 뛰다 를 가지고 있음
	 * 
	 * 자식클래스에 해당하는 Student클래스는 Person클래스를 상속받고
	 * 상속받은 부모 클래스에 걷다 라는 기능을 자식 클래스에서 재정의
	 * 
	 * Student 클래스를 인스턴스화 과정을 통해서 instance를 얻어와놓고
	 * 언도온 instance에 이름, 나이,. 학급반을 설정하고
	 * 
	 * 설정값 : 
	 * 		이름 : 홍길동
	 * 		나이 : 20
	 * 		학급반 304호	
	 * 	
	 *  출력 : 학생이 실행한 기능은 자식에서 실행합니다 / 걷다 입니다.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Person person = new Person();

		
		
		Studentu student = new Studentu();
		student.setName("김용호");
		student.setAge(32);
		student.setCla("304호");
		System.out.println();
		student.work();
		student.run();
	}
}

class Person{
	private String name;
	private int age;
	
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
		this.age = age;
	}
	public void work() {
		System.out.println("부모에서 실행합니다 / 걷다");
	}
	public void run() {
		System.out.println("부모에서 실행합니다 / 뛰다");
	}
	
}

class Studentu extends Person{
	private String cla;

	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	
	@Override
	public void work() {
		System.out.println("학생이 실행한 기능은 자식에서 실행 :걷다");
	}
	@Override
	public void run() {
		System.out.println("학생이 실행한 기능은 자식에서 실행 :뛰다");
	}
	
}









