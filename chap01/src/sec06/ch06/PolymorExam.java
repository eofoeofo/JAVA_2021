package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		Animal ani_1 = new Cat();
		// 부모(Animal)타입은 자식(Cat)객체를 가리킬 수 있다.
		System.out.println("끝");
//		Cat cat = new Animal();
		// 자식(Cat)타입은 부모(Animal)객체를 가리킬 수 없다.(뭘 해도 안됨)
		
		// ani_1에는 Cat객체의 주소값이 담겨있다.
		Cat cat = (Cat)ani_1; //  == Cat cat = new Cat() 과 같음
//		Cat cat1 = (Cat)new Animal("",0);
		Animal ani_2 = cat;
		// 부모보다 자식이 더 많은 메소드를 알고 있다.
		// 상속을 받으면 자식은 메소드를 오버라이드로 늘리면 늘렸지 부모보다 줄어들수는 없기때문에.
		ani_1.howling(); // 실행되는건 객체의 기준이다.
		// Animal타입이 아닌 Cat객체의 기준으로 실행되기 때문에 Cat객체의 howling이 실행된다. 
		cat.howling();
	}
}
// 멤버필드는 은닉화를 하기에 다형성 X
// 다형성은 메소드 기준으로 기억한다.

// 1. 부모타입은 변수는 자식객체를 가리킬 수 있다.(주소값을 담을수있다) 부모->자식 O
// 2. 자식타입의 변수는 부모객체를 가리킬 수 없다. 자식->부모 X
// 3. 타입은 아는 메소드만 호출 할 수 있다.
//	  호출이 되었다면 기준은 객체이다.