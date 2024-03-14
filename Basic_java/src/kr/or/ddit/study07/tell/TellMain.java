package kr.or.ddit.study07.tell;

import java.util.Scanner;

public class TellMain {
	public static void main(String[] args) {
		System.out.println("전화 상담 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		Scanner sc = new Scanner(System.in);
		Schdeular dir = null;
		
		String num = sc.nextLine();
		if(num.equals("R")) dir = new RoundRobn();
		if(num.equals("L")) dir = new LeastJob();
		if(num.equals("P")) dir = new PriorityAllocation();
		
		dir.getNextCall();
		dir.sendCallToAgent();
		
		
		/*
		 * Schdeular 클래스
		 * 1.  getNextCall();
		 * 2.  sendCallToAgent();
		 * 
		 * RoundRobn LeastJob PriorityAllocation 클래스는 각각 
		 * Schdeular  클래스 상속 후 각 메세지를 출력할것
		 * 
		 * priorityAllocation
		 * 1> 우선 순위가 높은 상담전화를 대기열에서 가져옴
		 * 2> 우선 순위가 높은 상담전화를 대기열에서 가져옴
		 * 
		 * lesastjob 
		 * 1> 상담전화를 대기열에서 차례대로 가져옴
		 * 2> 대기열이 가장 짧은 상담원에게 상담전화를 분배
		 * 
		 * RoundRobn
		 * 1> 상담전화를 대기역에서 차례대로 가져옴.
		 * 2> 차례대로 상담원에게 상담전화를 분배
		 */	
	}
}
