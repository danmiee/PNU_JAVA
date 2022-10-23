package ch04_stack_queue.Queen;

public class Check {

	static int max = 4;

//	checkRow(x);
	// d와 같은 열 아니면 true
	public static boolean row(int[][] d, int cx) {
		for (int ix = 0; ix < d.length; ix++) {
			for (int iy = 0; iy < d[0].length; iy++) {
				if (d[ix][iy] == 1) {
					if (ix == cx)
						return false;
				}
			}
		}
		return true;
	}

//	checkCol(y);
	// d와 같은 행 아니면 true
	public static boolean col(int[][] d, int cy) {
		for (int ix = 0; ix < d.length; ix++) {
			for (int iy = 0; iy < d[0].length; iy++) {
				if (d[ix][iy] == 1)
					if (iy == cy)
						return false;
			}
		}
		return true;
	}

//	checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
	// d와 대각선(남서)방향 라인 아니면 true
	public static boolean diagSW(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);

		while (true) {
			// x++ y--
			while (ix < max) {
				if (iy > 0) {
					ix++;
					iy--;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x-- y++
			while (ix > 0) {
				if (iy < max) {
					ix--;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			break;
		}
		return true;
	}

//	checkDiagSE(x,y); //x++, y++ or x--, y--
	// d와 대각선(남동)방향 라인 아니면 true
	public static boolean diagSE(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);

		while (true) {
			// x-- y--
			while (ix > 0) {
				if (iy > 0) {
					ix--;
					iy--;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x++ y++
			while (ix < max) {
				if (iy < max) {
					ix++;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			break;
		}
		return true;
	}

}
