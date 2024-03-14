package Bogang304._06_Class;

public class Class2 {

	/*
	 * 챕터 6 클래스
	 * 
	 * 
	 * [클래스에서 가장 중요한 포인트가 잇음
	 * 
	 * 4. 오버로딩과 오버라이딩
	 * 5. 싱글톤
	 * ------------------------
	 * 
	 * 4. 오버로딩과 오버라이딩
	 * 
	 * 	1) 오버라이딩?
	 * 		- 같은 이름의 군락/ 영역/ 기능 등을 여러개 선언하는것
	 * 
	 * 		외부에서 제공되는 다양한 데이터들을 이용해서 객체를 초기화 하려면
	 * 생성자도 다양화될 필요가 있음
	 * 예를 들어 Car 객체를 생성할때 외부에서 제공되는 데이터가 없다면 기본 생성자로
	 * Car 객체를 생성해야 하고, 외부에서 별도의 1개의 데이터가 제공되거나 별도의 2개이상의 데이터가 제공될 경우에는 
	 * Car객체를 생성할 수 있어야 합니다,
	 * 생성자가 하나뿐이라면 이러한 요구 조건을 수용할수 없다,
	 * 그래서 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공한다.
	 * 
	 * 생성자 오버로딩이란? 매개변수를 달리하는 생성자를 여러개 선언하는것을 말함
	 * 
	 * 2) 오버라이딩이란?
	 *    - 부모클래스로부터 상속받은 메소드의 내용을 재정의(변경) 하는것
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		KiaCar kiaCar = new KiaCar();
		kiaCar.setName("아반떼");
		kiaCar.setMaxSpeed(100);
		
		kiaCar.drive();   // 기아 카에 있는 드라이브가 실행됨
		kiaCar.stop();
		// 자식클래스 안에 부모 클래스 와 같은 메소드를 만든다면 자식클래스의 메소드가 주체가 된다
		
		
		
		
		
	}
}

//오버라이드 연습해보기
//Car클래스를 부모클래스로 설계햅니다.
//KiaCar, HyundaiCar를 자식클래스로 설계합니다.
// 자식클래스는 부모 클래스 인 Car 클래스를 상속받아서 부모가 가지고 있는 기능을 사용할수 잇음
class Car{   //부모 클래스   
	private String color;
	private String oiltype;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOiltype() {
		return oiltype;
	}
	public void setOiltype(String oiltype) {
		this.oiltype = oiltype;
	}
	
	public void drive() {
		System.out.println("출발합니다!");
	}
	
	public void stop() {
		System.out.println("멈춥니다!");
	}
	
	
}


class KiaCar extends Car{
	private int maxSpeed;
	private String name;
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override  
	public void drive() {
		System.out.println(name+" 자동차가 출발합니다!");
	}
	
	@Override  //부모클래스에 있는것을 재정의 햇다고 표시해놓는것과 같다
	public void stop() {
		System.out.println(name + "자동차가 멈춥니다!");
	}
	
	
}













