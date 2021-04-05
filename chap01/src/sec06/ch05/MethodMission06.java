package sec06.ch05;

public class MethodMission06 {
	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
//		getRandomScore(score, score);

		char grade = getGrade(score);
		// 90점 이상 'A'
		// 80점 이상 'B'
		// 70점 이상 'C'
		// 60점 이상 'D'
		// 나머지 'E'
		char grade2 = getGrade2(score);
		// ?8 이상이거나 100점이면 '+'
		// ?3이하면 '-'
		// 나머지는 '' 빈칸 리턴

		System.out.printf("%d : %c%c\n", score,grade,grade2);
	}

	public static int getRandomScore(int n1, int n2) {
		int num = (int) (Math.random() * n1+1) + n1;
		return num;
	}

	public static char getGrade(int n1) {
		switch(n1/10) {
		case 10: case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		}
		return 'E';
	}

	public static char getGrade2(int n1) {
		int mod = n1 % 10;
		if(n1 == 100 || mod >=8 ) {
			return '+';
		} else if(mod<=3) {
			return '-';
		}
		return ' ';
	}
}
