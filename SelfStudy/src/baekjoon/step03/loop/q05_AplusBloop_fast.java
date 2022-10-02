package baekjoon.step03.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q05_AplusBloop_fast {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Scanner와 유사한 BufferedReader (import 필요)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// syso와 유사한 Bufferedwriter (import 필요)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		// BufferedReader 사용하는 readLine()
			/* readLine 주의사항
			 * 1. 리턴값 : String / 다른 타입 입력 필요시 형변환 필수
			 * 		- Integer.parseInt() : int형으로 형변환
			 * 2. 예외처리 필요(main클래스 옆에 throws IOException 기재 & import)
			 */
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
		
			// Read한 데이터는 Line단위로 나눠짐 > 공백단위 필요 시 별도 작업 필요
				/* 공백단위로 나누는 2가지 방법
				 * 1. StringTokenizer에 nextToken() 함수 사용
				 * 2. String.split()함수 활용하여 배열에 공백단위로 끊어서 데이터 넣고 사용
				 */
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
	}

}
