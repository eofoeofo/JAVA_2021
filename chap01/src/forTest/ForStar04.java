package forTest;

public class ForStar04 {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 4) + 7;
		System.out.println("rand : " + rand);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i*2+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
