package sec06.ch04;

public class IfMission {
	public static void main(String[] args) {
		int score = 71;
		
		if(score <= 69 ) {
			System.out.println("M 등급 D");
		} else if(score <= 79 ) {
			System.out.println("M 등급 C");
		} else if(score <= 89 )  {
			System.out.println("M 등급 B");
		} else if(score <= 100 ){
			System.out.println("M 등급 A");
		} 
		System.out.println("끝");
	}
}

