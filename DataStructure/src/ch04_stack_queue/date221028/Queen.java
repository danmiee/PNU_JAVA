package ch04_stack_queue.date221028;

import java.util.Arrays;

public class Queen {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {

		int count = 0, mode = 0;
		int ix = 0, iy = 0;

		Stack2 st = new Stack2(10);
		Point p = new Point(ix, iy);
		
		// 시작
		d[ix][iy] = 1; // p(0,0)에 체크
		count++; // 체크 개수
		st.push(p); // 체크좌표 기록

		// 모든 행 좌표에 체크할 때까지 반복
		while (count < d.length) {

			ix++; // 행변경
			int cx = 0;
			int cy = 0; // 0번째 열부터 시작

			// 새로 체크하는 좌표
			Point px = new Point(cx, cy);

			// 행 수만큼 반복
			while (cx < d.length) {

				// 열 수만큼 반복
				while (cy < d[0].length) {
					// 체크할 수 있으면 푸쉬, 좌표기록, 체크개수 추가, 반복문 나가기
					if (CheckMove(d,cx,cy)) {
						st.push(px);
						count++;
						break;
					}
				}
//				// 마지막 열이 아니면 다음 열로 이동
				if (NextMove(d, cx, cy)) {
					cy++;
					// 마지막 열이면 pop하고 체크 개수 감소
				} else {
					p = st.pop();
					count--;
				}
			}

		}
	}

	// 체크함수 구현하기
	public static boolean checkRow(int[][] d, int crow) {
		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for (int i = 0; i < d[0].length; i++) {
			if (d[i][ccol] == 1) {
				return true;
			}
		}
		return false;
	}

	// x++, y-- or x--, y++ where 0<= x,y <= 7
	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		if (cx != 0 && cy != d[0].length - 1) {
			while (cx == 0 || cy == 0) {
				cx++;
				cy--;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		if (cx != d.length - 1 && cy != 0) {
			while (cx == 0 || cy == d[0].length - 1) {
				cx--;
				cy++;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		return false;
	}

	// x++, y++ or x--, y--
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		if (cx != 0 && cy != 0) {
			while (cx == d.length - 1 || cy == d[0].length - 1) {
				cx++;
				cy++;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		if (cx != d.length - 1 && cy != d[0].length - 1) {
			while (cx == 0 || cy == 0) {
				cx--;
				cy--;
				if (d[cx][cy] == 1)
					return true;
			}
		}
		return false;
	}

	// (x,y)로 이동 가능한지를 check
	public static boolean CheckMove(int[][] d, int x, int y) {
		if (checkRow(d, x) || checkCol(d, y) || checkDiagSW(d, x, y) || checkDiagSE(d, x, y)) {
			return false;
		}
		return true;
	}

	// 다음 row로 이동여부 판단
	public static boolean NextMove(int[][] d, int row, int col) {
		// 마지막 열이 아니면 다음 열로 이동
		if (col == d[0].length-1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int row = 4, col = 4;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;
		System.out.println(Arrays.deepToString(data));
		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
