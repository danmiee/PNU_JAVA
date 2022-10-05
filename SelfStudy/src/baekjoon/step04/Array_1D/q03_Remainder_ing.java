package baekjoon.step04.Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class q03_Remainder_ing {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int N[] = new int[10];
		int N[] = {39,40,41,42,43,44,82,83,84,85};
		int rN[] = new int[10];
		int temp[] = new int[10];
		int cnt=0;
		
		for(int i=0; i<N.length; i++) {
//			N[i]=sc.nextInt();
			rN[i]=N[i]%42;
		}
		System.out.println(Arrays.toString(rN));
		
		for(int i=0; i<rN.length; i++) {
			boolean flag = false;
			for(int j=0; j<temp.length; j++) {
				if(rN[i]==temp[j]) {
					flag = true;
					System.out.println(Arrays.toString(temp));
				}
			}
			if(!flag) {
				// ?????
				temp[cnt++] = rN[i];
			}
		}
		
//		for(int i=0; i<cntrN.length; i++) {
//			cnt += cntrN[i];
//		}
//		System.out.println(Arrays.toString(cntrN));
//		System.out.println(cnt);
	}
}
