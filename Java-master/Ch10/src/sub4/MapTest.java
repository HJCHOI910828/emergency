package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2021/05/26
 * 이름 : 김철학
 * 내용 : 자바 컬렉션 맵 실습하기
 */
public class MapTest {

	public static void main(String[] args) {
		// Map 생성
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		// Map 데이터 갯수
		System.out.println("map1 데이터 갯수 : "+map1.size());
		
		// Map 데이터 출력
		System.out.println("map1 101번 데이터 : "+map1.get(101));
		System.out.println("map1 103번 데이터 : "+map1.get(103));
		System.out.println("map1 105번 데이터 : "+map1.get(105));
		
		// Map 응용 실습
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("태국", 3000));
		m3.put(302, new Apple("대만", 2000));
		m3.put(303, new Apple("홍콩", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 한국 사과 출력
		Map<Integer, Apple> map = list.get(0);
		Apple apple = map.get(101);
		apple.toString();
		
		// 호주 사과 출력
		list.get(1).get(203).toString();
		
		// 대만 사과 출력
		list.get(2).get(302).toString();
	}
}
