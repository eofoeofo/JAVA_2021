package sec06.ch06;

public class StaticExam03 {
	public static void main(String[] args) {
		// static없이 메모리에 올리는 방법 = 객체화
		ClacInstance ci = new ClacInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : "+ result);
		
		// static은 굉장히 편한데, 무분별한 사용이 가능하다.
		// 항상 메모리에 올라가있기때문에 메모리 낭비가 일어날 수 있는데
		// 지금은 메모리가 넘치기 때문에 걱정하지 않아도 된다.
		int result2 = CalcStatic.sum(10, 30);
		System.out.println("result2 : " + result2);
	}
}
class CalcStatic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class ClacInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}



