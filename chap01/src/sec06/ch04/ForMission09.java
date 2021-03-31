package sec06.ch04;

public class ForMission09 {
	public static void main(String[] args) {

		// ____*
		// ___**
		// __***
		// _****
		// *****
		int star = 5;
		String sum ="*";
		for (int i = 1; i <=star; i++) {
			for (int j=star; j>i; j--) {
				System.out.print("_");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=star; i++) {
			for (int j=star; j>i; j--) {
				System.out.print("_");
			}
				System.out.printf("%s",sum);
				sum += "*";
			System.out.println();
		}
	}
}
