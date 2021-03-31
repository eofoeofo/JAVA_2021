package sec06.ch04;

import java.util.Scanner;

public class IfScanner03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력 하세요.");
		int grade = sc.nextInt();
		System.out.println("점수를 입력 하세요.");
		int scoreInput = sc.nextInt();
		int score = 70;
		String pass = "불합격";
		
		if (grade != 4) {			
			if(scoreInput >= 60) {
				pass = "합격";
			} 
		} else {
			if(scoreInput >= score) {
				pass = "합격";
			} 
		}
		System.out.printf("%s학년 점수는\n%d\n%s",grade,scoreInput,pass);
	}
}
