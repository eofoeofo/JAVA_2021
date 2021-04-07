package sec06.ch04;

public class IfExam05 {
	public static void main(String[] args) {
		// 삼항식
		System.out.println(abs(-10));
		System.out.println(abs(10));
	}
	public static int abs(int val) {
		return val < 0 ? -val : val;
		// 첫번째 조건식(val < 0)
		// true라면 -val // false라면 val
//		if(val < 0) {
//			return -val;
//		}
//		return val;
	}
}
