package sec06.ch04;

public class ForExam04 {
	public static void main(String[] args) {
		String[] strArr = { "A", "B", "C", "D" };

		for (int i = strArr.length; i >0; i--) {
			System.out.println(strArr[i-1]);
		}
//		for (int i = strArr.length; i > 0; i--) {
//			for (String val : strArr) {
//				System.out.println(val);
//			}
//		}
	}
}
