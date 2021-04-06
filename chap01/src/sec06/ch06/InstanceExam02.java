package sec06.ch06;

public class InstanceExam02 {
	public static void main(String[] args) {
		// 객체는 Heap 메모리에 생성된다.
		// new를 써야지만 객체(서로 다른 주소값)를 생성한다는 의미 !
		Dog dog = new Dog();
		// 이것은 stack에 생성되고 stack에서 heap을 가르키는 개념.
		Dog dog2 = new Dog();
		// dog와 dog2는 다른 주소값이고 같은 구조의 다른heap메모리를 가르킴
		Dog d2 = dog;
		// dog주소값을 d2에 복사, 결국 같은 주소값이 되었고, 같은 heap메모리를 가르키게된다.
		// 하나의 객체만이 참조가 가능한건 아니다.
		
		dog.name = "뽀삐";
		d2.name = "돌쇠";
		
		dog.bark();
	}
}
