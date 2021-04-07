package sec06.ch06;

public class AccessExam {
	public static void main(String[] args) {
				// Private -- default -- protected -- public
		// Class	 O			O			 O			O
		// 패키지		 X			O			 O			O
		// 상속관계 	 X			X			 O			O
		// 전체		 X			X			 X			O
		// 사용이유 캡슐화(외부에 보여지지 않게끔 보호하는 )
		// 패키지에서 가능하려면 상위,하위 가리지 않고 무조건 같아야함
		Access acc = new Access();
		acc.printNum();
	}
}

class Access {
	private int num = 10;
	
	void printNum() {
		System.out.println("Num : " + num);
		// private는 같은 클래스 내부에서만 사용이 가능하지만,
		// 메소드에 담아서 간접적으로 사용은 가능하다
	}
}
