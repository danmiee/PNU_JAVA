package baekjoon.step06.string;

import java.util.Scanner;

public class q06_WordCount {

	public static int count(String str) {
		
		String[] arr = str.split(" ");
		int cnt = arr.length;
		
		if(arr[0].equals(""))
			cnt--;
		
		if(arr[arr.length-1].equals(""))
			cnt--;
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(count(str));
		
		sc.close();
	}
}
