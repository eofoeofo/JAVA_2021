package sec06.ch05;

public class MethodMission03_1 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10); // sum = 50
		sumAllFromTo(2, 4);
		sumAllFromTo(4, 2);
		sumAllFromTo(1, 3);
		sumAllFromTo(1, 3);
		
	}
	public static void sumAllFromTo(int n1, int n2) {
		int sum = 0;
		for(int i = n1; i<=n2; i++) {
			sum += i;
		}
		for(int i = n1; i>=n2; i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}
