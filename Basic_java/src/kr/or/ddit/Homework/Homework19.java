package kr.or.ddit.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework19 {
	public static void main(String[] args) {
		Homework19 hw = new Homework19();
		hw.process();
	}
	public void process() {
		List<Map> list = dataInput();
		// 전체 출력하기
		printAll(list);
		
		// 차량번호를 입력하면 시간 계산
		int min = getMin(list, 5961);
		
		// 차량 시간별 요금 계산 
		int pay = pay(min);
		
	}
	
	public int pay(int min) {
//		기본 시간(분)	기본 요금(원)	단위 시간(분)	단위 요금(원)
//		180			5000			10		  600
		
		return 0;
	}
	
	public int getMin(List<Map> list, int carNum) {
		
		return 0;
	}
	
	public int getTime(String time) {
		//07:59
		String hours = time.split(":")[0];
		String mins = time.split(":")[1];
		return Integer.parseInt(hours)*60+Integer.parseInt(mins);
	}
	
	public void printAll(List<Map> list) {
		
	}
	
	public List<Map> dataInput(){
//		시각         차량 번호	 내역
//		05:34	5961	 입차
//		06:00	0000	 입차
//		06:34	0000	 출차
//		07:59	5961	 출차
//		07:59	0148	 입차
//		18:59	0000	 입차
//		19:09	0148	 출차
//		22:59	5961	 입차
//		23:00	5961	 출차
//		23:59	0000	 출차
		List<Map> list = new ArrayList();
		
		Map car = new HashMap();
		car.put("시각", "05:34");
		car.put("차량번호", "5961");
		car.put("내역", "입차");
		
		Map car1 = new HashMap();
		car1.put("시각", "06:00");
		car1.put("차량번호", "0000");
		car1.put("내역", "입차");
		
		Map car2= new HashMap();
		car2.put("시각", "06:34");
		car2.put("차량번호", "0000");
		car2.put("내역", "출차");
		
		Map car3 = new HashMap();
		car3.put("시각", "07:59");
		car3.put("차량번호", "5961");
		car3.put("내역", "출차");
		
		Map car4 = new HashMap();
		car4.put("시각", "07:59");
		car4.put("차량번호", "0148");
		car4.put("내역", "입차");
		
		Map car5 = new HashMap();
		car5.put("시각", "18:59");
		car5.put("차량번호", "0000");
		car5.put("내역", "입차");
		
		Map car6 = new HashMap();
		car6.put("시각", "19:09");
		car6.put("차량번호", "0148");
		car6.put("내역", "출차");
		
		Map car7 = new HashMap();
		car7.put("시각", "22:59");
		car7.put("차량번호", "5961");
		car7.put("내역", "입차");
		
		Map car8 = new HashMap();
		car8.put("시각", "23:00");
		car8.put("차량번호", "5961");
		car8.put("내역", "출차");
		
		Map car9 = new HashMap();
		car9.put("시각", "23:59");
		car9.put("차량번호", "0000");
		car9.put("내역", "출차");

		
		
		return list;
	}
}
