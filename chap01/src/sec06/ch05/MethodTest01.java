package sec06.ch05;

public class MethodTest01 {
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전월을 끕니다.");
	}
}
