package ch05_recursive.homework;

class Point {
	private int ix;
	private int iy;

	public Point() {
		
	}
	
	public Point(int x, int y) {
		ix = x;
		iy = y;
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}
	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}
}

public class Queen_Stack {
	private Point[] stk;	// 스택용 배열
	private int capacity;	// 스택의 크기
	private int top;		// 스택 포인터

	// --- 실행시 예외 : 스택이 비어있음 ---//
	@SuppressWarnings("serial")
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외 : 스택이 가득 참 ---//
	@SuppressWarnings("serial")
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
		
		public void print() {
			System.out.println("스택이 가득차있습니다.");
		}
	}

	// --- 생성자(constructor) ---//
	public Queen_Stack(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			stk = new Point[capacity];	// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	// 생성할 수 없음
			capacity = 0;
		}
	}

	// --- 스택에 p(x,y)를 푸시 ---//
	public Point push(Point p) throws OverflowIntStackException {
		if (top >= capacity) // 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[top++] = p;
	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Point pop() throws EmptyIntStackException {
		if (top <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[--top];
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Point peek() throws EmptyIntStackException {
		if (top <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[top - 1];
	}

	// --- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(벌견하지 못하면 –1)를 반환 ---//
	public int indexOf(Point x) {
		for (int i = top - 1; i >= 0; i--) // 정상 쪽에서 선형검색
			if (stk[i].equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (top <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}	
}
