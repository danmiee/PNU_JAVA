package ch03_search.date221021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ch03_search.Fruit;

public class ComparableMethod {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("======스트링::");
		String[] s = { "참외", "사과", "배", "딸기", "오렌지" };

		// 오름차순 정렬
//		Arrays.sort(s);
		// comparator 메소드 활용 내림차순 정렬
//		Arrays.sort(s, Comparator.reverseOrder()); 

		// comparator generic 활용
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
//				return o2.compareTo(o1); // 내림차순으로 정렬
				return o1.compareTo(o2); // 오름차순으로 정렬
			}
		});

		Collections.sort(Arrays.asList(s));// s[]의 주소를 lst에서 사용하므로 변경됨
		System.out.println("오름차순");
		for (String fx : s)
			System.out.println(fx);

		System.out.println("array > list");
		List<String> lst = Arrays.asList(s);
		for (String fx : lst)
			System.out.println(fx);

//		s = Arrays.stream(s).sorted().toArray(String[]::new);
//		s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);

		System.out.println("======객체::");
		Fruit[] arr = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
				new Fruit("수박", 880), new Fruit("체리", 10) };

		// 객체배열(arr) 정렬
		System.out.println("오름차순");
		Arrays.sort(arr);
		for (Fruit fx : arr)
			// toString 기재하지 않아도 컴파일러가 자동으로 호출
			System.out.println(fx);

		// comparator generic 활용

		System.out.println("내림차순");
		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o2.compareTo(o1);
			}
		});
		for (Fruit fx : arr)
			System.out.println(fx);

		System.out.println("=====람다식::");

		// Fruit에 compareTo()가 있어도 람다식 우선 적용
		System.out.println("오름차순");
		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice());
		// comparator generic 활용 부분을 축약한 것
		for (Fruit fx : arr)
			System.out.println(fx);

//		System.out.println("내림차순");
//		Arrays.sort(arr, (a, b) -> b.getPrice() - a.getPrice());
//		for (Fruit fx : arr)
//			System.out.println(fx);

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();

		lst2.add(new Fruit("복숭아", 200));
		lst2.add(new Fruit("포도", 300));
		lst2.add(new Fruit("참외", 100));
		lst2.add(new Fruit("딸기", 50));
		lst2.add(new Fruit("블루베리", 500));
		lst2.add(new Fruit("구지뽕", 300));

		System.out.println("lst2 정렬전::");
		for (Fruit fx : lst2)
			System.out.println(fx);

		// list에서는 Arrays.sort 사용불가
//		Arrays.sort(lst2);

		// Collections.sort 사용
		Collections.sort(lst2);

		System.out.println("lst2 정렬후::");
		System.out.println("오름차순");
		for (Fruit fx : lst2)
			System.out.println(fx);

//		System.out.println("내림차순");
//		Collections.sort(lst2, (a, b) -> b.getPrice() - a.getPrice());
//		for (Fruit fx : lst2)
//			System.out.println(fx);

		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();

		Iterator<Fruit> iter1 = lst1.iterator();
		Iterator<Fruit> iter2 = lst2.iterator();
		Fruit data1 = iter1.next();
		Fruit data2 = iter2.next();

		System.out.println("=====merge:: ");

		while (iter1.hasNext() && iter2.hasNext()) {
			if (data1.compareTo(data2) < 0) {
				lst3.add(data1);
				data1 = iter1.next();
			} else if (data1.compareTo(data2) > 0) {
				lst3.add(data2);
				data2 = iter2.next();
			} else {
				lst3.add(data1);
				data1 = iter1.next();
				data2 = iter2.next();
			}
		}
		while (iter1.hasNext()) {
			lst3.add(data1);
			data1 = iter1.next();
		}
		while (iter2.hasNext()) {
			lst3.add(data2);
			data2 = iter2.next();
		}
		if (!iter1.hasNext()) {
			lst3.add(data2);
		}
		if (!iter2.hasNext()) {
			lst3.add(data1);
		}

		Collections.sort(lst3);
		
		for (Fruit fx : lst3)
			System.out.println(fx);

		Fruit newFruit = new Fruit("참외", 100);
		// binary search
		Comparator<Fruit> cc = new Comparator<Fruit>() {
			public int compare(Fruit u1, Fruit u2) {
				return u1.compareTo(u2);
			}
		};

		int result = Collections.binarySearch(lst3, newFruit, cc);
		System.out.println("조회결과 exist  " + result);

	}
}
