package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int val = sc.nextInt();
			int money = 0;
			if (val > 4 || 1 > val) {
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			}
			if (val == 1) {
				System.out.print("입금액 > ");
				money = sc.nextInt();
				balance += money;
			} else if (val == 2) {
				System.out.print("출금액 > ");
				money = sc.nextInt();
				balance -= money;
			} else if (val == 3) {
				System.out.printf("잔고> %d\n", balance);
			} else if (val == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");

//			switch(4) {
//			case 1:
//				balance += money;
//				System.out.printf("예금액> %d\n",balance);
//				break;
//			case 2:
//				balance -= money;
//				System.out.printf("출금액> %d\n",balance);
//				break;
//			case 3:
//				System.out.printf("잔고> %d\n",balance);
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				break;
//			}

	}
}
