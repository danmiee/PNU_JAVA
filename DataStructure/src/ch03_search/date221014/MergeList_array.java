package ch03_search.date221014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeList_array {

	// 중복코드는 죄악! 메소드로 만들기
	private static String[] removeDuplicate(String[] lst) {
		// 중복제거
		int count = lst.length;
		for (int i = 0; i < count; i++) {
//		for (int j = i + 1; j < count; j++)   > 문제발생 > while로 변경
			int j = i + 1;
			while (j < count) {
				if (lst[i].compareTo(lst[j]) == 0) {
					lst = removeElement1(lst, lst[j]);
					// 중복제거로 인한 배열크기 축소
					count--;
				} else
					j++;
			}
		}
		return lst;
	}

	// 배열에서는 중복을 제거할 수 없어서 만들어준 메소드
	private static String[] removeElement1(String[] arr, String item) {
		// ArrayList 생성
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		// remove메소드로 요소제거
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");
		list1.add("서울");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add(1, "LA");
		list2.add("서울");
		list2.add("서울");
		list2.add("부산");
		list2.add("한라산");

		// 정렬
		System.out.println("collection.sort()::");

		System.out.println("list1::");
		Collections.sort(list1);
		for (String city : list1)
			System.out.print(city + " ");

		System.out.println();
		System.out.println("list2::");
		Collections.sort(list2);
		for (String city : list2)
			System.out.print(city + " ");

		// list > array
		String[] lst1 = new String[0];
		lst1 = list1.toArray(lst1);
		String[] lst2 = new String[0];
		lst2 = list2.toArray(lst1);

		// 중복제거
		lst1 = removeDuplicate(lst1);
		lst2 = removeDuplicate(lst2);

		System.out.println();
		System.out.println("lst1::");
		for (String city : lst1)
			System.out.print(city + " ");

		System.out.println();
		System.out.println("lst2::");
		for (String city : lst2)
			System.out.print(city + " ");

		// merge 구현 부분
		System.out.println();
		System.out.println("merge:: ");

		/*
		 * 1. lst3 = merge lst1 & lst2 2. lst3 중복제거
		 */
		String[] lst3 = new String[lst1.length + lst2.length];

		int i = 0, j = 0, k = 0;
		while (i < lst1.length && j < lst2.length) {
			int compare = lst1[i].compareTo(lst2[j]);
			if (compare < 0) {
				lst3[k] = lst1[i];
				i++;
				k++;
			} else if (compare > 0) {
				lst3[k] = lst2[j];
				j++;
				k++;
			} else {
				lst3[k] = lst1[i];
				i++;
				k++;
				j++;
//				lst3[k] = lst2[j];
//				j++; k++;
			}
		}
//		lst3 = removeDuplicate(lst3);

		while (i < lst1.length) {
			lst3[k] = lst1[i];
			i++;
			k++;
		}

		while (j < lst2.length) {
			lst3[k] = lst2[j];
			j++;
			k++;
		}

		for (String city : lst3)
			System.out.print(city + " ");

	}

}