package sec06.exam01;

public class OperatorExam2 {
	public static void main(String[] args) {
		int n1 = 10;
		System.out.println("n1 : " + n1);
		n1++;
		System.out.println("n1 : " + n1);
		++n1;
		System.out.println("n1 : " + n1);
		System.out.println("----------------------");
		
		int n2 = 10;
		int result = 10 + (++n2);
		System.out.println("n2 result : " + result);
		
		int n3 = 10;
		int result2 = 10 + (n3++);
		System.out.println("n3 result2 : " + result2);
		
		//논리 부정 연산자 (!)
		
		boolean result3 = !(10 > 2);
		System.out.println("result3 : " + !result3);
	}
}