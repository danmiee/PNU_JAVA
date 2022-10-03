package baekjoon.step04.Array_1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q01_MinMax_brbw_error {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int N [] = new int [n];
		
		for(int i=1; i<=n; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = N[0];
		int max = N[0];

		for (int i = 0; i < n; i++) {
			if (min >= N[i]) {
				min = N[i];
			}
			if (max <= N[i]) {
				max = N[i];
			}
		}
		bw.write(min + " " + max);
		bw.close();
	}
	
}
