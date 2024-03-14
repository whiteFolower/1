package kr.or.ddit.study13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;

/**
 * Hashset
 * - KEY로 이루어짐
 * - KEY값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *
 *	Set 타입의 대표 컬렉션  - 배열과 다르다
 *	 s.add()
 * 	 s.remove()
 * 	 s.contains()
 * 	 s.iterator();
 * 
 */
public class SetExample {
	public static void main(String[] args) {
	
//		Set s = new HashSet();
//		s.add("a");
//		s.add(1);
//		s.add(10.5);
//		s.add("b");
//		s.add("가");
//		s.add("나");
//		s.add("다");
//		s.add("다");
//		s.add("다");
//		s.add("다");  // 중복이 되면 값이 1개만 출력됨
//		
//		Iterator it = s.iterator()
//				
//				;
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Set<Integer> s = new HashSet();
		while(s.size()<6) {
			s.add(new Random().nextInt(45)+1);
		}
		
		Iterator it = s.iterator();
		while(it.hasNext()) {    //hasnext 는 값이 들어가 있으면 참이 된다
			System.out.print(it.next()+", ");
		}//set은 map에서 그래로 사용된다
		
		
	}
}
