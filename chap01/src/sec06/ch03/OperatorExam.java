package sec06.ch03;


public class OperatorExam {
	public static void main(String[] args) {
		// 산술 연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1+n2);
		System.out.println((double)n1 /n2);
		System.out.println(n1 * n2);
		System.out.println(n1%n2);
		System.out.println();
		System.out.println();
		
//		double result1 = (double)n1 / n2;
//		System.out.println(result1);
//		int result2 = n1 % n2;
//		System.out.println(result2);
		
		float result = (float)n1 / n2;
		// 형 변환을 해주어야 한다. ( float에 담기기 전에 int/int는 int 이기에
		// int값으로 float에 담아진다.)
		System.out.println("result : "+ result);
		
		// 이항 연산자
		int result2 = ((3 + 4) + 5) * 6;
		System.out.println("result2 : " + result2);
		
		int mod = 3 % 2;
		System.out.println("mod : " + mod);
		
		int odd = 3 % 2;
		int even = 4 % 2;
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		System.out.println("------------------------");
		
		// 단항 연산자
		int n3 = -1;
		System.out.println("n3 : " + -n3);
		
	}
}
