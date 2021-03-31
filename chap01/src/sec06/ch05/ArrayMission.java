package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		// 정수형 배열 생성(10칸)
		// 모든 방에 정수값 20을 ㅇ비력

		String[] intArr = new String[10];

		for (int i = 0; i < 10; i++) {
			intArr[i] = "꽃";
			System.out.printf("intArr[%s] = %s\n", i, intArr[i]);
		}
	}
}
