package sec06.abstrac;

abstract public class SmartPhone {
	String call = "전화";
	String sns = "SNS";
	String search = "인터넷 검색";
	String game = "게임";
	String company, name, color, size, weight, price;

	public void purpose() {
		System.out.println("사용목적 : " + call + " / " + sns + " / " + search + " / " + game);

	abstract public void spec();

	}
}
