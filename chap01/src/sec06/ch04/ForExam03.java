package sec06.ch04;

public class ForExam03 {
	public static void main(String[] args) {
		int[] arr = {2,5,9,10,56};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----");
		// foreach문
		// 순서가 있는 컬렉션(여러개 저장이 가능한)은 모두 올 수 있다.
		// for문이 해당 컬렉션이 끝값까지 돈다
		for(int val: arr) { // foreach는 해당 컬렉션(각 방)의 타입을 적어줘야함
			// index를 쓸수없기에 i로 활용을 못함.
			System.out.println(val);
		}
	}
}
