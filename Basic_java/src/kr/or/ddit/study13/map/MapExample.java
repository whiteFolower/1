package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import oracle.net.aso.e;

/**
 *	 Hashmap
 *		- key 와 value로 이루어짐
 *		- key 값은 중복을 허용하지 않고 순서가 보장되지않음.
 *
 *	Map 타입의 대표 컬렉션
 *
 *	주요 메소드
 *	.put(key, value) : 데이터 입력 key 값은 중복되지 않음. value는 중복가능
 *	.get(key) 		 : 입력 받은 값을 key 값을 통해 꺼내 올수 있음.
 *	.clear()		 : 데이터 초기화
 *	.keySet() 		 : key 값을 set 타입으로 전부 가져옴.
 * key값을 넣으면 value 값이 나온다
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		
		map.put("홍길동", 95);
		map.put("이순신", 87);
		map.put("강감찬", 85);
		map.put("강감찬", 100); //키 값이 같은 곳에 value를 집어넣으면 덮어씌워진다
	
		Set<String> set = map.keySet();  //위와 같이 key 값의 제네릭은 String 으로 되어있기때문에 제네릭에 String을 넣어준다
		Iterator<String> it = set.iterator();   //위와 같이 key 값의 제네릭은 String 으로 되어있기때문에 제네릭에 String을 넣어준다
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+", "+map.get(key));
		}
	
	// Map에서 제일 중요한것은 키를 집어넣고 값을 꺼내는것이다.
	// remove는 삭제가 아니고 데이터를 꺼내오는 것이다.
	
	}
}
