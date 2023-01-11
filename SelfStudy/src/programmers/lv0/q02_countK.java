package programmers.lv0;

import java.util.Scanner;

/*
1���� 13������ ������, 1�� 1, 10, 11, 12, 13 �̷��� �� 6�� �����մϴ�. 
���� i, j, k�� �Ű������� �־��� ��, 
i���� j���� k�� �� �� �����ϴ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
1 �� i < j �� 100,000
0 �� k �� 9
 */
public class q02_countK {

    public static int solution(int i, int j, int k) {
    	String str = "";
        for (int x=i; x<=j; x++) {
        	str += x;
        }
        
        int cnt=0;
        for (int x=0; x < str.length(); x++) {
        	if(((int) str.charAt(x))-48 == k) {
        		cnt += 1;
        	}
        }
        return cnt;
    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        
		 Scanner sc = new Scanner(System.in);
		 int n;
		 System.out.println("Ȯ���� ������ ���� �Է��ϼ���");
		 while((n=sc.nextInt())!=0) {
			 System.out.println("���۰��� �Է��ϼ���");
			 int i = sc.nextInt();
			 System.out.println("���ᰪ�� �Է��ϼ���");
			 int j = sc.nextInt();
			 System.out.println("����Ƚ���� Ȯ���� ���� �Է��ϼ���");
			 int k = sc.nextInt();
			 
			 System.out.println(solution(i, j, k));
		 }
		 sc.close();
	}
}
