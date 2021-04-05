package sec06.ch05;

public class MethodMission05 {
	// 메소드의 핵심, 중복된 소스 최대한 제거, 메소드의 재활용 극대화
	public static void main(String[] args) {
		int star = 5;
		printStarRev(star);
		System.out.println();
		star = 3;
		printStarRev(star);
		
	}
	public static void printStarLine(int n1) {
		for(int i=0; i<n1; i++) {
			System.out.print("*");
		}
	}
	public static void printStarSqure(int n1) {
		for(int i=0; i<n1; i++) {
			printStarLine(n1); // 중복된 소스 제거 및 재활용
			System.out.println();
		}
	}
	public static void printStarTri(int n1) {
		for(int i=0; i<n1; i++) {
			printStarLine((n1-n1+1)+i);
			System.out.println();
		}
	}
	public static void printStarRev(int n1) {
		for(int i=n1; i>=0; i--) {
			printStarLine(i);
			System.out.println();
		}
	}
}
