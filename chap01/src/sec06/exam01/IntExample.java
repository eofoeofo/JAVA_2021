package sec06.exam01;

public class IntExample {
	public static void main(String[] args) {
		char c = 'a';
		byte b = 10;	// 5ml
		short s = 20;	// 1L
		int i = 30;		// 4L
		long l = 40;	// 8L

		
		s = b;		  // 자동형변환
		s = (short)i; // 문제가 될 경우에는 안쓰시거나
					  // 깅제형변환
	}
}
