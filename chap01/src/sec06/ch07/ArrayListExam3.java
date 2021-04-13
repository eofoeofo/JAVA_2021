package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		// int형은 풀네임으로 써준다.
		// List는 형들을 꼭 대문자로 써줘야하고, Wrapper Class라고 부른다
		
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n",i, list.get(i));
		}
		System.out.println("------------");
		for(int num : list) {
			System.out.println(num);
		}
	}
}
