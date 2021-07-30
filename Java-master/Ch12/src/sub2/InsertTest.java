package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2021/05/27
 * 이름 : 김철학
 * 내용 : 자바 데이터베이스 프로그래밍 실습
 */
public class InsertTest {

	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/chhak2021";
		String user = "chhak2021";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "INSERT INTO `USER1` VALUES ('J101', '김유신', '010-1211-1010', 27);";   
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과셋 처리(SELECT일 경우)
			// 6단계	- 데이터베이스 종료
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}












