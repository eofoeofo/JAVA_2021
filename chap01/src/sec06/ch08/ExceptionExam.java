package sec06.ch08;

public class ExceptionExam {

	public static void main(String[] args) {
		
		try {
			//예외 발생 가능성 다분
			System.out.println("핳");
		int result=10/0;
		System.out.println("result:"+result);
		System.out.println("헿");
		}catch(Exception e) {
			System.out.println("예외 발생!");
		}finally {
			//예외 터지등가 말등가
			System.out.println("무조건 실행!");
		}
		System.out.println("끝");
		
	}

}
