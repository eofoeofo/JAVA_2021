package sec06.ch04;

public class ForMission04 {
	public static void main(String[] args) {
		int star = (int)(Math.random()* 6) + 5;
		int sum = 0;
		System.out.println("star : " + star);
		//star = 5~10사이 랜덤값 
		//만약 star값이 5였다면 콘솔에 "*****"
		//만약 star값이 8이면 콘솔에 "*8개"
		
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
//		for(int i=star; i<=star; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//		}
	}
}
