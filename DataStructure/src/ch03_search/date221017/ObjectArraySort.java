package ch03_search.date221017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ch03_search.Fruit;

// comparable : 자기자신과 매개변수 객체를 비교, import 불필요
// comparator : 두 매개변수 객체를 비교, import 필요

public class ObjectArraySort {
	public static void main(String[] args) {
//		String[] s = { "sort", "string", "array" };
//		Arrays.sort(s);
//		System.out.println(Arrays.toString(s));
//		Arrays.sort(s, Comparator.naturalOrder());
//		System.out.println(Arrays.toString(s));
//		Arrays.sort(s, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(s));
//		
//		/*
//		Arrays.sort(s, new Comparator<String>() {
//		    @Override
//		    public int compare(String o1, String o2) {
//		        return o2.compareTo(o1);            // 내림차순으로 정렬
//		    }
//		});
//		*/
//		s = Arrays.stream(s).sorted().toArray(String[]::new);	
//		s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
//		Collections.sort(Arrays.asList(s));

		Fruit[] arr = { 
				new Fruit("사과", 200), 
				new Fruit("키위", 500), 
				new Fruit("오렌지", 200), 
				new Fruit("바나나", 50),
				new Fruit("수박", 880), 
				new Fruit("체리", 10)
		};

//		System.out.println("arr 정렬전::");
//		for (Fruit city : arr)
//			System.out.println(city);

		Arrays.sort(arr);
		// 구현 - 정렬

		System.out.println("arr 정렬후::");
	    for ( Fruit city: arr)
		System.out.println(city);

		ArrayList<Fruit> list1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> list2 = new ArrayList<Fruit>();
		
		list2.add(new Fruit("복숭아", 200));
		list2.add(new Fruit("포도", 300));
		list2.add(new Fruit("참외", 100));
		list2.add(new Fruit("딸기", 50));
		list2.add(new Fruit("블루베리", 500));
		list2.add(new Fruit("구지뽕", 300));
		
//		System.out.println("list2 정렬전::");
//	    for ( Fruit city: list2)
//	    	System.out.println(city);
	    
	    Comparator<Fruit> cp = new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				// class Fruit에서 Override 완료
				return o1.compareTo(o2);
			}
	    };
	    
//	    Fruit[] arr2 = new Fruit[0];
//	    arr2 = list2.toArray(arr2);
//	    Arrays.sort(arr2);
	    Collections.sort(list2, cp);

		System.out.println("list2 정렬후::");
	    for ( Fruit city: list2)
	    	System.out.println(city);
	    
	    ArrayList<Fruit> list3 = new ArrayList<Fruit>();
		
		Iterator<Fruit> iter1 = list1.iterator();
		Iterator<Fruit> iter2 = list2.iterator();
		
	//구현- merge를 iterator 사용

		Fruit obj1 = iter1.next();
		Fruit obj2 = iter2.next();
		
		while(iter1.hasNext() && iter2.hasNext()) {
			if(obj1.compareTo(obj2)<0) {
				list3.add(obj1);
				obj1 = iter1.next();
			} else if(obj1.compareTo(obj2)>0) {
				list3.add(obj2);
				obj2 = iter2.next();
			} else {
				list3.add(obj1);
				obj1 = iter1.next();
				obj2 = iter2.next();
			}
		}
		while(iter1.hasNext()) {
			list3.add(obj1);
			obj1 = iter1.next();
		}
		while(iter2.hasNext()) {
			list3.add(obj2);
			obj2 = iter2.next();
		}
		if(!iter1.hasNext()) {
			list3.add(obj1);
		}
		if(!iter2.hasNext()) {
			list3.add(obj2);
		}
		
		Collections.sort(list3);

		System.out.println("merge:: ");
	    for ( Fruit city: list3 )
	    	System.out.println(city);
	    
	    Fruit newFruit = new Fruit("참외", 100);
		// binary search - Comparator를 사용한 구현
	    
	    Comparator<Fruit> cc = new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				// class Fruit에서 Override 완료
				return o1.compareTo(o2);
			}
		};

		System.out.println("조회 결과 ::");
	    if (Collections.binarySearch(list3, newFruit, cc) >= 0)
	    	/* binarySearch(a, key, comparator)
	    	 * a : 검색 범위
	    	 * key : 검색 대상
	    	 * comparator : 검색 조건
	    	 */
	    System.out.println(newFruit);
	    else System.out.println("조회결과 없다");

	}

}
