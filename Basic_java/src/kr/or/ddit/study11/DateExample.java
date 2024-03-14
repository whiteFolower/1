package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}

	public void method1() {
		Date date = new Date();
		System.out.println(date);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Date date2 = new Date();
		System.out.println(date2);

		long time = date2.getTime() - date.getTime();
		System.out.println(time);
		
		System.out.println(date.getTime());  //기존시간보다 얼마나 시간이 지났는지 확인

	}
		
	public void method2() {
		Date date = new Date();
		//Date의 getTime은 특정 시점으로 부터 지난 시간이다.
		//몇년 몇일 몇시간 몇분 몇초 지낫는지 출력
		System.out.println(date.getTime());
		long time = date.getTime();
		
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = (long)(day*365);
		System.out.print(time/year+"년 ");
		time%=year;
		System.out.print(time/day+"일 ");
		time%=day;
		System.out.print(time/hour+"시 ");
		time%=hour;
		System.out.print(time/min+"분 ");
		time%=min;
		System.out.print(time/sec+"초 ");
		time%=sec;
	}
		
		
	public void method3() {
		Date date = new Date();

		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/ a hh:mm:ss");
		String result = sdf.format(date);
		//Date를 String으로 바꾼것
		//format(date) 
		System.out.println(result);
	}

	
	public void method4() {
		String str = "2024.09.23";
		
		// Try//catch를 사용하면 해당 구간에 에러가 뜰때 이 구간을 건너뛰고 실행이 되도록 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date date = sdf.parse(str);
			Date cur = new Date();
			System.out.println(date);
			long time = date.getTime() - cur.getTime();
			System.out.println(time);
			long sec = 1000;
			long min = sec*60;
			long hour = min*60;
			long day = hour*24;
			long year = (long)(day*365);
			System.out.print(time/year+"년 ");
			time%=year;
			System.out.print(time/day+"일 ");
			time%=day;
			System.out.print(time/hour+"시 ");
			time%=hour;
			System.out.print(time/min+"분 ");
			time%=min;
			System.out.print(time/sec+"초 ");
			time%=sec;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//long time = date2.getTime() - date.getTime();
	}

	
	public void method5() { //오버로딩을 이용해 다른 값을 출력한다
		//앞으로 100일뒤는 몇일일까
		Date d1 = new Date();
		System.out.println(d1);
		Date d2 = new Date(d1.getTime()+1000*86400*100);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(d2));
	}


	public void method6() { //메소드5에서 사용한것보다 훨씬 편하게 시간을 구할수 있다.
		Calendar cal = Calendar.getInstance(); //현재시간 저장
		cal.set(Calendar.YEAR, 2025);
		//cal.add(Calendar.HOUR,1); //Calendar. 에 원하는 시간을 넣고 숫자를 기입 후 적요
		Date date = cal.getTime();
		System.out.println(date);
	}

}
