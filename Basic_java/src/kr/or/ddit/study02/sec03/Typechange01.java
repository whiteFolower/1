package kr.or.ddit.study02.sec03;

public class Typechange01 {
	public static void main(String[] args) {
		
		String s1 = "20";
		String s2 = "23";
		
		System.out.println(s1+s2);

		
		int i2 = 23;
		System.out.println(s1+i2);      // 문자열 + 숫자를 하면 문자열이 됨
		
		int i1 = 20;
		
		System.out.println(i1+i2);
 		
		String str = ""+i1+i2;				// ""를 뒤로 보내면 문자열로 만들수 있음
		System.out.println(str);
		
		String str1 =i1+i2+ "";  			// "" 가 뒤로 가면 문자열로 변환하여 43을 문자열로 만듬 
		System.out.println(str1);
		
		
		
		
	}
}
