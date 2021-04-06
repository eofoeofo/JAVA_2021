package sec06.ch06;

public class InstanceExam05 {
	public static void main(String[] args) {
		Car[] carArr = new Car[5];
		// 5개의 칸을 가지고있는 것의 주소값을 가지고있다
		// 각 칸에는 Null값이다, Null은 주소값이 없다는 뜻
		// 이것 뿐만 아니라 레퍼런스변수는 모두 Null값이다.
		Car car1 = new Car();
		carArr[0] = new Car();
		// 처음에 Null이라서 주소값이 없기때문에 10Line처럼 주소값을 집어 넣어줘야함
	}
}

// void와 비void의 차이점은
// void는 값을 반환하지 않겠다로 볼 수 있고,
// 비void는 값을 반환하겠다로 볼 수 있다, 주소값이던 리터럴 값이던.
