package kr.or.ddit.study05.sec1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
//		obj.method8();
//		obj.method9();
	}

	public void method1() {
		/*
		 * int 점수 5개 입력 후 종점 평균계산
		 * 
		 */
//		int a1 = 1;
//		int a2 = 2;
//		int a3 = 3;
//		int a4 = 4;
//		int a5 = 5;
//		int sum = a1+a2+a3+a4+a5;
//		double avg = sum/5;
//		System.out.println(sum);
//		System.out.println(avg);
		
		// 데이터 타입
		// []배열선언
		// new 메모리 할당
		// int[변수 개수]
		
//		int[] array = new int[5];
		int array[] = new int[5];
		array[0] = 100;
		array[1] = 100;
		array[2] = 100;
		array[3] = 100;
		array[4] = 100;
		int sum =0;
		for (int i=0;i<array.length; i++) {
			sum+=array[i];
		}
	}

	public void method2() {
		//정수  5개 입력하고 출력해보세요
		int[] array = new int [5];
		array[0] = 11;
		array[1] = 111;
		array[2] = 1111;
		array[3] = 11111;
		array[4] = 111111;
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}	
	}

	public void method3() {
		int[] score = {75, 80, 95, 81, 84};
		//최대값 구하기
		//최소값 구하기
		int max=score[0];
		int min=score[0];
		for (int i=0;i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			
			}
			
		}

		for (int i=0;i>score.length; i++) {
			if(min > 75) {
				min = score[i];
				
			}
	
		}
		System.out.println("최댓값 : "+max+","+"최솟값 : "+min);
	}
	
	public void method4() {
		int[] coin  = {50000, 10000, 5000, 1000, 500, 100, 50 ,10};
		
		// ex)55400 -> 10000*5+5000+100*4
		int num1 = sc.nextInt();
		for(int i=0;i < coin.length; i++) {
			int count = num1/coin[i];
			if(count==0) continue;
			num1 = num1%coin[i];
			System.out.println(coin[i]+":"+count+"개");
		}
	}
	
	public void method5() {
		//배열 복사 : 얕은 복사 (shallow copy), 깊은복사
		/*
		 * 1. 얕은복사
		 * 복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같은 변경
		 */
		int[] source = {1, 2, 3, 4, 5};
	      int[] target = source;
	      
	      
	      System.out.println(source);
	      System.out.println(target);
	      System.out.println("변경 전");
	      System.out.println(Arrays.toString(source));
	      System.out.println(Arrays.toString(target));
	      
	      
//	      for(int i = 0; i<source.length; i++) {
//	         System.out.print(source[i]);
//	      }
//	      System.out.println();
//	      for(int i = 0; i<target.length; i++) {
//	         System.out.print(target[i]);
//	      }
//	      System.out.println();
//	      target[2] = 10;
//	      for(int i = 0; i<source.length; i++) {
//	         System.out.print(source[i]);
//	      }
//	      System.out.println();
//	      for(int i = 0; i<target.length; i++) {
//	         System.out.print(target[i]);
//	      }
	}

	public void method6() {
		/*
		 * 2. 깊은 복사
		 * 배열 공간을 별도로 확보
		 * a. 반복문 이용
		 * b. System.arraycopy();
		 * clone();
		 * 
		 * 깊은 복사는 힙영역에 따로 변수를 만들어 그곳에 값을 복사하기때문에
		 * 복사한 값을 바뀌더라도 원본값은 바뀌지않는다.
		 */
		
		
		int[] source = {1,2,3,4,5};
		int[] target1 = new int[source.length];
		
		for( int i=0; i<source.length; i++) {
			target1[i] = source[i];
		}
//		a.  방법 ->  반복문 이용
//		System.out.println("변경 전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
//		
//		
//		target1[2] = 10;
//		System.out.println("변경  후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
		
		// b. system.arrayscopy();
		//  복사하고 싶은 위치와 복사할 위치를 확인하여 하고싶은곳에 복사
//		int[] target2 = new int[source.length];
//		System.arraycopy(source, 1, target2, 1, 4);
//		System.out.println("변경전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));
//		
//		target2[2]=10;
//		System.out.println("변경후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));
//	
		
		/* 
		 * c. clone
		 * 클론은 안에 값이 같이 변경되기때문에 배열안에 배열안에 배열을 사용하는것과 같은 
		 * 경우만 아니면 사용 x
		 */
		int[] target3 = source.clone();
		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));
		
		target3[2]=10;
		System.out.println("변경후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));		
	}

	public void method7() {
		// 버블정렬
		// 원본자료가  n개일때 n-1차 운행한다.
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은 값을 앞에 위치시킴
		int[] num= {67,55,9,86,98};
		System.out.println(Arrays.toString(num));
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
				int temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
				System.out.println();
				
			}
		}
	}
		System.out.println(Arrays.toString(num));

		

	}
	
	public void method8() {
		// 향상된 버블정렬
		// 원본자료가  n개일때 n-1차 운행한다.
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은 값을 앞에 위치시킴
		// 버블 정렬이 완료되면 반목문을 종료시킨다.
		int[] num= {67,55,9,86,98};
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length-1; i++) {
			boolean flag = true;
			for(int j=0; j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
				int temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
				flag = false;
			}
		}
		if (flag) break;
	}
		
		System.out.println(Arrays.toString(num));

		

	}
	//선택 정렬
	public void method9() {
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		for (int i=0; i<num.length-1; i++) {
			int minIndex = i;
			for(int j=i; j<num.length; j++) {
				if(num[j]<num[minIndex]) {
					minIndex = j;
				}
			}
			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}
		System.out.println(Arrays.toString(num));
	}
}


		
	
	
	
	
	

