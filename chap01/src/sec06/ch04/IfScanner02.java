package sec06.ch04;

import java.util.Scanner;

public class IfScanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력 하세요");
		
		int inputValue = sc.nextInt();
		String msg = "3의 배수가 아닙니다.";
		
		if(inputValue % 3 == 0) {
			msg = "3의 배수입니다.";
		} 
		System.out.println("입력 하신 값은 " + msg);
	}
}
