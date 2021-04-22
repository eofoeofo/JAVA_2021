package sec06.ch08;

public class ExceptionExam3 {

	public static void main(String[] args) {
		Calc2 c=new Calc2();
//		Exception e=new Exception();
		int result=0;
		try {
			result=c.div(10,0);
		} catch (Exception e) {
			e.printStackTrace(); //printStackTrace는 어떤 에러인지 알 수 있음
			System.out.println("예외 발생 시 처리하고 싶은 내용들");
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("result:"+result);
	}

}

class Calc2{
	int div(int n1,int n2) throws Exception{ //예외를 날린다..? 처리를 안 한다는 얘기
		return n1/n2;
	}
}
