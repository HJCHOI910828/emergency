package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 날짜 : 2021/05/27
 * 이름 : 김철학
 * 내용 : 자바 데이터베이스 프로그래밍 실습
 */
public class JDBCTest {
	
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
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!!!");
			}
			
			// 3단계 - SQL 실행객체 생성
			// 4단계 - SQL 실행
			// 5단계 - SQL 결과 처리(SELECT일 경우)
			// 6단계 - 데이터베이스 접속종료
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}









