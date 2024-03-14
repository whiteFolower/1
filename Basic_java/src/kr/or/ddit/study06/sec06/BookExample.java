package kr.or.ddit.study06.sec06;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("날아오르라 주작이여");
		b1.setName("마재훈");
		b1.setPd("주작엔터");
		b1.setDay("24년 02월 23일");
		
		
		Book b2 = new Book();
		b2.setName("남자는뭐?");
		b2.setName("추석준");
		b2.setPd("구라엔터");
		b2.setDay("24년 02월 23일");
		
		
		Book b3 = new Book();
		b3.setName("일찍일어나는법");
		b3.setName("박지완");
		b3.setPd("지각엔터");
		b3.setDay("24년 02월 23일");
		
	
		System.out.println(b1.getName());
	}
	
}
