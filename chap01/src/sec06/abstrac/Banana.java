package sec06.abstrac;

public class Banana extends Fruit{
	int expensive;
	@Override
	public void taste() {
		expensive++;
	}
	@Override
	public void sell() {
		System.out.println(expensive);
	}
}
