package kr.or.ddit.Homework.home16;

import kr.or.ddit.study07.Nation2;

public class Acon implements Nation2 {

	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		money = (int)((double)money * 0.9)-1000;
		return money;
	}

	@Override
	public int game() {
		// TODO Auto-generated method stub
		int sum = Onedice() + Twodice();
		System.out.println("2~12 숫자 입력");
		int di = sc.nextInt();
		System.out.println(sum);
		
		if(di == sum) {
			System.out.println("정답");
			return 30000;
		}
		else {
			System.out.println("꽝");
			return 0;
		}
	}
	
	public int Onedice() {
		int ran = (int)(Math.random()*6+1);
		return ran;
	}
	public int Twodice() {
		int ran = (int)(Math.random()*6+1);
		return ran;
	}
}


//세금이 10% + 생활비 1000
//주사위 2개 숫자 맞추기 게임. (상금 : 30000)