package sec06.ch06;

public class StaticExam04 {
	public static void main(String[] args) {
//		StaticExam04.main(args); // 다른 main 메소드도 호출할수있
		ClacInstance2 c2 = new ClacInstance2();
		c2.num1 = 10;
		c2.num2 = 20;
		c2.sum();
		System.out.println(c2.sum());
	}
}
// 메소드안에서 static이 붙지 않은 메소드에서 멤버필드를 사용할 경우,
// 메소드엔 static을 붙일 수 없다!!!!!!!

//class CalcStatic2 {
//	int num1; // 여기서 오류가 나는데, static은 선언 즉시 메모리에 올라가있고,
//	int num2; // 변수들은 객체화를 해야 메모리에 올라가기에, 
//	static int sum() { // 현재 sum엔 num1,num2가 없다고 판단한다.
//		return num1 + num2;
//	}
//}
class CalcStatic2 {
	static int num1; // static이 붙은 메소드는 인스턴스 멤버필드를 사용할 수 없다
	static int num2;
	static int sum() {
		return num1 + num2;
	}
}

class ClacInstance2 {
	int num1;
	int num2;
	int sum( ) {
		return num1 + num2;
	}
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}