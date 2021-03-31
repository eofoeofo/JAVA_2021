package forTest;

public class ForTest01 {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 1; i<10; i++) {
			x+=i;
			System.out.println("사이의 합은 :"+ x);
		}
		int k = 0;
		for (int i= 1; i<=10; i++) {
			if (i%2 == 1) {
				k+=i;
			}
			System.out.println("홀수" + k);
		}
		System.out.println("1~10사이의 홀수 합 : " + k);
	}
}
