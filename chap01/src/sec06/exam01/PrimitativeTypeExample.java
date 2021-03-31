package sec06.exam01;

// 원시타입 VS 참조타입(Reference Type)
public class PrimitativeTypeExample {
	public static void main(String[] args) {
		// 총 8개
		// byte, short, int, long
		// float, double
		
		// byte  < short <  int  < long  < float < double
		// 1byte < 2byte < 4byte < 8byte < 4byte < 8byte
		byte var1 = 0; // MAX : 127
		short var2 = 127;
		var1 = (byte)var2;
		System.out.println("var1 : "+ var1);
		
		// char (문자형)
		// boolean
		// 원시타입은 리터럴값을 저장한다.
		
		float var3 = 10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : " + var4);
		
		byte b = 10;
		char c = 'a';
		int i = 15;
		double d = 3.2;
		String str = "A";
		
		char bloodType = 'O';
		int age = 10;
		float weight = 30.4f;
		String name = "홍길동";
		
		// 제 이름은 홍길동이고, 나이는 10살 혈액형은 O형 몸무게는 30.4kg이다.
		System.out.printf("제 이름은%s이고, 나이는 %d, 혈액형은%c, 몸무게는 %.1fkg입니다."
				,name,age,bloodType,weight);
//		System.out.println("제 이름은"+name+ "이고 나이는" +age+
//				", 혈액형은"+bloodType+ ", 몸무게는"+weight+ "입니다");
		
	}
}
