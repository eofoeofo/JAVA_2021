package sec06.ch07;

import java.util.ArrayList; // ArrayList는 List를 상속받은 클래스다
import java.util.LinkedList;
import java.util.List; // List는 interface

import sec06.ch06.blackjack.Card;

public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new LinkedList();
		// 잦은 수정에서 링크드 리스트가 빠르다
		// 값과 다음번 주소를 같이 가지고있다.
		// 수정은,
		
		// 제약사항이 없기에 아무거나 다 들어가고
		// object타입으로 받기에 객체를 사용한다면 항상 형변환이 필수다
		list.add(10);
		list.add(1.1);
		list.add("dd");
		list.add(new Card("",""));
		Object obj = list.get(1); // return은 object타입이다
		int val2 = (int)list.get(0);
		double val = (double)obj;
		System.out.println("val : " + val);
		System.out.println("val2 : " + val2);
		/*
		Box box1 = new Box();
		box1.val = 10;
		
		Box box2 = new Box();
		box2.val = 20;
		*/
		
		
	}
}

class Box {
	int val;
	Box nextBox;
}
