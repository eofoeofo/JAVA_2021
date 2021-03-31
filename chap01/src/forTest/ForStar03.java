package forTest;

public class ForStar03 {
	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			for (int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(k);
			}
			for(int z=1; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
