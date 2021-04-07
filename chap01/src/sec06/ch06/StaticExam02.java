package sec06.ch06;

public class StaticExam02 {
	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
//		System.out.println("장난감 생산 갯수 : " + t1.makeCount);
//		System.out.println("장난감 생산 갯수 : " + t2.makeCount);
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount);
	}
}

class Toy2 {
	// static이 붙으면 값이 메모리에 올라가기 때문에 main에서 바로 클래스명.~~으로 사용할 수 있게된다 
	static int makeCount;
	
	Toy2() {
		makeCount++;
	}
}
