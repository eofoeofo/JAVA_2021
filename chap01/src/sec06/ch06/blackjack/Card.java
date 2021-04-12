package sec06.ch06.blackjack;

public class Card {
	private String patten;
	private String symbol;
	
	public Card(String patten , String symbol) {
		this.patten = patten;
		this.symbol = symbol;
	}
	// 값을 넣는 방법 2가지 (생성자,set)
	// 값을 빼내는 유일한 방법(get)
	public String getPatten() {
		return patten;
	}
	public String getSymbol() {
		return symbol;
	}
	// to
	public void kk(String patten,String symbol) {
		System.out.printf(patten,symbol);
	}
	@Override
	public String toString() {
		return String.format("%s (%s)",patten,symbol);
	}
}
