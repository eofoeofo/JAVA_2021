package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		//배열 (같은 타입의 변수 여러개를 편리하게 사용하기 위한 변수)
		
		int[] intArr = new int[10];
		
		intArr[0] = 11; 
		intArr[1] = 12;
		intArr[9] = 12;
		intArr[3] = intArr[9]+3; // 15
		System.out.println(intArr[4]);
		int[] intArr2 = {10,20,30};
		
		for(int i=0; i<3; i++) {
			System.out.printf("intArr[%d] : %d\n" , i , intArr[i]);
		}
	}
}
