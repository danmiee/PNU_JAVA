package ch04_stack_queue.date221104;

public class Queen_BuiltInMethod {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack st = new Stack(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1; // 퀸 배치
		count++; // 퀸 배치한 point 수
		st.push(p);

		// count가 8이 될때까지 반복
		while (count < 8) {
			ix++; // 행변경
			int cy = 0; // 행변경 후 항상 0번째 열부터 체크 필요

			// 행 반복하며 퀸 배치가능여부 판단
			while (ix < d.length) {
				cy = NextMove(d, ix, cy); // 배치가능: 열 인덱스, 배치불가: d[0].length 반환
				// 퀸 배치가능한 동안 반복?
				while (cy < d[0].length) { // else문의 cy++ 때문에 필요
					Point px = new Point(ix, cy);
					st.push(px);
					count++;
					d[ix][cy] = 1;
					break;
				}
				if (cy != d[0].length) {
					break;
				} else {
					p = st.pop();
					ix = p.getX();
					cy = p.getY();
					count--;
					d[ix][cy] = 0;
					cy++;
				}
			}
		}
	}

	public static boolean checkRow(int[][] d, int cx, int cy) {
		for (int i = 0; i < cy; i++)
			if (d[cx][i] == 1)
				return false;
		return true;
	}

	public static boolean checkCol(int[][] d, int cx, int cy) {
		for (int i = 0; i < cx; i++) {
			if (d[i][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int x = cx, y = cy;
		while (x < d.length - 1 && y > 0) {
			x++;
			y--;
			if (d[x][y] == 1)
				return false;
		}
		x = cx;
		y = cy;
		while (x > 0 && y < d[0].length - 1) {
			x--;
			y++;
			if (d[x][y] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		int x = cx, y = cy;
		while (x < d.length - 1 && y < d[0].length - 1) {
			x++;
			y++;
			if (d[x][y] == 1)
				return false;
		}
		x = cx;
		y = cy;
		while (x > 0 && y > 0) {
			x--;
			y--;
			if (d[x][y] == 1)
				return false;
		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if (checkRow(d, x, y) && checkCol(d, x, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y)) {
			return true;
		}
		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
		int nextCol = col; // 다음 col로 넘어가기 위한 선언
		while (nextCol < d[0].length) // 인덱스 수만큼 반복
			if (CheckMove(d, row, nextCol)) // 현재 셀 체크가능여부 판단
				return nextCol; // 체크할 수 있으면 col 반환
			else
				nextCol++;
		return d[0].length; // 체크할 수 있는 셀 없으면 -1 반환
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
