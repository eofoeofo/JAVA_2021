package sec06.ch04;

public class ForMission08 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("star : "+star);
		int num = star+1;
		for(int i=0; i<num; i++) {
			for(int j=star; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
