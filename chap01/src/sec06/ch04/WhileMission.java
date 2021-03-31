package sec06.ch04;

public class WhileMission {
	// 1~100 합계
	public static void main(String[] args) {

		int sum = 0, i = 0;
		while (i < 100) {
			i++;
			sum += i;
			
		}
		System.out.println("sum : "+sum);
	}
}
