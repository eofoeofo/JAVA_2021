package sec06.ch06;

public class OverrideExam {
	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
		
		System.out.println("nb1 == nb2\n" + (nb1 == nb2));
		System.out.println("nb1.equals(nb2) : " + nb1.equals(nb2));
	}
}

class NumBox {
	private int num;
	
	NumBox(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		// object는 모든 객체는 다 보낼수있다.
		NumBox temp = (NumBox)obj; 
		return this.getNum() == temp.getNum();
	}
	
}