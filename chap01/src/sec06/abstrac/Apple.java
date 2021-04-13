package sec06.abstrac;

public class Apple extends Fruit{
	int expensive;
	@Override
	public void taste() {
		expensive +=2;
	}
	@Override
	public void sell() {
		System.out.println(expensive);
	}
}
