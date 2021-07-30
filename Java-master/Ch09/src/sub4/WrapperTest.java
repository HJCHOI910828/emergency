package sub4;

/**
 * 날짜 : 2021/05/26 
 * 이름 : 김철학
 * 내용 : Wrapper 클래스 실습하기
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입(primitive)
		int     var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		char    var4 = 'A';
		
		// Wrapper 클래스로 포장(Boxing)
		Integer   w1 = var1;
		Double    w2 = var2;
		Boolean   w3 = var3;
		Character w4 = var4;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		// Wrapper 활용 : 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "true";
		
		int     val1 = Integer.parseInt(str1);
		double  val2 = Double.parseDouble(str2);
		boolean val3 = Boolean.parseBoolean(str3);
		
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		System.out.println("val3 : "+val3);
		
		// Wrapper 활용 : 문자열 -> Wrapper 변환
		Integer wr1 = Integer.valueOf(str1);
		Double  wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper 활용 : Wrapper -> 문자열 변환
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}
