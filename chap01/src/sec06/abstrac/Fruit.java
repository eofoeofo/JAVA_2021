package sec06.abstrac;

public class Fruit {
	public static void main(String[] args) {
		Apple ap = new Apple();
		Banana ba = new Banana();
		ap.sell();
		ba.sell();
	}
	int expensive;
	
	public void taste() {
		expensive++;
	}
	public void sell() {
		System.out.println(expensive);
	}
}
