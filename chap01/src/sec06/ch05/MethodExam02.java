package sec06.ch05;
// 메소드의 조합 -
// 리턴타입 - void / 비 void
// 파라미터값 - O / X 	총 4개가있다.
public class MethodExam02 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 30;
		
		// void형은 앞에 = 을 쓸수없다.
		// ex) int a = voidSum(1,1);
		// 애초에 타입이 없기때문에 쓸수없다.
		voidSum(n1,n2); // 메소드 호출 , 변수를 선언해도되고
		voidSum(1,2); // 메소드 호출	, 값만 써서 보내도된다
		System.out.println("----------");
		
		int result = intSum(n1,n2);
		System.out.println("result : "+ result); // 메소드 호출
		result = intSum(1,2);
		System.out.println("result : "+ result); // 메소드 호출
		hello(); // 메소드 호출
	}
	// void이면서 파라미터값이 없을수있다.
	public static void hello() {
		System.out.println("안녕하세여");
	}
	// void = 내가 리턴하지 않는것
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
		// 2차 가공이 필요없을 때는 void를 사용(간편하게 쓸때?)
		// 이미 메소드에서 
	}
	
	// 비void = 내가 리턴하는 것
	// 메인메소드에서와의 타입은 같아야함
	public static int intSum(int n1, int n2) {
		return n1 + n2;
		// 유연하게 사용할땐 비void를 쓴다. (형식적이지 않음)
		// 메인메소드에서 값을 받아서 마음대로 출력을 할수있기떄문에 
	}

}
