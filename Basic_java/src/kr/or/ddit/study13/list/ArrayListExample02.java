package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample02 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("a");
		l1.add(1);
		l1.add(10.5);
		
		String s1 = l1.get(0); //오브젝트 타입이기 때문에 꺼낼때 타입을 기입해줘야한다 (그걸 캐스팅이라고 한다)
		
		//제네릭이라고함 String을 기입하면 스트링만 넣을수 잇다
		List<String> l2 = new ArrayList();
		l2.add("a1");
		l2.add("a2");
		l2.add("a3");
		String s2 = l2.get(0);
		//제네릭에 스트링을 넣었기때문에 꺼낼때도 스트링이 나온다
		l2.add(3); // 숫자를 넣을시 스트링이 아니기 때문에 넣을 수 없다
	
	
	
	
	}
	

}
