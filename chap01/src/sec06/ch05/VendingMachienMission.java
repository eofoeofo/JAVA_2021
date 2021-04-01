package sec06.ch05;

import java.util.Scanner;

public class VendingMachienMission {
	public static void main(String[] args) {
		/*
		 * 돈을 주입해 주세요 : 3,000
		 * <메뉴> 
		 * 0. 종료 
		 * 1. 콜라(1,000원) 
		 * 2. 사이다(1,200원) 
		 * 3. 환타(1,300원) 
		 * 선택> 3 환타를 선택 하셨습니다. (남은 금액 1,700원)
		 * 선택> 1 콜라를 선택 하셨습니다. (남은 금액 700원)
		 * 선택> 6 금액이 부족합니다. (남은 금액 700원)
		 * 
		 * 선택> 6 잘못 선택 하셨습니다.
		 * 
		 */
		String[] ArrMenu = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] ArrPrice = { 1000, 1200, 1300, 1500, 2000 };
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("<메뉴>\n메뉴를 입력하세요.\n0 입력시 종료");
		System.out.println("-------------------------------");
		
		for (int i = 0; i < ArrMenu.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", (i + 1), ArrMenu[i], ArrPrice[i]);
		}
		// while문 바깥에 총액을 실행하는게 좋다.(다 날아갈수있음)
		while (true) {
			System.out.printf("선택>\n");
			int choice = sc.nextInt();
			int selectIdx = choice-1;
			if (choice == 0) {
				break;
			} else if (choice >= 1 && choice <= ArrMenu.length) {
				System.out.printf("%s를 선택 하셨습니다.\n", ArrMenu[selectIdx]);
				money += ArrPrice[selectIdx];
			} else {
				System.out.println("잘못 선택 하셨습니다.");
			}
		}
		System.out.printf("종료\n총 금액은 %,d원 입니다.",money);
	}
}
