package kr.or.ddit.study05.sec1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework07 {
	 Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework07 obj = new Homework07();
		obj.pricess1();
	}
	
	public void pricess1() {
		// 로또 번호 6개 출력

		/*
		 * 1.lotto 번호 45개 배열 temp상성 2. temp 배역 섞기 어제 숙제 참고 3. 6개 배열 lotto 생성 4. lotto배열에
		 * temp 앞에 6개 값 복사 정렬 결과 출력
		 */

		int[] num = new int[45];
		for (int i = 0; i <= 44; i++) {
			num[i] = i + 1;
		}

		int ran = new Random().nextInt(num.length);
		int select = num[ran];

		for (int i = 0; i < 1000000; i++) {
			int num1 = new Random().nextInt(num.length);
			int temp = num[0];
			num[0] = num[num1];
			num[num1] = temp;
		}
		System.out.println(Arrays.toString(num));
		int[] target = new int[6];
		System.arraycopy(num, 0, target, 0, 6);

		for (int i = 0; i < target.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < target.length - 1; j++) {
				if (target[j] > target[j + 1]) {
					int temp = target[j];
					target[j] = target[j + 1];
					target[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}

		System.out.println("이번주 당첨번호는");
		System.out.println(Arrays.toString(target));

	}
}

