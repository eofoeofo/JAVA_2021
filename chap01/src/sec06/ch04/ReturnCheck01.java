package sec06.ch04;

import java.util.Scanner;

public class ReturnCheck01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("입력하세요 :");
		
		int array[] = new int[5];
		int score = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]>30) {
				score = array[i];
				break;
			} else {
				System.out.println("불합격");
				return;
			}
		}
		System.out.println(""+score+"점 이므로 합격입니다.");
	}
}
