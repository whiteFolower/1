package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample02 {
	public static void main(String[] args) {
		// emp_no, emp_name, dept, tel 을 키값으로
		// 	100	 ,  홍길동     , 영업부 , 010-1234-5678를 Value로 넣어보기
		// put사용
		Map<String, Object> map = new HashMap();

		map.put("emp_no", 100);
		map.put("emp_name", "홍길동");
		map.put("dept", "영업부");
		map.put("tel", "010-1234-5678");
		
		//emp_no 꺼내기
		int emp_no = (int) map.get("emp_no"); //원하는 값을 get으로 꺼내고 int 로 값을 변환한다
		System.out.println(emp_no); 
		
		// tel 꺼내기
		String tel = (String) map.get("tel"); //원하는 값을 get으로 꺼내고 String 로 값을 변환한다
		System.out.println(tel);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ", " + map.get(key));
		}
		
		
		
	
	}
}

// HashMap를 사용하기 때문에 속도가 빠르다 