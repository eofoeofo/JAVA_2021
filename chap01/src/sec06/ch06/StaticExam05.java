package sec06.ch06;

public class StaticExam05 {
	public static void main(String[] args) {
		//main 메소드로 객체화 시키는법.
		StaticExam05 se = new StaticExam05();
		se.n1 = 10;
		se.n2 = 20;
		int result = se.sum();
		System.out.println(result);
	}

	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}
}
