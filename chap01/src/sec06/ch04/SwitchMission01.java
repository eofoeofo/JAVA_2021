package sec06.ch04;

public class SwitchMission01 {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; // 8~11, 4는 0.999에서 *4를하면
		// 3.6666이 나오는데 강제형변환으로 3으로 받은것. 0~3 인데 +8을 넣어서 8~11이 된다.
		// 소괄호는 보통 메소드
		//time이 8이면 "출근합니다.
		System.out.println("time : " + time);
		switch(time) {
		case 8:
			System.out.println("출근합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		default :
			System.out.println("외근을 나갑니다");
		}
	}
}
