package sec06.ch04;

public class SwitchMission02 {
	public static void main(String[] args) {
		String pos = "과장";
		
		switch(pos) {
		case "부장" :
			System.out.println("월급이 700만원");
			break;
		case "과장" :
			System.out.println("월급이 500만원");
			break;
		default :
			System.out.println("월급이 300만원");
		}
	}
}
