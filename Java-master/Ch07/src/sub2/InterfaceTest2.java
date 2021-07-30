package sub2;

/*
 * 날짜 : 2021/05/25
 * 이름 : 김철학
 * 내용 : 자바 인터페이스 실습하기
 */
public class InterfaceTest2 {

	public static void main(String[] args) {
		// 인터페이스 - 다중상속 효과
		SmartTv stv = new SmartTv();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}
}






