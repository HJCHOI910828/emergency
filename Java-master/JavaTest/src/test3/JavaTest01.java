package test3;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 클래스 연습문제
 */

public class JavaTest01 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		JavaTest01 obj = new JavaTest01();		
		obj.setName("홍길동");
		
		System.out.println(obj.getName());		
	}	
}
