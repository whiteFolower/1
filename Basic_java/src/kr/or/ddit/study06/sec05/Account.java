package kr.or.ddit.study06.sec05;



public class Account {
	int money = 100000;
	
	public void getMoney(int num) {
		if(money<num)
			System.out.println("잔고가 모자릅니다.");
			System.out.println("잔고 : "+money);
		System.out.println(num+"출금되었습니다.");
	
		money-=num;
		System.out.println("잔고가 모자릅니다.");
		System.out.println("잔고 : "+money);

	}

}
