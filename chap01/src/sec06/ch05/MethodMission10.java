package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrMenu = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] arrPrice = { 1000, 1200, 1300, 1500, 2000 };
		int choice = 0;
		int selectIdx = choice - 1;
		int money = 0;

		printMenu(arrMenu, arrPrice);
		String result = choice(arrMenu, arrPrice, money);
		System.out.printf("%s를 선택 하셨습니다.\n", arrMenu[selectIdx]);
		System.out.printf("종료\n총 금액은 %,d원 입니다.", money);

	}

	public static void printMenu(String[] arrMenu, int[] arrPrice) {
		String str = "<메뉴>\n";
		for (int i = 0; i < arrMenu.length; i++) {
			str += String.format("%d. %s (%,d원)\n", (i + 1), arrMenu[i], arrPrice[i]);
		}
		System.out.println(str);
	}

	public static String choice(String[] arrMenu, int[] arrPrice, int n) {
		int money = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			return "선택 >";
			n = sc.nextInt();
			if (n == 0) {
				break;
			} else if (n < 0 || n > arrMenu.length) {
				return "잘못 선택 하셨습니다.";
				continue;
			}
		}
		int selectIdx = n - 1;
		money += arrPrice[selectIdx];
		return money;
	}
}
