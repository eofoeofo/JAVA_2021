package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
//		Card c1 = new Card("spade","K");
//		println(c1);
//		// 원하는 값 space K
//		Card c2 = new Card("heart","2");
//		println(c2);
//		Card c3 = new Card("Diamonds","2");
//		println(c3);
//		Card c4 = new Card("clubs","J");
//		println(c4);
		
		CardDeck deck = new CardDeck();
		deck.deckout();
		
	}

	public static void println(String str) {
		System.out.println(str);
	}
	public static void println(Object obj) {
		String str = obj.toString();
		println(str);
		// 다시 String str오버라이드에 가서 실행됨
	}
}
