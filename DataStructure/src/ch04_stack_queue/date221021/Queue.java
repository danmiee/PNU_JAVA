package ch04_stack_queue.date221021;

import java.util.ArrayList;
import java.util.List;

public class Queue {

//	private int[] que; 			// 큐용 배열
	private List<Integer> que; // 큐용 리스트
	private int capacity; // 큐의 크기
//	private int front; // 맨 처음 요소 커서
//	private int rear; // 맨 끝 요소 커서
	private int num; // 현재 데이터 개수

	// --- 실행시 예외(사용자정의): 큐가 비어있음 ---//
	@SuppressWarnings("serial")
	public class EmptyQueueException extends RuntimeException {
		// 생성자
		public EmptyQueueException() {
		}

		public void print() {
			System.out.println("큐가 비어 있습니다.");
		}
	}

	// --- 실행시 예외(사용자정의): 큐가 가득 찼음 ---//
	@SuppressWarnings("serial")
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
		}

		public void print() {
			System.out.println("큐가 가득 찼습니다.");
		}
	}

	// --- 생성자(constructor) ---//
	public Queue(int maxlen) {
		num = 0;
		capacity = maxlen;
		try {
			// 큐 본체용 배열을 생성(capacity = maxlen)
			// que = new int[capacity];
			// 빈 리스트 생성
			que = new ArrayList<>(capacity);
		} catch (OutOfMemoryError e) { 			// 생성할 수 없음
			capacity = 0;
		}
	}

	// --- 큐에 데이터를 인큐 ---//
	public int enque(int x) throws OverflowQueueException {
		if (num >= capacity)
			throw new OverflowQueueException(); // 큐가 가득 찼음
		que.add(x);
		num++;
		return x;
	}

	// --- 큐에서 데이터를 디큐 ---//
	public int deque() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException(); // 큐가 비어있음
		int x = que.get(0);
		que.remove(0);
		num--;
		return x;

	}

	// --- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public int peek() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException(); // 큐가 비어있음
		return que.get(0);
	}

	// --- 큐를 비움 ---//
	public void clear() {
		que.removeAll(que);
		num = 0;
	}

	// --- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que.get(i) == x)
				return i;
		}
		return -1; // 검색 실패
	}

	// --- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
		return num;
	}

	// --- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	// --- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return num >= capacity;
	}

	// --- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for (int i = 0; i < num; i++)
			System.out.print(que.get(i));
			System.out.println();
		}
	}
}
