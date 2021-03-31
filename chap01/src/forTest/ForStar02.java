package forTest;

import java.util.Scanner;

public class ForStar02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=1; j<2*num; j++) {
				if(j>=num-1 && j<=num+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				} if(j > num+i) {
					break;
				}
			}
			System.out.println();
		}
	}
}
