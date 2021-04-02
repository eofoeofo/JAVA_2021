package sec06.ch05;

public class MethodTest01_1 {
	public static void main(String[] args) {
		MethodTest01 myTest = new MethodTest01();
		myTest.powerOn();
		
		int result1 = myTest.plus(5, 6);
		System.out.println("result 1 : " + result1);
	}
}
