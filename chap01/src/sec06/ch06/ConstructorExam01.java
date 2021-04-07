package sec06.ch06;

public class ConstructorExam01 {
	// 생성자, 객체지향 언어는 모두 생성자를 사용한다
	// 객체가 만들어질때 무조건 생성자를 호출 해야한다
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "SANSUNG";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.displayState();
		// SANSUNG 100inch 100Channel 100Volume
		
		Tv tv2 = new Tv("LG",200,300,200);
//		LG 200inch 300Channel 200Volume
		tv2.displayState();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		
		tv1.displayVolume(); // 현재 볼륨 : 3
		tv2.displayVolume();
	}
}

class Tv {
	String brand; // 전역변수, 객체가 사라질 때 까지 사용가능
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	// 기본 생성자
	// 생성자 vs 메소드
	// 생성자는 클래스명과 같아야하며, 리턴타입이 없다.
	// 생성자 존재 이유, 객체 생성 할 때 바로 초기화를 하기위하여.
	Tv(String brand, int inch, int maxChannel, int maxVolume) { 
		// 생성자는, 메소드의 한 종류이고, 객체 생성할때만 사용한다
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
 		this.maxVolume = maxVolume; 
	}
	Tv() { }
	
	void volumeUp() { // 메소드 안에서 변수선언은 지역변수
		int currentVolume = 0;
		// 변수명이 같지만 오류가 안나는이유는 전역변수와 지역변수이기에 가능하고,
		// main에서 찍어보면 값은 0이 나올것이다. 제일 가까운 변수를 사용. 
		this.currentVolume++;
		// 전역변수를 사용하려면 this.을 사용
	}
	void displayVolume() {
		System.out.printf("현재 볼륨 : %d\n",currentVolume);
	}
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n",
				brand,inch,maxChannel,maxVolume);
	}
}
