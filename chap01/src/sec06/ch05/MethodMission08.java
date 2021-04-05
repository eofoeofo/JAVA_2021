package sec06.ch05;

public class MethodMission08 {
	public static void main(String[] args) {
		gugudan(9);
		gugudan(4, 8); // 단 바뀔 때 -----
//		for(int i=2; i<10; i++) {
//			gugudan(i);	
//		}
	}

	public static void gugudan(int n) {
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d\t", n, j, (n * j));
			System.out.println("");
		}
	}

	public static void gugudan(int n, int k) {
		for (int i = n; i <= k; i++) {
			gugudan(i);
			System.out.println("-----");
		}
	}
}
