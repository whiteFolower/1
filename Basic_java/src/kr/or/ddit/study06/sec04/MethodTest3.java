package kr.or.ddit.study06.sec04;

public class MethodTest3 {
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		int add = mt.add(10, 4);
		System.out.println(add);
		int sub = mt.sub(10, 4);
		System.out.println(sub);		
		int a = mt.a(10, 4);
		System.out.println(a);		
		int ma = mt.ma(10, 4);
		System.out.println(ma);
	}

	
	// a+b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int add(int a, int b){
		return a+b;
	}
	
	// a-b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int sub(int a, int b){
		return a-b;
	}
	// a/b 메소드를 만들고 결과값을 메인에 받아서 출력
		public int a(int a, int b){
			return a/b;
		}
	// a*b 메소드를 만들고 결과값을 메인에 받아서 출력
		public int ma(int a, int b){
			return a*b;
		}
	
	
}
