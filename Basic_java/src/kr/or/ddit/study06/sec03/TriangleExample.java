package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0,0,10,0,0,10);
		
		
		System.out.println(t1);
		
		Point p1 = new Point(0, 0);
		Triangle t2 = new Triangle(p1, new Point(10, 0),new Point(0, 10));
		System.out.println(t2);
	}// 만들자 마자 넣는 방식과 하나씩 만들어서 넣는 방식이 있다.
}
