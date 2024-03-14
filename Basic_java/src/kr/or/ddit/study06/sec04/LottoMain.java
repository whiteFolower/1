package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {
	public static void main(String[] args) {
		LottoMain lm = new LottoMain();
		int[][][] bundle = lm.lottoBundel(19000);
		lm.printbundle(bundle);

		
	}
	
	public void printbundle(int[][][] bundle) {
		for(int[][] paper : bundle) {
			System.out.println("============================");
			for (int[] lotto : paper) {
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("=============================");
		}
	}

	public String arrayToString(int[] lotto) {
		String result = "[";

		for (int i = 0; i < lotto.length; i++) {
			result += lotto[i];
			if (i != lotto.length - 1)
				result += ", ";
		}
		result += "]";

		return result;
	}

	public int[][][] lottoBundel(int money) {
		//
		int papers = money / 5000;
		if (money % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000 !=0) bundle[papers-1] = lottoPaper(money/1000%5);
		return bundle;
	}

	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int i = 0; i < paper.length; i++) {
			paper[i] = generateLotto();
		}
		return paper;
	}

	public int[][] lottoPaper() {
		return lottoPaper(5);
	}
	

//  1번으로 만듬
	// 로또 번호 6개 만들고 리턴 할것
	public int[] generateLotto() {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(45) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		Arrays.sort(lotto);
//		sort(lotto);
		return lotto;

	}
	
	
	// 1-1 만들어 ㄴ

	public void sort(int[] lotto) {
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
	}
}

