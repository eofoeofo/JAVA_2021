package sec06.ch06;

public class PolymorMission01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
//		Animal ani_1 = new Cat();
		cry(cat);
		cry(pig);
		cry(hamster);
	}
	private static void cry(Animal cry) {
		cry.howling();
	}
}


class Pig extends Animal { // class 자식 extends 부모
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
	// 27~30을 주석한다면 아무것도 안찍히는게 아니라, 부모의 운다가 찍힌다 
}