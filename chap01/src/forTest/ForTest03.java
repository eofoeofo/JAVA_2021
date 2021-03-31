package forTest;

public class ForTest03 {
	public static void main(String[] args) {
		int even = 0; // 짝수
		int odd = 0; // 홀수
		
		
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				even += i;
				System.out.println("숫자"+even);
			}
		}
		
	}
}
