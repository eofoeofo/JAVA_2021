package sec06.ch07;

public class PolyExam {
/*
 	1. 부모타입은 자식객체의 주소값을 참조 할 수 있다. (참조,저장)
 	2. 자식객체는 부모타입의 주소값을 참조 할 수 없다. (남, 형제도 안된다)
 	3. 변수타입은 메소드 호출 여부만 결정(자기가 아는 것만 호출가능)
 	호출이 되었다면 실행 되는 것은 객체 기준이다.
 */
	public static void main(String[] args) {
		Car car1 = new Bus(); // Car타입이 Bus객체를 가르킴
		Car car2 = new Car(); // Car타입이 Car객체를 가르킴
		Car car3 = new LocalBus(); 
		
		Bus bus1 = (Bus)car2; // car1객체의 주소값을 담고있다. 
		// Bus(타입)->car1(객체)-> Car car1-> new Bus();
		bus1.openDoor(); // 객체에 있는 메소드에 접근
		bus1.hoot();
		
		
		System.out.println("끝");
		
	}
}
