/* 문제 해결형 자바 코딩 실습이 필요
	- 함수 호출로 구현 훈련
	  void SolveQueen(int [][]d) {
	     //코딩 완성하기 
	  }
	=> 8  Queen 문제 풀기: 스택 사용하여 backtracking 코딩 실습
	  -> 2차원 배열에 0으로 초기화, Queen을 배치하면 1로 설정, 8 X 8 배열에 8개 퀸이 가로 세로 대각선에 충돌이 없으면 성공
	
	  -> stack에 Point 객체를 생성하여 push, pop::(x, y, move) => move는 다음 이동 가능 candidate의 column임
	      class MyStack {
		int top;
		Point [] data
		void Push(Point p);
		Point Pop();
	       }
	       void NextMove(int[] move, int row); // current row에 대한 다음 배치 가능한 모든 column을 조사하고 move[]에 1로 설정
	       boolean CheckMove(int currentRow, int row, int col) //currentRow에 대하여 queen을 (x,y)에 배치 가능하면 true
//	      => backtracking을 stack을 이용하여 push/pop으로 해결하는 것을 보이는 것임
	
 */
package ch04_stack_queue.Queen;

import ch04_stack_queue.Queen.Stack2.EmptyIntStackException;

public class Backtracking {

	public static void SolveQueen(int[][] d) {

		// 필드 선언 및 초기화
		int count = 0; // 확인할 행 인덱스
		int ix = 0, iy = 0; // 배열요소 초기화
		Stack2 st = new Stack2(10); // 왜 10칸????
		Point p = new Point(ix, iy); // 좌표형식

		// 0행 0열에 체크
		d[ix][iy] = 1;

		// 스택에 좌표 기록
		try {
			st.push(p);
		} catch (EmptyIntStackException e) {

		}
		count++;

		// 8행 동안 반복
		while (count < 8) {
			int cx = p.getX(); // 체크할 좌표 x값
			int cy = p.getY(); // 체크할 좌표 y값
			Point px = new Point(cx, cy); // 체크할 좌표값

			int inum = st.size(); // 스택에 기존 기록된 좌표 개수

			while (cx < d.length) {
				while (cy < d[0].length) {
					if (checkRow(d, cx) && checkCol(d, cy) && checkDiagSW(d, cx, cy) && checkDiagSE(d, cx, cy)) {
						d[cx][cy] = 1;
						try {
							st.push(px);
						} catch (EmptyIntStackException e) {

						}
						break;
					}
					cy++;
				}
				if (st.size() == inum) {
					try {
						st.pop();
					} catch (EmptyIntStackException e) {

					}
					iy++;
					break;
				}
				cx++;
				count++;
			}
		}
	}

//	  -> 가로, 세로, 대각선에 대한 충돌 체크 함수 코딩
//	   boolean CheckMove(x,y) {
	static int ix, iy, cx, cy;
	static Point p = new Point(ix, iy);
	static Point cp = new Point(cx, cy);

//		checkRow(x);
	// d와 같은 열 아니면 true
	public static boolean checkRow(int[][] d, int cx) {
		while (ix < 8) {
			if (iy < 8)
				if (d[ix][iy] == 1)
					if (ix == cx)
						return false;
			iy++;
			ix++;
		}
		return true;
	}

//		checkCol(y);
	// d와 같은 행 아니면 true
	public static boolean checkCol(int[][] d, int cy) {
		while (ix < 8) {
			if (iy < 8)
				if (d[ix][iy] == 1)
					if (iy == cy)
						return false;
			iy++;
			ix++;
		}
		return true;
	}

//		checkDiagSE(x,y); //x++, y++ or x--, y--
	// d와 대각선(남서)방향 라인 아니면 true
	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);
		while (true) {
			// x++ y++
			while (ix > 0) {
				if (iy > 0) {
					ix++;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x-- y--
			while (ix < 8) {
				if (iy < 8) {
					ix--;
					iy--;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			return true;
		}
	}

//		checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
	// d와 대각선(남동)방향 라인 아니면 true
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		int ix, iy;
		ix = iy = 0;
		Point p = new Point(ix, iy);
		Point cp = new Point(cx, cy);
		while (true) {
			// x-- y++
			while (ix > 0) {
				if (iy < 8) {
					ix--;
					iy++;
					if (d[ix][iy] == 1) {
						if (p == cp)
							return false;
						continue;
					}
				}
			}
			// x++ y--
			while (ix < 8) {
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
			return true;
		}
	}

//	- main()의 작성 방법 훈련 - 
	public static void main(String[] args) {
		int row = 8, col = 8;
//		int [][]data;
//		배열 초기화
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

//		SolveQueen(data);
//		배열열 출력: 8개의 queen 배치(여러가지 해를 구해 보여주기)
		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
