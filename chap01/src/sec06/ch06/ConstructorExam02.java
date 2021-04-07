package sec06.ch06;

public class ConstructorExam02 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		// 일렉트로 50inch 100Channel 50Volume
	}
}

class Tv2 {
	String brand; // 전역변수, 객체가 사라질 때 까지 사용가능
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
		
		this.displayVolume();
		// 생성자 안에서 메소드 호출도 가능하다
	}

	Tv2() { // 생성자 안에서도 다른 생성자를 호출 가능하다
		this("일렉트로", 50, 100, 50); // 다른 생성자를 호출한 모습.
	}

	void volumeUp() { // 메소드 안에서 변수선언은 지역변수
		int currentVolume = 0;
		this.currentVolume++;
	}

	void displayVolume() {
		System.out.printf("현재 볼륨 : %d\n", currentVolume);
	}

	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}
