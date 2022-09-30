package com.ruby.java.ch10;
// p.468~472
import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("서울");		list.add("북경");		list.add("상해");
		list.add("서울");		list.add("도쿄");		list.add("뉴욕");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.add("런던");		list.add("로마");		list.add("방콕");
		list.add("북경");		list.add("도쿄");		list.add("서울");
		System.out.println("1 : "+list.toString());
		
		
		list.add(1,"LA"); print(2,list);
		
		System.out.println("3 : " + list.indexOf("서울"));
		// ArrayList.indexOf : 목록에 지정된 요소가 처음 나타나는 인덱스 반환 (요소가 없으면 -1)
		
		System.out.println("4 : " + list.lastIndexOf("서울"));
		// ArrayList.lastIndexOf : 목록에서 지정된 요소가 마지막으로 발생한 인덱스 반환 (요소가 없으면 -1)
		
		list.remove("LA"); print(5, list);
		// ArrayList.remove : 목록에서 지정된 요소의 첫번째(인덱스가 가장 낮은) 항목 제거 (요소 없으면 변경 X)
		
		list.remove(2); print(6, list);
		// ArrayList.remove : 목록에 지정된 위치에 있는 요소 제거
		
		System.out.println("7 : " + list.contains("LA"));
		// ArrayList.contains : 목록에 지정된 요소가 하나 이상 포함되어 있으면 반환
		
		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));
		
	}
	
	private static void print(int i, ArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.println(i+" : "+list);
	}
	
	

}
