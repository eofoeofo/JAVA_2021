package sec06.ch06;

public class OverLoadingExam01 {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.sum(5, 10);
		calc.sum(5, 15, 10);
	}
}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2);
	}
}
