package sec06.exam01;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 < num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = (char1 < char2);
		System.out.println("result5=" + result5);
		
		System.out.println((float)0.1 == 0.1f);

		// 숫자들만 가능한 비교타입들
		// <, >, >=, <=, ==, != 원시형 숫자타입 (char 포함)
		String str1 = "A";
		String str2 = "A";
		System.out.println("str1 == str2 : " +  (str1 == str2));
		
		// 문자열 비교
		System.out.println("str1.equlas(str2)" + str1.equals(str2));
	}
}
