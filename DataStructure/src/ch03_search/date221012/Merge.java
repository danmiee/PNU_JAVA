package ch03_search.date221012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Merge {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add(1, "LA");

		// 정렬 sorting 실습
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

		// list1과 list2를 합쳐서 정렬한 list3 만들기
		ArrayList<String> list3 = new ArrayList<String>();

		// iter1.next : 다음 요소 가져오기
		// iter1.hasNext() : 다음 요소 있으면 1, 없으면 0
		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();
		
		// Iterator 실습
		while(iter1.hasNext()) {
            String obj = (String)iter1.next();
            list3.add(obj);
        }
		while(iter2.hasNext()) {
            String obj = (String)iter2.next();
            list3.add(obj);
        }
		Collections.sort(list3);
		// 정렬되어있는 것을 가져와서 다시 정렬 > 성능저하 > 중복제거 및 한번에 처리 필요
		
		System.out.println();
		System.out.println("merge:: ");
		for (String city : list3)
			System.out.print(city + " ");

	}
}