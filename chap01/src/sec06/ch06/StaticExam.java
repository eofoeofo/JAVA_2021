package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		t2.name = "롯데";
		
		Toy.name = "SOC";
		// 
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name);
		// static은 접근할 때 클래스명.으로 접근하는게 좋다. 
	}
}
class Toy {
	static String name;
	// static은 한 값밖에 저장 못함.
}
