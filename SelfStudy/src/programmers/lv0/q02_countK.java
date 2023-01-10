package programmers.lv0;

import java.util.Scanner;

/*
1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
정수 i, j, k가 매개변수로 주어질 때, 
i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ i < j ≤ 100,000
0 ≤ k ≤ 9
 */
public class q02_countK {

//    public static int solution(int i, int j, int k) {
//        int answer = 0;
//        String str = "";
//        for (int x=i; x<=j; i++) {
//        	str += x;
//        }
//        
//        return answer;
//    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
    	int i=1;
    	int j=13;
    	int k=1;
    	
    	String str = "";
        for (int x=i; x<=j; x++) {
        	str += x;
        }
        
        int cnt=0;
        for (int x=0; x<str.length(); x++) {
        	if( str.charAt(x)==k)
        		cnt+=1;
        }
        
        System.out.println(cnt);
//		 Scanner sc = new Scanner(System.in);
//		 int n;
//		 System.out.println("확인할 데이터 수를 입력하세요");
//		 while((n=sc.nextInt())!=0) {
//			 System.out.println("시작값을 입력하세요");
//			 int i = sc.nextInt();
//			 System.out.println("종료값을 입력하세요");
//			 int j = sc.nextInt();
//			 System.out.println("등장횟수를 확인할 수를 입력하세요");
//			 int k = sc.nextInt();
//			 
//			 System.out.println(solution(i, j, k));
//		 }
//		 sc.close();
	}
}
