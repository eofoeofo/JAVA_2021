package forTest;

public class ForEachExam01 {
	public static void main(String[] args) {
//		String[] name = {"KIM","JACK","LEE","DACUYA"};
//		for(int i=0; i<name.length; i++) {
//			System.out.println("name is : " + name[i]);
//		}
		
		String[] name = {"KIM","JACK","LEE","DACUYA"};
		for( String Nm : name ) {
			System.out.println("name is : " + Nm);
		}
	}
}
