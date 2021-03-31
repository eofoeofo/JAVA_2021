package sec06.ch05;

public class ArrayMission02 {
	public static void main(String[] args) {

		int[] ArrVal = new int[10];
		for (int i = 0; i < ArrVal.length; i++) {
			ArrVal[i] += i+1;
			System.out.println("-");
		}

		for (int i = 0; i < ArrVal.length; i++) {
			System.out.printf("ArrVal[%d] = %d\n", i, ArrVal[i]);
		}
	}
}
