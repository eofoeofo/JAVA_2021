package forTest;

public class ForTest05 {
	public static void main(String[] args) {
		
		int num = 6;
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=num; j>(i*2)-(num-1); j--) {
				System.out.print("1");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
