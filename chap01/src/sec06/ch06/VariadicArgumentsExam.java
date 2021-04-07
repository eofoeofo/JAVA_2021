package sec06.ch06;

public class VariadicArgumentsExam {
	public static void main(String[] args) {
		// 가변인자는 오버로딩의 단점을 해소시켜주는 기능이다.
		// 원리는 자동으로 배열로 받아서 배열로 주기 때문에 길이의 제한이 없다
		Calc2 cal = new Calc2();
		int result = cal.sum(10,20);
		System.out.println(result);
		result = cal.sum(10,20,30);
		System.out.println(result);
		result = cal.sum(10,20,30,40);
		System.out.println(result);
	}
}
class Calc2 {
	// 가변인자를 사용하면 무조건 갯수 제한 없이 사용할 수 있게 된다.
	
	//배열로 주고 배열로 받는다.
	int sum(int...vals) {
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
