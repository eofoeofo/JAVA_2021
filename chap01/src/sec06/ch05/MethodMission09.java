package sec06.ch05;

import java.util.Arrays;

public class MethodMission09 {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };
		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}
//	public static String toString(int[] n) {
//		String temp = " ";
//		for(int i=0; i<n.length; i++) {
//			temp = toString(n);
//		}
//		return String.format("%d ",temp);
//	}

	public static String toString(int[] n) {
//		String str = Integer.toString(n[0]); 배열에서 string으로 강제 형변환
//		String str = "" + n[0]; // 강제 형변환
		int temp = n.length;
		String str = "";
		for (int i = 0; i < n.length; i++) {
			if(i != 0) {
				str += ", ";
			}
			str += n[i];
		}
		return String.format("[%s]", str);
	}
	//	public static String toString2(int[] n) {
	//	String temp = " ";
	//	for(int i=0; i<n.length; i++) {
	//		temp = toString(n);
	//	}
	//	return String.format("%d ",temp);
	//}
}
