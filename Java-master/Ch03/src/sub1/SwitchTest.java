package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김철학
 * 내용 : 자바 switch 조건문 실습하기
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		String animal = "tiger";
		
		switch(animal) {
			
		case "lion":
			System.out.println("animal은 lion입니다.");
			break;
			
		case "eagle":
			System.out.println("animal은 eagle입니다.");
			break;
			
		case "tiger":
			System.out.println("animal은 tiger입니다.");
			break;
			
		default:
			System.out.println("animal은 lion, eagle, tiger가 아닙니다.");
			break;
		}
		
		// 연습문제
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		int score = sc.nextInt();
		System.out.println("입력 점수 : "+score);
		
		switch (score/10) {
		
		case 10:
		case 9:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;			
		default:
			System.out.println("F 입니다.");
			break;
		}
	}	
}








