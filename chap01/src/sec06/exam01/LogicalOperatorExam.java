package sec06.exam01;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		// 논리 연산자 &&(AND) , ||(OR) , !(NOT)
		// 1개 짜리는 안쓰느게 좋다 퍼포먼스 저하
		boolean res1 = (1>5) && true && false;
		System.out.println("res1 : " + res1);
		// and는 false날 만한 확률이 높은걸 앞쪽에 배치하는게 좋다
		// 첫번째가 false라면 뒷쪽은 아예 절대 실행 안함(퍼포먼스 증가)
		// 모두 true일때만 true
		
		boolean res2 = false || false || true;
		System.out.println("res2 : " + res2);
		// 하나라도 true면 true 
		
	}
}
