package sec06.ch05;

public class MethodMission04 {
	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0~9
		System.out.println("rNum (1) : " + rNum);

		int aa = 20;
		rNum = getRandomNum(aa); // aa의값(20)이 int num에 들어간다
		System.out.println("rNum (2) : " + rNum);
		rNum = getRandomNum(5);
		System.out.println("rNum (3) : " + rNum);

		rNum = getRandomNum(5, 10); // 랜덤값 5~10까지 나오게
		System.out.println("rNum (4) : " + rNum);
		
		rNum = getRandomNum(2, 11); // 랜덤값 5~10까지 나오게
		System.out.println("rNum (5) : " + rNum);
	}

	public static int getRandomNum(int min, int max) {
		int n1 = (int) (Math.random() * (max-min)+1) + min;
		return n1;
	} 

	public static int getRandomNum() {
		int n1 = (int) (Math.random() * 10);

		return n1;
	}

	public static int getRandomNum(int num) {
		int n1 = (int) (Math.random() * num);

		return n1;
	}
//	public static int getRandomNum(inum) {
//		int n1 = (int) (Math.random() * 10);
//		
//		return n1;
//	}
}
