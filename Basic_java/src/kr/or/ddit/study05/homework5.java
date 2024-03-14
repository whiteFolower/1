package kr.or.ddit.study05;

import java.util.Scanner;

public class homework5 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework5 obj = new homework5();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}

	public void method1() {
		
		int num1 = sc.nextInt();
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n", num1, n, num1 * n);
			}
		}
	

	public void method2() {
		
		for (int num2 = 1; num2 <= 9; num2++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %d\t", i, num2, num2 * i);
			}
			System.out.println("");
		}
	}

	
	public void method3() {
		
		int a1 = sc.nextInt();
		for (int num3 = 1; num3 <= 9; num3++) {
			for (int i = 2; i <= 9; i++) {
				if (i != a1) {
					System.out.printf("%d * %d = %d\t", i, num3, num3 * i);
				} else {

				}
			}
			System.out.println("");
		}
	}

	
	public void method4() {
		
		System.out.println("숫자를 입력하세요 : ");
		int sum = 0;
		int num5 = sc.nextInt();
		if (num5 % 2 == 1) {
			for (int i = 1; i <= num5; i += 2) {
				sum += i;
			}
			System.out.println("구한 수는 : " + sum);
		} else if (num5 % 2 == 0) {
			for (int i = 0; i <= num5; i += 2) {
				sum += i * i;
			}
			System.out.println("구한 수는 : " + sum);
		}
	}
}