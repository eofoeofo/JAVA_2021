package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("차가 빵빵");
	}
	public void blowKlaxon() {
		hoot();
	}
}
// Bus와 Truck는 전혀 연관없다
class Bus extends Car {
	public void openDoor() {
		System.out.println("승객의 문을열다");
	}
}
// LocalBus도 Car의 자식이 되게된다.
class LocalBus extends Bus {
	public void openDoor() {
		System.out.println("승객의 문을열다");
	}
}
class Truck extends Car {
	@Override
	public void hoot() { // 이게 없다면 부모의 hoot으로 거슬러 올라간다
		System.out.println("TRUCK BANGBANG");
	}
	public void blowKlaxon() {
		hoot();
	}
}
