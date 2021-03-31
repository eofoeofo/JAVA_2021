
public class IfMission2Another2_1 {
	public static void main(String[] args) {
		
		//		실무 정석 코드
		String gender = "여";
		int height = 163;
		
		String displayGender = "여자", displayResult = "평균";
		
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		int stand = WOMAN_STAND;
		
		if(gender.equals("남")) {
			stand = MAN_STAND;
			displayGender = "남자";
		} 
		if(height < stand) {
			displayResult = "평균 미만";
		} else if(height > stand) {
			displayResult = "평균 초과";
		} 
		System.out.printf("%s %s\n",displayGender, displayResult);
	}
}
