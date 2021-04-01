package sec06.ch05;

import java.util.Scanner;

public class VendingMachienMission03 {
	public static void main(String[] args) {

		String[] ArrMenu = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] ArrPrice = { 1000, 1200, 1300, 1500, 2000 };
		Scanner sc = new Scanner(System.in);
		System.out.printf("돈을 주입 해 주세요. ");
		int inputMoney = sc.nextInt();
		System.out.printf("주입 액 %,d원\n", inputMoney);
		System.out.println("<메뉴>\n메뉴를 입력하세요.\n0 입력시 종료");
		System.out.println("-------------------------------");

		for (int i = 0; i < ArrMenu.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", (i + 1), ArrMenu[i], ArrPrice[i]);
		}

		while (true) {
			System.out.println("선택 > ");
			int choice = sc.nextInt();
			int selectIdx = choice - 1;
			// 예외사항을 if,else로 모두 처리 했기에 내가 원하는(1~6)은 조건문이 들어가지 않아도 된다.
			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > ArrMenu.length) {
				System.out.println("잘못 선택 하셨습니다.");
				continue;
			} else if (inputMoney < ArrPrice[selectIdx]) {
				System.out.printf("금액이 부족합니다. " + "(남은 잔액 %,d원)\n다른 음료수를 선택하세요.\n", inputMoney);
				continue;
			} else if (inputMoney < ArrPrice[0]) {
				System.out.printf("잔액이 %,d원 이므로 판매를 중지합니다.\n", inputMoney);
				break;
			}
			inputMoney -= ArrPrice[selectIdx];
			System.out.printf("%s를 선택 하셨습니다.\n남은 잔액 %,d원\n", ArrMenu[selectIdx], inputMoney);
		}
		System.out.printf("종료\n총 금액은 %,d원 입니다.", inputMoney);
	}
}
