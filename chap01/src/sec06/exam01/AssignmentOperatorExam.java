package sec06.exam01;

public class AssignmentOperatorExam {
	public static void main(String[] args) {
		// 대입 연산자
		int n1 = 0;
		n1 += 5; // 복합식
		System.out.println("n1 : " + n1);
		
		int n2 = 0;
		n2 += 5; // 복합식
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 -= 4; // 복합식
		System.out.println("n3 : " + n3);
		
		int score = 85;
		String grade = (!(score > 90)) ? "가" : "나";
		System.out.println(grade);
		
		int value = 356;
		System.out.println(value / 100 * 100);
		
		
		int lengthTop = 5;
		int legnthBottom = 10;
		int height = 7;
		double area = ((lengthTop + legnthBottom)) * (double)height / 2;
		System.out.println(area);
		
	}
}
