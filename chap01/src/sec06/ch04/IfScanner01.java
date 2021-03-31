package sec06.ch04;

import java.util.Scanner;

public class IfScanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int inputValue = sc.nextInt();
		
		if(inputValue > 50) {
			System.out.println("입력 하신 값이 50 이상입니다");
		} else {
			System.out.println("입력 하신 값이 50 미만입니다");
		}
	}
}
