package kr.or.ddit.Homework10;

public class Grade {
		int n1;
		int n2;
		int n3;
		int sum;
		double avg;
		
	public Grade(int n1, int n2, int n3) {
			this.n1=n1;
			this.n2=n2;
			this.n3=n3;
			this.sum = n1+n2+n3;
			this.avg = this.sum/3.0;
		}

	@Override
	public String toString() {
		return "Grade [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", sum=" + sum + ", avg=" + avg + "]";
	}

}
