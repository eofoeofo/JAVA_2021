package sec06.ch04;

public class ForMission06 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int k = 9;
				System.out.printf("%d * %d = %d", i, j, (i * j));
				if (i != k || j != k) {
					System.out.println();
				} else {
					return;
				}
			}
			System.out.println("");
		}
	}
}
