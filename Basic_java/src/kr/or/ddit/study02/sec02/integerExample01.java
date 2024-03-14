package kr.or.ddit.study02.sec02;

public class integerExample01 {
	public static void main(String[] args) {
		//정수형
		// 1) byte	: 1byte(127~-128)
		// 2) short	: 2byte(32767 ~ -32768)
		// 3) int 	: 4byte(2147483647 ~ -2147483648)  자바 기본 정수형
		// 4) long	: 8byte(2^63-1 ~ -2^63) 데이터 꼴에 L(l) 을 추가
		
		byte b1 = 127;
		System.out.println("b1="+b1);
		/*
		 * byte b2 = 128;
		 */
		
		short s1 = 100;
		System.out.println("s1="+s1);
		
		
		short s2 = (short)(s1+100);   // 정수 + 정수는 인트로 인식하기 때문에 short를 인식하지 못하고 int형을 인식하기때문에 실행 불가가 나온다  인식 변환하여 실행한다.
		
		int i1 = 100;
		System.out.println("i1="+i1);
		int i2 = i1+100;
		System.out.println("s2="+s2);
		
		
		int var1 = 200;							// 그냥 숫자를 입력시 10진수
		int var2 = 0200;						// 8진수
		int var3 = 0x200;						// 16진수
		int var4 = 0b1101;						// 2진수   바이너리
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		
		long l1 = 10000000000000000l; // long 사용시 인트 범위를 넘어가는 숫자를 쓸경우 뒤에 L을 붙여주어 long으로 인식되게 해줘야함
		long l2 = 1000;		// int 형에 맞춰줄수 있는 경우에는 L을 써주지 않아도 된다
		
		
		
	}
	
	
	
}
