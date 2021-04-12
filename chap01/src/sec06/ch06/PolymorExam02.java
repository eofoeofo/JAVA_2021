package sec06.ch06;

public class PolymorExam02 {
/*
 	1. 부모타입은 자식객체의 주소값을 참조 할 수 있다. (가르킬 수 있다)
 	2. 자식객체는 부모타입의 주소값을 참조 할 수 없다. (남, 형제도 안된다)
 */
	public static void main(String[] args) {
	//  부모타입			// 자식객체
		Animal ani1 = new Hamster(); // 1번
		Animal ani2 = new Animal();
		Hamster ham = (Hamster)ani2; // 2번, 
		
		// 원래 안되지만, 강제형변환을 한것, 런타임 에러가 날것이다.
	}
}
