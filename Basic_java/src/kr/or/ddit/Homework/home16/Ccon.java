package kr.or.ddit.Homework.home16;

public class Ccon extends Nation {
	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		money = (int)((double)money*0.8)-3000;
		return money;
	}

	@Override
	public int game() {
		// TODO Auto-generated method stub
		int ran1 = (int)(Math.random()+2);
		System.out.println("홀(1), 짝(2) 중 숫자를 입력하세요");
		int num2 = sc.nextInt();
		if(ran1%2==0 && ran1 == num2) {
			System.out.println("짝수 당첨");
			return 15000;
		}
		else if(ran1%2==1 && ran1 == num2) {
			System.out.println("홀수 당첨");
			return 15000;
		}
		else {
			System.out.println("꽝입니다");
			return 0;
		}

	}
}




//*      1. 세금이 20% + 생활비 3000
//*    	2. 홀짝 게임   (상금 : 15000)

