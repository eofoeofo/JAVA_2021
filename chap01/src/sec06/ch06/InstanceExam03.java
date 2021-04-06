package sec06.ch06;

public class InstanceExam03 {
	public static void main(String[] args) {
		int mainNum = 10; // 리터럴값만
		
		Box box = new Box(); // 주소값이 들어있다 // Box객체의 주소값이 box에 담아진다
		box.num = 10; 
		
		changeNum(mainNum);
		System.out.println("mainNum : " + mainNum);
		
		changeBoxNum(box);
		System.out.println("box.num : " + box.num);
		System.out.println("mainNum : " + mainNum);
	}
	
	public static void changeNum(int num) {
		// int num과 main의 mainNum은 아예 다른 변수다.
		// 단지 mainNum의 값을 복사해서 메소드에 던져준것이다.
		// 그래서 여기서 값을 바꿔줘도 main에선 값이 변하지않는다.
		num = 20;
		// 값을 변하게 하려면 return method를 사용해야한다.
	}
	
	public static void changeBoxNum(Box box) {
		// 마찬가지로 main과 메소드는 다른변수이고, 주소값을 복사한 것.
		// main과 메소드는 다른 변수지만, 같은 주소값이다..
		box.num = 20;
		// box객체의 num주소에 접근해서 값을 변경한것이다.
		box = new Box(); // new가 나오면 새로운 객체가 생성되며 기존의 가르키고 있던
						 // 주소값도 변한다.
		// 레퍼런스변수는 굳이 return method를 사용할 필요가없다
		// ( void여도 주소값만 참조되면 값이 변하기때문에)
	}
}

class Box {// 클래스 안의 int 타입
	int num;
}
