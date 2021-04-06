package sec06.ch06;

public class InstanceExam04 {
	public static void main(String[] args) {
		Car carOne = new Car();
		carOne.name = "소나타";
		carOne.cc = 2000;
		
		Car carTwo = new Car();
		carTwo.name = "911";
		carTwo.cc = 5000;
		
		carOne.drive();
		carOne.stop();
		
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s은(는) 달린다.\n",name);
	}
	
	void stop() {
		System.out.printf("%s은(는) 멈춘다.\n",name);
	}
}
