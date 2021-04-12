package sec06.ch07;

public class PolyExam02 {
	public static void main(String[] args) {
		//instanceof는 상속 관계일 때 사용하는 기능이다.(자식이 부모로 형변환할때 true)
		
		Car car1 = new LocalBus();
		System.out.println(car1 instanceof LocalBus);
		// car1이 LocalBus로 형변환이 가능한가?
		Bus bus1 = (Bus)car1;
		System.out.println(car1 instanceof Bus); 
		// 자식(왼쪽)은 부모(오른쪽)로 형변환이 가능한가?
		System.out.println("---------------------");
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);
		
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);
	}
}
