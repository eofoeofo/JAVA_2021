package sec06.ch04;

public class WhileMission02 {
	public static void main(String[] args) {
		int sum = 0;
		int val = (int)(Math.random() * 11); // 0~10사이
		System.out.println("val : " + val);
		//0이 아니면 계속 sum에 더하기
		
		while(val!=0) {
			sum += val;
			val = (int)(Math.random() * 11);
			System.out.println("val : " + val);
		}
		System.out.println("sum : " + sum);
	}
}
