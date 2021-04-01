package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = { 88, 65, 23, 1, 900, 42, 95 };
		int temp = 0;
		int temp1 = 0;
		temp = arr[0];
		temp1 = arr[1];
		arr[0] = temp1;
		arr[1] = temp;
		
//		int temp = arr[1];
//		arr[1] = arr[0];
//		arr[0] = temp;
		
		
		System.out.println(temp);
		System.out.println(temp1);
		
		
		System.out.println(Arrays.toString(arr));
	}
}
