package sec06.ch06;

public class PolymorMission01 {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
//		Animal ani_1 = new Cat();
		
		// instanceof/ 왼쪽주소값이 오른쪽주소값이 가능하다면 true, 불가능하면f false
		
		System.out.println(hamster instanceof Hamster);
		cry(cat);
		cry(pig);
		cry(hamster);
//		Hamster ham = (Hamster)hamster;
//		// Hamster타입으로 강제 형변환 왜냐면, 상속 관계일때만 사용가능하다.
//		ham.runRail();
	}
	static void cry(Animal ani) { 
		// ani로 Hamster 객체의 주소값이 들어오면
		// howling메소드 말고, runRail 메소드 호춣해 주세요.
		// 다른 객체들은 howling 메소드 호출
		ani.howling();
	}
}


class Pig extends Animal { // class 자식 extends 부모
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}
}
class Hamster extends Animal {
//	@Override
//	void howling() {
//		System.out.println("찍! 찍!");
//	}
	@Override
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
	// 27~30을 주석한다면 아무것도 안찍히는게 아니라, 부모의 운다가 찍힌다 
}