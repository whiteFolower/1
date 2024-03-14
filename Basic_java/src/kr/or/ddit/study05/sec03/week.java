package kr.or.ddit.study05.sec03;

public enum week {
	MON("월"), TUE("화"), WED("수"), 
	THU("목"), FRI("금"), SAT("토"), SUM("일");
	
	String kor;
	week(String kor){
		this.kor = kor;
	}
}
