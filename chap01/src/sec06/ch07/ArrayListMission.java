package sec06.ch07;

public class ArrayListMission {
	public static void main(String[] args) {
		MyList list = new MyArrayList(); // 자동 형변환 -> 뜻은 자식에서 부모로 올라갈때 자동으로 됨
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.add(2,30);
		
//		int val = list.remove();
//		System.out.println("val : "+ val);
		int delVal = list.remove(2);
		System.out.println("delVal : " + delVal);
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n",i, list.get(i));
		}
	}
}
