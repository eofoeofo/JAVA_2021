package sec06.ch06;

public class InheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
	}
}

class Animal extends Object {
//	최상위 부모, object
	// 맨 마지막 자식을 실행하면 호출은 부모부터 -> 자식으로 순서로 실행된다.
	
	String name;
	int age;
	

	void howling() {
		System.out.println("운다");
	}
	void cry(Animal animal) {
		howling();
	}
}
// 상속, class 자식 extends 부모 {} 
class Cat extends Animal {
	Cat() {
		super(); // 나의 바로 윗 부모를 지칭하는 뜻
		System.out.println("Cat 생성자");
	}
	void lick() {
		System.out.printf("%s가 핥다\n",name);
	}
	@Override
	void howling() {
		System.out.println("야옹");
	}
	@Override
	void cry(Animal animal) {
		howling();
	}
	
}


class KoShort extends Cat {
	KoShort() {
		super();
	}

	void pee() {
		System.out.printf("%s가 소변한다\n",name);
	}
}

