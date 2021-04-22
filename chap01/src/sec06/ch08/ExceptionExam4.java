package sec06.ch08;

import java.sql.*;


public class ExceptionExam4 {
	public static void main(String[] args) {
		//싱글톤이란 프로그램 안에서 객체 1개만 만들어지도록 유도
		//2개 이상 만들 수 없도록 함
		
		DbUtils du=DbUtils.getInstance(); //static을 받은 거니까 
//		DbUtils du2=DbUtils.getInstance();
		Connection con=du.getCon();
		
		// System.out.println(du==du2); 주소 값 달라서 안 나옴
	}
}
//외부에서 객체화되는 거 막기

class DbUtils{
	
	private DbUtils() {} //기본 생성자 막는 건 private 
	private static DbUtils dbutils = new DbUtils();
	//개발자들은 = 붙이는 거 싫어한대..
	
	public static DbUtils getInstance() {
//		if(dbutils==null) {
//			dbutils=new DbUtils();
//		}
		return dbutils;
	} //객체 1개 생성 
	
	Connection getCon(){
		Connection con=null; // 지역변수이기 때문에 null 안 넣어주면 에러 뜸
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//jdbc:mysql://ip주소:포트번호/데이터베이스명
			final String URL="jdbc:mysql://localhost:3308/java";
			final String USERNAME="root";
			final String PASSWORD="koreait";
			
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("접속 성공!");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패!");
		} //오른쪽 static 메소드(객체화를 안 하니까)
		return null;
	}
}
