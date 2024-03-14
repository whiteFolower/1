package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {
		// 학생 3명 만들고 어레이 리스트에 담기
		Student s1 = new Student("장원영", "20");
		Student s2 = new Student("권나라", "25");
		Student s3 = new Student("김미연", "20");

		List<Student> l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);

		for (int i = 0; i < l.size(); i++) {
			Student stu = l.get(i);
			if (stu.name.equals("s2")) {
				System.out.println(stu.age);
			}
		}
		Student result = l.remove(1);
		System.out.println(result.name+", "+result.age);
	}
}

class Student {
	String name;
	String age;

	Student(String name, String age) {
		this.name = name;
		this.age = age;

	}
}

//  String result = l.remove(0) + "";
//List l1 = new ArrayList();
//l1.add("a");
//l1.add(1);
//l1.add(10.5);