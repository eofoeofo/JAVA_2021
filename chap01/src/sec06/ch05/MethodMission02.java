package sec06.ch05;

public class MethodMission02 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1,n2); // 3.33 , 여기의 형과 메소드의 형은 같게 해줘야함
		System.out.println("result : " + result);
		
		result = (int)divide(10,7);
		
		System.out.println("result : " + result);
		System.out.println("절대값 : "+ abs(7));
		System.out.println("절대값 : "+ abs(-2));
		
		sum();
	}
	public static double divide(int n1,int n2) {
		return (double)n1 / n2;
	}
	public static int abs(int n1) {
		if(n1 < 0) {
			return -n1;
		}
		return n1;
	}
	public static void sum() {
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
