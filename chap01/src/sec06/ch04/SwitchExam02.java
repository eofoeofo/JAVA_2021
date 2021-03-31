package sec06.ch04;

public class SwitchExam02 {
	public static void main(String[] args) {
		String habbit = "수영";
		
		switch(habbit) {
		case "수영": case "등산":
			System.out.println("건강한 취미이다.");
			break;
		case "술": case "담배":
			System.out.println("비건전한 취미이다.");
			break;
		}
	}
}
