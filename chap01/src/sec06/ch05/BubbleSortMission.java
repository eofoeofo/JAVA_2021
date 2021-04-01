package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1, 6};
		int temp;
		int temp1;
		// 7,8,3,1,6    3,7,1,6,8	1,3,6,7,8
		// 7,3,8,1,6	3,1,7,6,8	  3 사이클
		// 7,3,1,8,6	3,1,6,7,8
		// 7,3,1,6,8 	  2 사이클
		//   1 사이클
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println("--------------------");
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-i-1; i++) {
//				if(arr[j]> arr[j+1]) {
//					temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}
}
