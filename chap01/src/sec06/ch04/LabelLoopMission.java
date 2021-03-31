package sec06.ch04;

public class LabelLoopMission {
	public static void main(String[] args) {
		// n1,n2값이 8이 되면 모든for문 종료
		// n1,n2값이 같아지면 n1값을 올린다.
		OUTER: for (int n1 = 1; n1 <=9; n1++) {
			for (int n2 = 0; n2 <= 9; n2++) {
				if (n1 == n2 && n2 == 8) {
					break OUTER;
				} else if (n1 == n2) {
					System.out.println();
					break;
					// 원래는 continue를 만나면 현재 두번째 for문으로 가는데,
					// outer를 만났기에 첫번째 for문으로 가게된다. 
				}
				System.out.printf("%d%d\n", n1, n2);
			}
		}
		System.out.println("끝!");
	}
}
