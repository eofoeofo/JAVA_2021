package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		//결과에 성별도 나타나도록 하기
		//남자, 170> 평균 미만
		//남자, 175> 평균
		//남자, 176> 평균 초 
		//여자, 162> 평균 미만
		//여자, 163> 평균
		//여자, 164> 평균 초과
		
		String gender = "남";
		int height = 179;
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if(gender.equals("여")) {
			stand = WOMAN_STAND;
		}
		System.out.printf("%s자이며, 키는 : %d\n",gender,height);
		if(height < stand) {
			System.out.println("평균 미만");
		} else if(height == stand) {
			System.out.println("평균");
		} else {
			System.out.println("평균 초과");
		}
		
	}
}
