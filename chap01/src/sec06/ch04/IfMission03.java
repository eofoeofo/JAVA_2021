package sec06.ch04;

public class IfMission03 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 20) + 81;
		System.out.println("SCORE : " + SCORE);
		String str ="A";
		String empty ="";
		//SCORE 값은 81~100 점 사이의 값이 된다 (실행할때마다 달라진다.
		
		//90~100 A (97점 이상은 "A+", 94~96 "A", 91~93 "A-"
		//90~100 B (87점 이상은 "B+", 84~86 "B", 81~83 "B-"
		
		
		if (SCORE >= 80 && SCORE <= 90 ) {
			str = "B";
		} 
		if(SCORE % 10 == 1 || SCORE % 10 == 2 || SCORE % 10 == 3) {
			empty = "-";
		}
		if(SCORE % 10 == 7 || SCORE % 10 == 8 || SCORE % 10 == 9 || SCORE % 10 == 0) {
			empty = "+";
		}
		System.out.printf("%s%s",str,empty);
	}
}
