package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김철학
 * 내용 : 자바 if 조건문 실습하기
 */
public class IfTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		}
		
		if(num1 > 0) {
			
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}			
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		}
				
		// if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			// 조건이 참 일때
			System.out.println("var1이 var2보다 크다.");
			
		}else {
			// 조건이 거짓 일때
			System.out.println("var1이 var2보다 작다.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 =4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다.");
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
		
		// 연습문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력 점수 : "+score);
		
		if(score >= 90 && score <= 100) {
			// 90 ~ 100
			System.out.println("A 입니다.");
		}else if(score >= 80 && score < 90) {
			// 80 ~ 89
			System.out.println("B 입니다.");
		}else if(score >= 70 && score < 80) {
			// 70 ~ 79
			System.out.println("C 입니다.");
		}else if(score >= 60 && score < 70) {
			// 60 ~ 69
			System.out.println("D 입니다.");
		}else {
			//  0 ~ 59
			System.out.println("F 입니다.");
		}
	}
	
}

















