package sec06.ch05;

public class MethodExam {
	// void = 리턴타입 , main = 메소드 명 , 소괄호 = 파라미터(매개변수)
	public static void main(String[] args) { // 메인 메소드
		int result = sum(10,20);
		//1) 10,20값이 메소드sum의  n1,n2에 들어감
		System.out.println("sum- result : "+result);
		
		result = minus(20,10);
		System.out.println("minus- result : " + result);
	}
	
	// 중괄호 이전, 선언부라고 함 / 이후, 구현부
	public static int sum(int n1, int n2) {
		return n1 + n2;
		//2) 메인메소드의 호출부에서의 인자값(아규먼트)를을 구현부에서 받아서 계산을 한 뒤 
		// 다시 호출부로 return을 한다 
	}
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	public static int multiply(int n1, int n2) {
		return n1 * n2;
	}
	public static int division(int n1, int n2) {
		return n1 / n2;
	}
}
