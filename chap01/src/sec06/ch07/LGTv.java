package sec06.ch07;

public class LGTv implements RemoteControl{
// 강제성이 심함, 무조건 Override를 사용해야함
	private int volume;
	// 삼성메소드와 엘지메소드가 서로 구현부가 다른 내용을 가지고있다.
	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {
		volume--;
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume);
	}

}
