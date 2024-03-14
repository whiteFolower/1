package kr.or.ddit.Homework.home16;

public class Bcon extends Nation {
	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		money = (int) ((double) money * 0.85) - 2000;
		return money;
	}

	@Override
	public int game() {
		// TODO Auto-generated method stub
		int ran3 = (int) (Math.random() * 3);
		System.out.println("가위, 주먹, 보 중 하나를 입력하세요");
		String str = null;
		String num3 = sc.nextLine();
		switch (ran3) {
		case 0:
			str = "주먹";
			break;
		case 1:
			str = "가위";
			break;
		case 2:
			str = "보";
			break;
		}

		if ((str.equals("주먹") && num3.equals("보")) || (str.equals("가위") && num3.equals("주먹"))
				|| (str.equals("보") && num3.equals("가위"))) {
			System.out.println("이겼습니다");
			System.out.println(str);
			return 20000;
		} else {
			System.out.println("패배 or 비겼습니다");
			System.out.println(str);
		}
		return 0;
	}

}

//*      1. 세금이 15% + 생활비 2000
//*      2. 가위바위보 게임  (상금 : 20000)
