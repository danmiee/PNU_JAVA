package ch03_search.date221012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//string 정렬, binary search 구현
//1단계: string, 2단계: string 객체,  Person 객체들의 list\
public class ArraySort {
	public static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // List
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		list.add(1, "LA");

		// sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩
		System.out.println("collection.sort()::");
//		Collections.sort(list);
		/*
		 * 배열인 city를 정렬하려면 반복for문에 if문을 중첩하여 사용하여야 함 String은 불가 정렬 기능을 가진 List를 활용하여
		 * 간편하게 코딩
		 */
		for (String city : list)
			System.out.println(city);

		String cities[] = new String[0]; // Array

		// List > Array
		cities = list.toArray(cities);

		// 배열을 정렬하기
		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++) {
				int cpt = cities[i].compareTo(cities[j]);
				String temp = null;
				if (cpt > 0) {
					temp = cities[j];
					cities[j] = cities[i];
					cities[i] = temp;
				}
			}
		}

		System.out.println("정렬후::");
		for (String city : cities)
			System.out.println(city);

		// 중복제거
		System.out.println("중복제거::");
		
		// 변수가 없어지기 때문에 안좋은 코딩. ArrayList에서 중복제거할 것
//		for (int i = 0; i < cities.length; i++) {
//			for (int j = i + 1; j < cities.length; j++) {
//				if (cities[i] != "" && cities[i].equals(cities[j])) {
//					cities[j] = "";
//				}
//			}
//		}

		// Array > List
		ArrayList<String> lst = new ArrayList<>();

		for(String item : cities) {
			if(!lst.contains(item))
				lst.add(item);
		}
		
		// 실패!  마지막 인덱스 중복여부 확인불가
//		int cnt = lst.size();
//		for(int i=0; i<cnt; i++) {
//			for(int j=i+1; j<cnt; j++) {
//				if(lst.get(i).equals(lst.get(j))) {
//					cnt--;
//					lst.remove(j);
//				}
//			}
//		}
		
		for (String city : lst) {
			System.out.println(city);
		}
	}
}