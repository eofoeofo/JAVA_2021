package sec06.ch07;

public abstract class Animal {
	// 추상클래스는 부모의 역할만 하는 타입?과 강제성 부여
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void howling();
	// 추상 메소드가 있다면

	// 추상클래스는 강제성이있다. // 무조건 Override를 사용해야만 한다
	class Cat extends Animal {

		@Override
		public void howling() {
			System.out.println("야옹");
		}
	}

	class Dog extends Animal {

		@Override
		public void howling() {
			System.out.println("멍멍");

		}
	}
}
