package ch04_stack_queue.date221024;

import java.util.Arrays;

import ch04_stack_queue.date221019.Stack;

public class MazingProblemCPP {
	class Items {
		int x, y, dir;
		
		public Items() {
			
		}
		
		public String toString() {
			return x + "," + y + "," + dir;
		}
	}
	
	class Offsets {
		int a, b;
		// c++에서는 enum이 연산가능하나 자바는 연산불가 > 사용안함, 숫자로 대체
		//enum directions { N, NE, E, SE, S, SW, W, NW };
		// N=0, NE=1, E=2, SE=3, S=4, SW=5, W=6, NW=7
		public Offsets() {
			
		}
		
		public Offsets(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	static Offsets[] moves = new Offsets[8];
	//offsets moves[8];
	static int[][] maze = new int[100][100];
	static int[][] mark = new int[100][100];

	public void path(maze, mark, int m, int p) {
	//Output a path (if any) in the maze; rows is m, cols is p;
		//start at (1,1)
		mark[1][1] = 1;
//		Stack<items> stack(m * p);
		Stack <Items> stack = new Stack<>();
		Items temp = null;
		temp.x = 1; temp.y = 1; temp.dir = 2;
		stack.push(temp);

		while (!stack.isEmpty()) // stack not empty
		{
			temp = stack.pop(); // unstack
			int i = temp.x; int j = temp.y; int d = temp.dir;
			while (d < 8) // moves forward
			{
				System.out.println(i+ " " + j + " " + d);
				//outFile << i << " " << j << " " << d << endl;
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				if ((g == m) && (h == p)) { // reached exit
											// output path
					System.out.println(stack);
					System.out.println("the term near the exit: " + i + " " + j);
					System.out.println("exit: " + m + " " + p);
					return;
				}
				if ((maze[g][h]==0) && (mark[g][h]==0)) { // new position
					mark[g][h] = 1;
//					//push the old temp to the stack, but the direction changes.
//					//Because the neighbor in the direction of d has been checked.
					temp.x = i;  temp.y = j; temp.dir = d + 1;
					stack.push(temp); // stack it
					i = g; j = h; d = 0; // moves to (g,h)
				}
				else d++; // try next direction
			}
		}
		System.out.println("no path in maze");
	}
	//maze[][], mark[][]를 class의 private data member로 선언
	//main()에서는 class의 public function의 호출로 미로 찾기

	public static void main(String[] args) {
		
			int input[][] = { // 12 x 15
					{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
					{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
					{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, 
					};
			
			for (int ia = 0; ia < 8; ia++) {
			moves[ia] = new Offsets(0, 0);
			moves[0].a = -1;
			moves[0].b = 0;
			moves[1].a = -1;
			moves[1].b = 1;
			moves[2].a = 0;
			moves[2].b = 1;
			moves[3].a = 1;
			moves[3].b = 1;
			moves[4].a = 1;
			moves[4].b = 0;
			moves[5].a = 1;
			moves[5].b = -1;
			moves[6].a = 0;
			moves[6].b = -1;
			moves[7].a = -1;
			moves[7].b = -1;
			}
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 17; j++) {
					if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
						maze[i][j] = 1;
					else {
						maze[i][j] = input[i - 1][j - 1];
					}
					mark[i][j] = 0;

				}
			}
			
			System.out.println("maze[12,15]::");
			for (int i = 0; i <= 13; i++) {
				for (int j = 0; j <= 16; j++) {
					System.out.print(maze[i][j] + " ");

				}
				System.out.println();
			}
			System.out.println("mark::");
			for (int i = 0; i <= 13; i++) {
				for (int j = 0; j <= 16; j++) {
					System.out.print(mark[i][j] + " ");

				}
				System.out.println();
			}
			path(maze, mark, 12, 15);
			System.out.println("mark::");
			for (int i = 1; i <= 12; i++) {
				for (int j = 1; j <= 15; j++) {
					System.out.print(mark[i][j] + " ");

				}
				System.out.println();
			}

		}
	}
