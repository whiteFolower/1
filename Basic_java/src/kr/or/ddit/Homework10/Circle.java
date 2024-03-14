package kr.or.ddit.Homework10;

public class Circle {
	double radious;
	double height;
	double pi = Math.PI;
	double area;
	double area2;
	
	
	public Circle(double radious, double height) {
		this.radious=radious;
		this.height=height;
		this.area = Math.PI*(this.radious*this.radious);
		this.area2 = this.area*height;
	}


	@Override
	public String toString() {
		return "Circle [radious=" + radious + ", height=" + height + ", pi=" + pi + ", area=" + area + ", area2="
				+ area2 + "]";
	}



	}
	
	//원동을 나타내는 Cylinder 클래스는 Crircle 형의 원과 실수형의 높이를 필드로 선언
	// 부피를 자동계산할것.
	// 부피구하는 공식 원의 넓이 * 높이
	
	//원이 넓이 구하는 생성자 만들것
	//원의 넓이 반지름*반지름*pi


