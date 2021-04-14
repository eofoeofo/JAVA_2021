package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr; 
	
	public MyArrayList() {
		arr = new int[0]; // 0개짜리방 arr에 주입
	}
	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1]; // 기존 길이보다 1칸 크게 // 처음에는 각방에 0만 세팅되있다
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp; // temp는 지역변수이기에 add메소드가 끝나면 소멸되기에 메소드가 
					// 끝나기전에 arr을 가르키게 하고 끝내는것
	}
	@Override
	public void add(int idx, int value) {
		int[] temp = new int[arr.length + 1]; 
		for(int i=0; i<arr.length; i++) {
			int tIdx = i < idx ? i : i +1;
			temp[tIdx] = arr[i];
		}
		temp[idx] = value;
		arr = temp;
	}
	@Override
	public int remove() {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		int lastVal = arr[temp.length];// 5 
		arr = temp; // lastVal로 미리 arr의 마지막방을 옮기지 않고 리턴하려하면 없는 값을 리턴하게 되므로 에러남
		return lastVal;
	}
	@Override
	public int remove(int idx) {
		int delVel = arr[idx];
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			
//			temp[i] = arr[i];
//			if(i==idx) {
//				temp[i] = arr[i];
//			}
			int tIdx = i < idx ? i : i +1;
			temp[i] = arr[tIdx];
		}
		arr = temp;
		return delVel;
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

}
