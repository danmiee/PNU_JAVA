// p.145 배열로 큐 만들기
/*
 * 1. 인큐 : rear 값 넣기
 * 2. 디큐 : front 값 빼기
 * 3. 모든 요소를 앞쪽으로 한 칸씩 옮기기
 */
package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntQueue {

	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;

	public IntQueue() {

	}

	public IntQueue(int maxlen) {
		capacity = maxlen;
		num = front = rear = 0;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public int[] getQue() {
		return que;
	}

	public void setQue(int[] que) {
		this.que = que;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "IntQueue [que=" + Arrays.toString(que) + ", capacity=" + capacity + ", num=" + num + ", front=" + front
				+ ", rear=" + rear + ", x=" + x + "]";
	}

	@SuppressWarnings("serial")
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}

		public void print() {
			System.out.println("큐가 비어있습니다.");
		}
	}

	@SuppressWarnings("serial")
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}

		public void print() {
			System.out.println("큐가 가득차있습니다.");
		}
	}

	int x;

	/* enque : rear에 값 넣기
	 * enque 불가상황?
	 * 		full : num >= capacity : overflow
	 * 링버퍼
	 * 		rear == capacity : rear = 0으로 돌아가기 
	 */
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException();
		// rear에 값 넣어주기
		// rear값 +1 : 이후 enque 위치설정
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}

	/* deque
	 * front 값 출력하고 삭제하기
	 * deque 불가상황?
	 * 		num <= 0 : empty
	 * 링버퍼
	 * 		front == capacity : front = 0으로 돌아가기
	 */
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	/*
	 * peek
	 * front 값 출력하기
	 * peek 불가상황?
	 * 		num <= 0 : empty
	 */
	public int peek() {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// clear
	public void clear() {
		num = front = rear = 0;
	}

	// indexOf : 큐(front~rear)에서 x를 검색하여 인덱스(찾지못하면 -1) 반환
	public int indexOf(int x) {
		int idx = 0;
		for (int i = 0; i < num; i++)
			idx = (i+front) % capacity;
			if (que[idx] == x)
				return idx;
		return -1;
	}

	/*
	 * size : 큐에 쌓여있는 데이터 갯수 num 출력
	 */
	public int size() {
		return num;
	}

	// isEmpty
	public boolean isEmpty() {
		return num <= 0;
	}

	// isFull
	public boolean isFull() {
		return num >= capacity;
	}

	/* dump : 큐 안의 모든 데이터 front>rear 순서로 출력
	 * dump 불가상황? empty : num <= 0
	 */
	public void dump() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		for (int i = 0; i < num; i++) {
			int idx = (i+front) % capacity;
			System.out.print(" " + que[idx]);
		}
	}
}
