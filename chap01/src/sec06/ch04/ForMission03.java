package sec06.ch04;

public class ForMission03 {
	public static void main(String[] args) {
//		int sum = 0;
//		sum += 1;
//		System.out.println("sum : " + sum);
//		
//		sum += 2;
//		System.out.println("sum : " + sum);
//		
//		sum += 3;
//		System.out.println("sum : " + sum);
		
		int sum = 0;
		for(int i=0; i<21; i++) {
			sum += i;
		}
		System.out.println("1~20의 합은 " + sum);
	}
}
