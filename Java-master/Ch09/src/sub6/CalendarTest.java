package sub6;

import java.util.Calendar;

/**
 * 날짜 : 2021/05/26 
 * 이름 : 김철학
 * 내용 : 자바 Calendar 클래스 실습하기
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		// 자바의 대표적인 싱글톤 객체
		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date  = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d\n", year, month, date);
		System.out.printf("%d:%d:%d\n", hour, min, sec);
	}
}
