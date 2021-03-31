package forTest;

public class ForTest02 {
	public static void main(String[] args) {
		int x = 0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				x+=i;
				System.out.println("짝수를 찍어보자 : " + i);
			}
		}
	}
}
