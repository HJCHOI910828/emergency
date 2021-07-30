package sub3;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김철학
 * 내용 : 자바 배열 실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
	
		// 배열
		int[] nums = {1, 2, 3, 4, 5};
		
		// 배열 길이
		System.out.println("배열 nums의 원소의 갯수 : "+nums.length);
		
		// 배열 원소 출력
		System.out.println("배열 nums의 1번째 원소 : "+nums[0]);
		System.out.println("배열 nums의 2번째 원소 : "+nums[1]);
		System.out.println("배열 nums의 3번째 원소 : "+nums[2]);
		
		// 배열 반복문
		for(int num : nums) {
			System.out.println("배열 nums의 원소 : "+num);
		}
		
		// 문자열 배열
		String[] people = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(String person : people) {
			System.out.println("people 원소 : "+person);
		}
	}	
}






