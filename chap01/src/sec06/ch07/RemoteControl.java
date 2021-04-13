package sec06.ch07;

// !!!!!!!! 무조건 선언부만 가질 수 있다.!!!!!!!!!!! (내용 못넣음)
// 변수라는 개념이 없고, 무조건 상수만 사용가능
// 추상 메소드보다 가볍다.

// 추상클래스 										인터페이스
// 객체화 불가능						   		   객체화 불가능
// 부모타입 역할								   부모타입 역할
// 자식에게 강제성 부여(추상 메소드 오버라이딩)		자식에게 강제성 부여(추상 메소드 오버라이딩)
// 다중상속X 										다중상속O

// 변수 가질 수 있음							변수 가질 수 없음(무조건 상수)
// 상수 가질 수 있음 							   무조건 상수
// 구현부 있는 메소드 가질 수 있음 				구현부 있는 메소드 가질 수 없음
// 추상 메소드 가질 수 있음			 		 추상 메소드만 가질 수 있음
public interface RemoteControl {
	// 인터페이스는 public final static이 항상 생략되어있다.
	int AGE = 10;
	
	// 메소드에선 public abstract이 생략되어있다.
	public abstract void volumeUp();
	abstract void volumeDown();
	void chkVolume();
}
