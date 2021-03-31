package sec06.ch04;

public class IfExam02 {
	public static void main(String[] args) {
		int score = 103;
		
		if(score >= 90 ) {
			System.out.println("등급 A");
		} else if(score >= 80) {
			System.out.println("등급 B");
		} else if(score >= 70) {
			System.out.println("등급 C");
		} else if(score >= 0) {
			System.out.println("등급 D");
		} else if(score < 0) {
			System.out.println("에러");
		} 
	}
}
