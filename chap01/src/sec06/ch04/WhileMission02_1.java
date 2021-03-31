package sec06.ch04;

public class WhileMission02_1 {
	public static void main(String[] args) {
		int sum = 0;
		//0이 아니면 계속 sum에 더하기
		
		while(true) {
			int val = (int)(Math.random() * 11); // 0~10사이
			System.out.println("val : " + val);
			if(val!=0) {
				System.out.println("val : " + val);
				break;
			}
			sum += val;
		}
		System.out.println("sum : " + sum);
	}
}
