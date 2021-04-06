package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrMenu = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] arrPrice = { 1000, 1200, 1300, 1500, 2000 };
		Drink[] drinkArr = new Drink[5];
		// drinkArr은 drink[]타입이지만 각각의 방은 drink타입이다.
		// (만약 String타입을 넣으면 XXX)
		// 호출과 출력할때 모두 타입이 drink로 변하지 않는다.
		for(int i=0; i<drinkArr.length; i++) {
			//for문이 돌면서 새로운 그릇이 생성됐고(new로 새로 선언해줘서)
			Drink drink = new Drink();
			// 새로운 그릇에 arrMenu[i]번쨰의 메뉴 이름이 들어가고
			drink.nm = arrMenu[i];
			// 새로운 그릇에 arrPrice[i]번쨰의 가격이 들어가고
			drink.price = arrPrice[i];
			
			drinkArr[i] = drink;
		}
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			// drinkArr[i]의 주소값을 drink에 넣는것이다.
			System.out.printf("%d. %s (%,d원)\n"
					, i+1, drink.nm, drink.price);
		}
		printMenu3(drinkArr);
		
//		drinkArr[0].nm = "콜라";
//		drinkArr[0].price = 1000;
//		printMenu(arrMenu, arrPrice);
		boolean run = true;
		while(run) { // boolean으로 리턴
			int selectedNum = sc.nextInt();
			System.out.println("선택 > ");
		}
		System.out.println("끝");
	}
	public static void printMenu3(Drink[] drinkArr) {
		String str = "<메뉴>\n";
		str += "0. 종료\n";
		System.out.println(str);
		for(int i=0; i<drinkArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n"
					, i+1, drinkArr[i].nm, drinkArr[i].price);
		}
	}
	//Scanner는 Scanner 타입/ 배열.length는 int타입
	// 만약 0번 입렿하면 return
//	public static boolean chooseMenu(Scanner sc, int len) { 
//		System.out.println("선택 > ");
//		return true;
//	}
		
//	public static void printMenu(String[] arrMenu, int[] arrPrice) {
//		String str = "<메뉴>\n";
//		str += "0. 종료\n";
//		for (int i = 0; i < arrMenu.length; i++) {
//			str += String.format("%d. %s (%,d원)\n", (i + 1), arrMenu[i], arrPrice[i]);
//		}
//		System.out.println(str);
//	}
}
