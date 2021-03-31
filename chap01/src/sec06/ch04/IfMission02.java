package sec06.ch04;

public class IfMission02 {
	//남자 평균 키 175
	//여자 평균 키 163
	public static void main(String[] args) {
		String gender = "여";
		int height = 15;
		
		//남자, 170> 평균 미만
		//남자, 175> 평균
		//남자, 176> 평균 초 
		//여자, 162> 평균 미만
		//여자, 163> 평균
		//여자, 164> 평균 초과
		
		if(gender.equals("남")) {
			if(height<175) {
				System.out.println("남자,평균 키 미만입니다");
			} else if(height==175) {
				System.out.println("남자,평균 키 입니다.");
			} else {
				System.out.println("남자,평균 키 이상 입니다.");
			}
		}
		if(gender.equals("여")) {
			if(height<163) {
				System.out.println("여자,평균 키 미만입니다");
			} else if(height==163) {
				System.out.println("여자,평균 키 입니다.");
			} else {
				System.out.println("여자,평균 키 이상 입니다.");
			}
		}
//		System.out.println(gender.equals("남"));
		
//		if()
		
	}
}
