package sec06.ch06;

public class InheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
	}
}

class Animal extends Object {
//	최상위 부모, object
	// 실행은 부모부터 -> 자식으로 순서로 실행된다.
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.println("운다");
	}
}
// 상속, class 자식 extends 부모 {} 
class Cat extends Animal {
	Cat() {
		super("",0); // 나의 바로 윗 부모를 지칭하는 뜻
		System.out.println("Cat 생성자");
	}
	void lick() {
		System.out.printf("%s가 핥다\n",name);
	}
	@Override
	void howling() {
		System.out.println("야옹");
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
