package sec06.ch08;

public class ExceptionExam2 {

	public static void main(String[] args) {
		//CalC 객체화, div 메소드 호출 10, 2를 보내서 argument로 호출
		//return 값 받고 콘솔에 출력
		
		Calc cal = new Calc();
		int f=cal.div(10,0); //10,2 기준 결과 값이 오른쪽 자체가 됨(5.0)
		System.out.println(f);
	}

}

class Calc{
	int div(int n1, int n2) {
		int result=0;
		try {
			result= n1/n2;
		}catch(Exception e) {	
			System.out.println("예외 발생");
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("try 밖 실행");
		return result;
	}
} 

//int result없이 그냥 return 값만 준다면 "try 밖 실행"은 나오지 않지만, finally는 실행된다.
