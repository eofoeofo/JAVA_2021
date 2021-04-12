package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52];
	// 레퍼런스 변수의 final은 주소값을 못바꿀뿐, 안의 값은 변경할 수 있다.
	// static을 붙이면 독립적이게 되므로 값이 하나가 되버린다
	// 필드변수에서 상수인 값은 무조건 넣어줘야하지만 
	// 예외는 생성자에서 값을 초기화 해준다면 필드변수에서 값을 초기화 하지 않을수있다
	public CardDeck() {
		// 생성자와 클래스의 접근제한자를 맞춰줘야한다.
		String[] patten = {"Spades","Hearts","Diamonds","Clubs"};
		String[] symbole = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		Card_ARR = new Card(patten * symbole);
		
		int cnt = 0;
		for(int i=0; i<patten.length; i++) {
			for(int j=0; j<symbole.length; j++) {
				CARD_ARR[cnt++] = new Card(patten[i],symbole[j]);  
			}
		}
	}
	
	public void deckout() {
		for(int i=0; i<CARD_ARR.length; i++) {
			System.out.println(CARD_ARR[i]);
		}
	}
}
