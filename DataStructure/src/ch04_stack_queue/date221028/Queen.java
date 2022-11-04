package ch04_stack_queue.date221028;

public class Queen {
	@SuppressWarnings("unused")
	public static void SolveQueen(int[][] d) {

		int count = 0, mode = 0;
		int ix = 0, iy = 0;

		Stack st = new Stack(10);
		Point p = new Point(ix, iy);

		// 시작
		d[ix][iy] = 1; // p(0,0)에 체크
		count++; // 체크 개수
		st.push(p); // 체크좌표 기록

		int cx = 0;
		cx++; // 행변경

		// 행 수만큼 반복
		while (cx < d.length) {
			// 0번째 열부터 시작
			int cy = 0;
			// 열 수만큼 반복
			while (cy < d[0].length) {

				// 체크할 수 있으면 푸쉬, 좌표기록, 체크개수 추가, 반복문 나가기
				if (CheckMove(d, cx, cy)) {
					// 새로 체크하는 좌표
					// push와 같은 위치에서 선언해야 정상반영
					Point px = new Point(cx, cy);
					st.push(px);
					d[cx][cy] = 1;
					count++;
					cx++;
					break;
					// 체크 안했고 마지막열 아니면 cy++
				} else if (NextMove(d, cx, cy)) {
					cy++;
					// 마지막 열이면 pop하고 체크 개수 감소
				} else {
					while (true) {
						p = st.pop();
						count--;
						cx = p.getX();
						cy = p.getY();
						d[cx][cy] = 0;
						if (cy != d[0].length - 1) {
							cy++;
							break;
						}
					}
				}
			}
		}
	}

	// 체크함수 구현하기
	public static boolean checkRow(int[][] d, int x, int y) {
		for (int i = 0; i < y; i++)
			if (d[x][i] == 1)
				return true;
		return false;
	}

	public static boolean checkCol(int[][] d, int x, int y) {
		for (int i = 0; i < x; i++)
			if (d[i][y] == 1)
				return true;
		return false;
	}

	// x++, y-- or x--, y++ where 0<= x,y <= 7
	public static boolean checkDiagSW(int[][] d, int x, int y) {
		while (x < d.length - 1 && y > 0) {
			x++;
			y--;
			if (d[x][y] == 1)
				return true;
		}
		while (x > 0 && y < d[0].length - 1) {
			x--;
			y++;
			if (d[x][y] == 1)
				return true;
		}
		return false;
	}

	// x++, y++ or x--, y--
	public static boolean checkDiagSE(int[][] d, int x, int y) {
		while (x < d.length - 1 && y < d[0].length - 1) {
			x++;
			y++;
			if (d[x][y] == 1)
				return true;
		}
		while (x > 0 && y > 0) {
			x--;
			y--;
			if (d[x][y] == 1)
				return true;
		}
		return false;
	}

	// (x,y)로 이동 가능한지를 check
	public static boolean CheckMove(int[][] d, int x, int y) {
		if (checkRow(d, x, y) || checkCol(d, x, y) || checkDiagSW(d, x, y) || checkDiagSE(d, x, y)) {
			return false;
		}
		return true;
	}

	// 다음 row로 이동여부 판단
	public static boolean NextMove(int[][] d, int row, int col) {
		// 마지막 열이 아니면 다음 열로 이동
		if (col != d[0].length - 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[row][col];
		
		System.out.println("[초기상태]");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				data[i][j] = 0;
				System.out.print(" " + data[i][j]);
			}
		System.out.println();
		}

		SolveQueen(data);

		System.out.println("[SolveQueen 결과]");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
