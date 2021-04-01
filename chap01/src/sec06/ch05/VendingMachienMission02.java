package sec06.ch05;

import java.util.Scanner;

public class VendingMachienMission02 {
	public static void main(String[] args) {
		/*
		 * <메뉴> 0. 종료 1. 콜라(1,000원) 2. 사이다(1,200원) 3. 환타(1,300원) 선택> 3 환타를 선택 하셨습니다. 선택>
		 * 6 잘못 선택 하셨습니다.
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

		while (true) {
			System.out.println("선택 > ");
			int choice = sc.nextInt();
			// 예외사항을 if,else로 모두 처리 했기에 내가 원하는(1~6)은 조건문이 들어가지 않아도 된다. 
			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > ArrMenu.length) {
				System.out.println("잘못 선택 하셨습니다.");
				continue;
			}
			int selectIdx = choice - 1;
			System.out.printf("%s를 선택 하셨습니다.\n", ArrMenu[selectIdx]);
			money += ArrPrice[selectIdx];
		}
		System.out.printf("종료\n총 금액은 %,d원 입니다.", money);
	}
}
