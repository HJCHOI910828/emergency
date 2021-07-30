package sub1;

/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 객체생성 및 초기화
		Account kb = new Account("국민은행", "123-1213-1234", "김유신", 10000);
		
		Account wr = new Account("우리은행", "121-1010-1021", "김춘추", 30000);
		
		// 객체 활용
		kb.deposit(40000);
		kb.withdraw(5000);
		
		// 캡슐화 적용으로 취약코드 예방
		//kb.money++; // 취약코드
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		
		// 캡슐화 적용으로 취약코드 예방
		//wr.money -= 1; // 취약점
		wr.show();
		
		
		
		
		
		
		
	}
}
