package sub5;

/*
 * 날짜 : 2021/05/25
 * 이름 : 김철학
 * 내용 : 추상클래스 실습하기
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//Unit unit = new Unit();
		Unit marin    = new Marin();
		Unit zealot   = new Zealot();
		Unit zergling = new Zergling();
				
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
	}
}













