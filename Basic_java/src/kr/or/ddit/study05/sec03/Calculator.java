package kr.or.ddit.study05.sec03;

public class Calculator {
	// 더하기 빼기 나누기 곱하기 메소드 만들기
	
	
	
	
//	public double cal(int a, String oper, int b) { // 얘만 호출이됨 
//		if(oper.equals( "+" )) return add(a, b);
//		else if(oper.equals( "-" )) return sub(a, b);
//		else if(oper.equals( "*" )) return mul(a, b);
//		else if(oper.equals( "-" )) return div(a, b);
//		else if(oper.equals( "%" )) return div(a, b);		
//		else System.out.println("지원하지 않는 연산입니다.");
//		return 0;
//	}
	
	public double cal(int a, CalType type, int b) { // 얘만 호출이됨 
		if(type == CalType.ADD) return add(a, b);
		else if(type == CalType.SUB) return sub(a, b);
		else if(type == CalType.MUL) return mul(a, b);
		else if(type == CalType.DIV) return div(a, b);
		else if(type == CalType.PER) return per(a, b);
		else System.out.println("지원하지 않는 연산입니다.");
		
		return 0;
	}
	
	private double per(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int add(int a,int b) {
		return a+b;
	}
	
	
	private int sub (int a,int b) {
		return a-b;
	}	
	
	private int mul(int a,int b) {
		return a*b;
		
		
		
	}	
	private int div(int a,int b) {
		return a/b;
	}
}
