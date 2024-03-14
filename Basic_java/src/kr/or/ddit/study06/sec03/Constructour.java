package kr.or.ddit.study06.sec03;

public class Constructour {
	
	public Constructour(){
		//기본생성자 => ()안에 아무것도 들어가있지 않은것
	}
	
	public Constructour(String test) {
		
	}
	
	public static void main(String[] args) {
		
		Constructour c1 = new Constructour();
	}
}
//생성자를 많이 만드는것을 오버 로딩이라고 함
//오버로딩/ 오버라이딩 차이점 면접 단골문제
//오버라이딩 : 부모에서 만든 메소드를 재정의 하는것
//오버로딩 : 여러개의 메소드를 파라미터의 따라 달라지는걸 오버로딩이라고함

// 