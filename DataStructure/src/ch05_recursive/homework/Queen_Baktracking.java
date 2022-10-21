//package ch05_recursive.homework;
//
//public class Queen_Baktracking {
//	public static void SolveQueen(int[][] d) {
//		int count = 0;
//		int ix = 0, iy = 0;
//		Queen_Stack st = new Queen_Stack(10);
//		Point p = new Point(ix, iy);
//		d[ix][iy] = 1;
//		st.push(p);
//
//		while (count < 8) {
//			// p = st.pop();
//			// int cx = p.getX(); int cy = p.getY();
//			// count--;
////			while (cx < d.length)
////			{
////				while (cy < d[0].length) {
//////					if (checkRow(d, cx) && checkCol(d, cy) && checkDiagSW(d, cx,cy) && checkDiagSE(d, cx,cy)) {
//////						Point px = new Point(cx,cy);
//////						st.push(px); count++;
//////						break;
//////					}
////					cy++;
////				}
////				cx++;
////				System.out.println("cx = "+ cx);
////				count++;
////			}
//			// System.out.println("cx = "+cx + "cy = "+cy);
//			count++;
//
//		}
//	}
//
//	public static boolean checkRow(int[][] d, int cx) {
//		return true;
//	}
//
//	public static boolean checkCol(int[][] d, int cy) {
//		return true;
//	}
//
//	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
//		return true;
//	}
//
//	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
//		return true;
//	}
//
//	public static void main(String[] args) {
//		int row = 8, col = 8;
//		int[][] data = new int[8][8];
//		for (int i = 0; i < data.length; i++)
//			for (int j = 0; j < data[0].length; j++)
//				data[i][j] = 0;
//
//		SolveQueen(data);
//
//		for (int i = 0; i < data.length; i++) {
//			for (int j = 0; j < data[0].length; j++) {
//				System.out.print(" " + data[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}
//
////* 문제 해결형 자바 코딩 실습이 필요
////- main()의 작성 방법 훈련 - 
////main() {
////	int [][]data;
////	배열 초기화
////	SolveQueen(data);
////	배열열 출력: 8개의 queen 배치(여러가지 해를 구해 보여주기)
////}
////- 함수 호출로 구현 훈련
////  void SolveQueen(int [][]d) {
////     //코딩 완성하기 
////  }
////=> 8  Queen 문제 풀기: 스택 사용하여 backtracking 코딩 실습
////  -> 2차원 배열에 0으로 초기화, Queen을 배치하면 1로 설정, 8 X 8 배열에 8개 퀸이 가로 세로 대각선에 충돌이 없으면 성공
////
////  -> stack에 Point 객체를 생성하여 push, pop::(x, y, move) => move는 다음 이동 가능 candidate의 column임
////      class MyStack {
////	int top;
////	Point [] data
////	void Push(Point p);
////	Point Pop();
////       }
////       void NextMove(int[] move, int row); // current row에 대한 다음 배치 가능한 모든 column을 조사하고 move[]에 1로 설정
////       boolean CheckMove(int currentRow, int row, int col) //currentRow에 대하여 queen을 (x,y)에 배치 가능하면 true
////
////      => backtracking을 stack을 이용하여 push/pop으로 해결하는 것을 보이는 것임
////
////  -> 가로, 세로, 대각선에 대한 충돌 체크 함수 코딩
////   boolean CheckMove(x,y) {
////	checkRow(x);
////	checkCol(y);
////	checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
////	checkDiagSE(x,y); //x++, y++ or x--, y--
////   }
