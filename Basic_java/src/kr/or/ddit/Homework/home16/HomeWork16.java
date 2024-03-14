package kr.or.ddit.Homework.home16;

import java.util.Scanner;

import kr.or.ddit.study02.sec04.scannerExample;
import kr.or.ddit.study07.Nation2;

public class HomeWork16 {
	public static void main(String[] args) {
		HomeWork16 hw = new HomeWork16();
		hw.process();
	}
	


	public void process() {
		Nation2 con = null;	
		Scanner sc = new Scanner(System.in);
		/*		
		 *    Nation 클래스 
		 *    1. tax  메소드 생성
		 *    2. game 메소드 생성
		 *    
		 *    1 -> 게임 시행시 모든 보유 금액에 관하여 세금이 매겨짐
		 *    2 -> 각 게임별 성공시 보상 금액 제공
		 * 
		 *    A 나라에서는 
		 *      1. 세금이 10% + 생활비 1000
		 *      2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000)  
		 *    B 나라에서는 
		 *      1. 세금이 15% + 생활비 2000
		 *      2. 가위바위보 게임  (상금 : 20000)
		 *    C 나라에서는 
		 *      1. 세금이 20% + 생활비 3000
		 *    	2. 홀짝 게임   (상금 : 15000)
		 *     
		 *   
		 */
		int cnt=0;
		int money = 10000;

		
		
		while(cnt++<10) {
			System.out.println("1. A나라");
			System.out.println("세금이 10% + 생활비 1000");
			System.out.println("주사위 2개 숫자 맞추기 게임. (상금 : 30000)");
			System.out.println("2. B나라");
			System.out.println("세금이 15% + 생활비 2000");
			System.out.println("가위바위보 게임  (상금 : 20000)");
			System.out.println("3. C나라");
			System.out.println("세금이 20% + 생활비 3000");
			System.out.println("홀짝 게임   (상금 : 15000)");
			System.out.println("현재 잔고 :" + money);
			System.out.println("원하는 나라를 선택하세요");
			System.out.println("A나라  A,  B나라  B,  C나라  C");
			String str1 = sc.nextLine();
			if(str1.equals("A")) con = new Acon();
			if(str1.equals("B")) con = new Bcon();
			if(str1.equals("C")) con = new Ccon();
			
			money += con.game();
			money = con.tax(money);
			
			if(money>0) continue;
			else if(money<=0)
				System.out.println("파산하셨습니다");
				break;			

		}
		
	}
}

//money += w.game();
//money = w.tax(money);
//System.out.println();
//
//if(money <= 0) {
//	System.out.println("파산");
//	break;
//}
//}
//System.out.println("종료");
//System.out.println("최종 금액 : " + money);
//}