package kr.or.ddit.study02.sec03;

public class Typechange02 {
	public static void main(String[] args) {
		// 문자열 -> 다른 타입으로 변환
		// 타입 변수명  = 타입 앞글자를 대문자 +parse타입 앞글자를 대문자
		
		
//		String s1 = "120";
////		byte b1 = Byte.parseByte(s)
//		byte b1 = Byte.valueOf(s1);   // 변환시 다른것이 기억나지 않으면 벨류of를 써서 변환해주면 같은 값을 얻을수 있음
//		System.out.println(b1+2);
//		
//		long l1 = Long.parseLong(s1);
		
		String s1 = "12";
		String s2 = "10";
		
		//s1, s2 int 값으로 바꾸고 두값을 더보시외
		
		
		int i1 = Integer.valueOf(s1);    // int는 integer를 다써줘야 수식 완료   래퍼클래스
 		int i2 = Integer.valueOf(s2);
		
		int result = i1+i2;
		System.out.println(result);
				
		
		
		
		
		
	}
}
