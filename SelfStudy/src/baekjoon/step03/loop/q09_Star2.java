package baekjoon.step03.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q09_Star2 {

	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String s = "";
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				bw.write(" ");
			}
			s=s+"*";
			bw.write(s+"\n");
		}
		bw.close();
	}

}
