package kr.or.ddit.Homework.home306;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = { "김용호", "추은주", "추석준", "양학균", "현병철", "추은혜", "신동민", "장수연", "장  민", "이성훈", "주현주", "권나라" };

		while (true) {
			System.out.println("원하시는 메뉴를 선택하세요");
			System.out.println("1. 학생 조회");
			System.out.println("2. 학생 변경");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 전체 조희");
			System.out.println("5. 종료");
			int num1 = sc.nextInt();

			
			if (num1 == 1) {
				System.out.println("조회 할 순번을 입력해주세요");
				int jo = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (jo == i) {
						System.out.println(name[i - 1]);
					}
				}System.out.println();
			} 
			else if (num1 == 2) {
				System.out.println("변경할 학생 번호를 입력하세요 : ");
				int num3 = sc.nextInt();
				System.out.println("변경할 이름을 입력하세요 : ");
				String name2 = sc.next();
				for (int i = 0; i <= name.length + 1; i++) {
					if (num3 == i) {
						name[i - 1] = name2;
					}
				}System.out.println();
			} 
			else if (num1 == 3) {
				System.out.println("   --------");
				System.out.println("1  | " + name[0] + " |");
				System.out.println("2  | " + name[1] + " |");
				System.out.println("3  | " + name[2] + " |");
				System.out.println("4  | " + name[3] + " |");
				System.out.println("5  | " + name[4] + " |");
				System.out.println("6  | " + name[5] + " |");
				System.out.println("7  | " + name[6] + " |");
				System.out.println("8  | " + name[7] + " |");
				System.out.println("9  | " + name[8] + " |");
				System.out.println("10 | " + name[9] + " |");
				System.out.println("11 | " + name[10] + " |");
				System.out.println("12 | " + name[11] + " |");
				System.out.println("   --------");
				System.out.println("삭제하실 학생의 번호를 입력하세요 ");
				int num2 = sc.nextInt();
				for (int i = 0; i <= name.length + 1; i++) {
					if (num2 == i) {
						name[i - 1] = " ";
						System.out.println("삭제 되었습니다.");
						System.out.println("현재 학생 : " + Arrays.toString(name));
					}
				}System.out.println();
			}

			else if (num1 == 4) {
				System.out.println("전체 학생 : " + Arrays.toString(name));
			} else {
				System.out.println("종료 되었습니다");
				break;
			}

		}
	}
}
