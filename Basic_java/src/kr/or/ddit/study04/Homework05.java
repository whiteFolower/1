package kr.or.ddit.study04;

import java.util.Scanner;

public class Homework05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework05 obj = new Homework05();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		}
	
		public void method1() {
			/*
			 * 스캐너를 통해 입력 받은 단의 구구단 출력 ex) 4 4*1 = 4 4*2 = 9 ...
			 * 
			 */
			int num1 = sc.nextInt();
			for (int i = 2; i == num1; i++) {
				for (int n = 1; n <= 9; n++) {
					System.out.printf("%d * %d = %d\n", num1, n, num1 * n);
				}
			}
		
	}
	
	
//	for (int dan=2; dan<=9; dan++) {
//		for(int i=1;i<=9;i++) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//		}
//		System.out.println("-----------------------------");
//	
	
		public void method2() {
		/*
		 * 구구단 전체 출력
		 * 2*1 =2 3*1 =3..... 9*1=9
		 * 2*2 =4 3*2 =6..... 9*2=18
		 */
		for(int num2=1; num2<=9; num2++) {
			for(int i=2; i<=9; i++) {
				System.out.printf("%d * %d = %d\t", i, num2, num2*i);
				}
				System.out.println("");
			}
		}
		
	
		public void method3() {
			/*
			 * 구구단 전체 출력 입력 단은 단 제외 ex)4
			 */
			int a1 = sc.nextInt();
			for(int num3=1; num3<=9; num3++) {
				for(int i=2; i<=9; i++) {
					if(i!=a1) {
					System.out.printf("%d * %d = %d\t", i, num3, num3*i);
					}
					else {
						
					}
				}
				System.out.println("");
			}
		}
	
		
		public void method4() {
		/*
		 * 스캐너를 통해서 숫자를 입력받고 
		 * 홀수일 경우
		 * ex) 11 : 1+3+5+7+9+11
		 * 
		 * 짝수일경우
		 * ex)8: 2*2+4*4+6*6+8*8
		 */
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
