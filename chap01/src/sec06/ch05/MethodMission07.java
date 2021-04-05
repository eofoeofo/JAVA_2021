package sec06.ch05;

import java.util.Scanner;

public class MethodMission07 {
	// 남자 평균키 : 175, 여자 평균키 : 163
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		do {
			System.out.println("성별 : ");
			String gender = sc.next(); // 남, 여 만
			
			System.out.println("키 : ");
			int height = sc.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			// 성별: 남, 키:170, 평균 미만
			System.out.println("계속 하시겠습니까? (y,n)");
			answer = sc.next();
		} while(answer.equals("y"));
		System.out.println("끝");
	}
	
//	public static void gender2(String gender, int height) {
//		
//	}
	public static String chk(String gender, int height) {
//		String temp = "성별 : " + gender + ", 키 : " + height + ", 평균"; 
//		int MAN_STAND = 175;
//		int WOMAN_STAND = 163;
//		int stand = MAN_STAND;
//		String finalResult = "성별 : " + gender + ", 키 : " + height;
//		String displayResult = "평균";
//		if(gender.equals("여")) {
//			gender = "여";
//			stand = WOMAN_STAND;
//		}
//		if(height < stand) {
//			return finalResult + displayResult +"평균 미만";
//		}  else {
//			return finalResult + ", 평균 초과";
//		}
		int stand = 163;
		String result = "평균";
		switch(gender) {
		case "남": case "남자":
			stand = 175;
			break;
		case "여": case "여자":
			stand = 163;
			break;
		default:
			return "성별을 잘못 입력 하셨습니다.";
		}
		if(height > stand) {
			result = "평균 초과";
		} else if(height < stand) {
			result = "평균 미만";
		}
		// String.format!! 중요하다 자주쓰임!!
		return String.format("성별 : %s, 키  %dcm, %s", gender,height,result);
		//return엔 print출력문을 사용할수 없기에 string.format을 사용하면 된다.
//		return "성별 : " + gender + ", 키 : " + height + "cm, " + result;
	}
}
