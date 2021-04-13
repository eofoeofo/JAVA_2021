package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {
	public static void main(String[] args) {
		List<Card> list = new ArrayList<>(); // 제네릭(제약사항을 주는것?)
		// 앞으로 들어갈 수 있는건 Card객체의 주소 마찬가지로 빼낼 때도 그렇다.
		Card c1 = new Card("","");
		list.add(c1);
//		list.add("ddd"); // Card객체가 아니라서 안됨
		
		Card c2 = list.get(0);
	}
}
