package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 *  -1차원 배열 구조
 *  -중복을 허용하고 순서화 제공
 *  -List 타입의 컬렉션
 *  
 *  주요메소드
 *  -add : 데이터 삽입
 *  -clear : 모든 데이터 삭제
 *  -contains : 포함 여부 확인
 *  -get : idx 자료반환
 *  -remove : idx 자료 반환 후 삭제
 *  
 *(도큐먼트주석은 클래스가 다른곳에서도 볼수 있는 주석)
 */
public class ArrayListExample {
   public static void main(String[] args) {
      List l = new ArrayList();
      for(int i = 0; i < 10; i++) {
         l.add("a"+i);
      }
      for(int i = 0; i < l.size(); i++) {
         System.out.println(l.get(i));
      }
      String a = "a0";
      
      if(l.contains(a)) {
         System.out.println(a+"값이 포함되어있음");
      }
      
      String result = l.remove(0) + "";
      
      System.out.println(result);
   }
}
// int 는 기본타입이기때문에 obj(오프젝트)에 넣을수 없다
// 래퍼클래스 Integer == int 를 Integer에 넣고 object에 넣는다  
