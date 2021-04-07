package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setAge(10);
		h1.setName("미상");
		h2.setAge(20);
		h2.setName("신사임당");
		
		h1.whoAmI();
		h2.whoAmI();
	}
}

class Human {
	private int age;
	private String name;
	private final static String NAME = "미상";
	private final static int AGE = 10;
	// age멤버필드의 
	// set은 private타입을 값을 받아오는 기능이다
	// get은 private타입을 값을 외부로 빼내는 기능이다.
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
	Human() {
		this(NAME,AGE);
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Human(String name) {
		this(name,AGE);
	}
	Human(int age) {
		this(NAME, age);
	}
	public void whoAmI() {
		System.out.printf("이름 : %s, age : %d\n",name,age);
	}
	
	// private멤버변수에 값을 넣을 수 있는 방법은, 생성자와 메소드 뿐이다.
	// 생성자!

	// 메소드!
	// private멤버변수의 값을 넣고 빼낼 수 있는건 메소드 뿐이다.
}