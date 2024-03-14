package kr.or.ddit.study06.sec06;

import java.io.File;
import java.util.Date;

public class MethodTest6 {   // 재기함수
	public static void main(String[] args) {
		MethodTest6 mt = new MethodTest6();
		mt.process();

	
	} 
	
	
	

	
	public void process() {
		System.out.println(sum(10));
		method1(10);
		System.out.println("완료");
		
		Date d1 = new Date();
		
		System.out.println(febo(50));
		
		Date d2 = new Date();
	
		System.out.println(d2.getTime()-d1.getTime()+"ms");
	}
	
	public int method1(int num) {
//		//1*2*3.....10
//		int mul = 1;
//		for(int i = 1; i<=10; i++) {
//			mul *= i;
//		}
	if(num==1) return 1;
	return num*method1(num-1);
	}

	 public int sum(int num) {
			if(num==1) return 1; //끝나는 문장을 꼭 넣어줌 종료조건은 필수
			return num+sum(num-1);
	 }

	 public long sum1(int num1) {
		 return num1==1? 1:num1+sum(num1-1);
	 }

	 public void findFile(File file) {
		 if(file.isDirectory()) {
			 findFile(file);
		 }else {
			 System.out.println(file);
		 }
	 }
	 
	 long[] feboResult = new long[10000];
	 
	 /*피보나치 수열 구하기
	 * 1 1 2 3 5 8 13 21 34 55
	 *2 = 1+1
	 *3 = 2+1
	 *5 = 3+2
	 */
	 public long febo(int n) {
	      if(n <= 2) return 1;
	      long f1 = feboResult[n-1];
	      long f2 = feboResult[n-2];
	      if( f1 ==0) {
	    	  f1 = febo(n-1);
	    	  feboResult[n-1]=f1;
	      }
	      if( f2 ==0) {
	    	  f2 = febo(n-2);
	    	  feboResult[n-2]=f2;
	      }
	      return f1+f2;
	   }
	 
	 
}

