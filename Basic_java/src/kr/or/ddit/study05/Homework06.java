package kr.or.ddit.study05;
import java.util.Random; 
import java.util.Scanner;

public class Homework06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework06 obj = new Homework06();
		obj.method1();
	}

	public void method1() {
		/*
		 * 6개의 단어가 제공되며
		 * 이중 임의에 단어가 선택된다.
		 * 
		 * 사용자는 이를 보고 원래의 단어를 입력한다.
		 * 사용자가 단어를 맞출때 까지 반복하며 단어를 맞출었을때 시도 횟수 출력
		 * 
		 * 
		 */
		
		String[] words = {"deserve", "cart", "frigth", "scrub", "amount", "laugh"};
		
		int ran = new Random().nextInt(words.length);
		String select = words[ran];
		
		// toCharArray : 문자열 -> 문자배열로 변환
		int cnt = 0;
		char[] ch = select.toCharArray();
		for(int i = 0; i<1000000; i++) {
			int ran2 = new Random().nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = temp;
		}
		System.out.println(ch);

		while (true) {
			System.out.println("정답을 맞추시오 : ");
			String ran3 = sc.nextLine();
			if(ran3.equals(select)) {
				System.out.println("정답입니다");
				break;
			}
			cnt++;
			System.out.println(cnt+"번째 시도입니다");
		}
		
		
		//문제 출력
		// 스캐너 입력 받기
		// 스캐너 입력 받은 값과 정답 비교하기
		// 정답이라면 while문 종료		
		/*
		 * while(true) {
		 * for(int i=0; i<ch.length; i++)
		 * 		system.out.print(ch[i]);
		 * }
		 * string answer=sc.next();
		 * 
		 * if(answer.equa;s(select))){
		 *	 break
		 *}
		 *
		 *
		 */
	
		
		
		
		
		
		
	}


}
