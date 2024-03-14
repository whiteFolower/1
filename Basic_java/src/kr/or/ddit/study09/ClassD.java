package kr.or.ddit.study09;

import java.util.HashMap;

import kr.or.ddit.study09.ClassA.ClassB;
import kr.or.ddit.study09.ClassA.ClassC;

public class ClassD {

	public static void main(String[] args) {
	//클래스 b에 a값 출력	
		
	//클래스 c에 b값 출력
	
	ClassA ca = new ClassA();
	ClassB cb = ca.new ClassB();
	System.out.println(cb.a);
	
	ClassC cc = new ClassA.ClassC();
	System.out.println(cc.b);
	
	
	HashMap h = new HashMap();
	
	}
}
