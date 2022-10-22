// p.145 배열로 큐 만들기
/*
 * 1. 인큐 : rear 값 넣기
 * 2. 디큐 : front 값 빼기
 * 3. 모든 요소를 앞쪽으로 한 칸씩 옮기기
 */
package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntArrayQueue {

	private int[] que;
	private int capacity;
	private int num;

	public IntArrayQueue() {

	}

	public IntArrayQueue(int maxlen) {
		capacity = maxlen;
		num = 0;
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

	@Override
	public String toString() {
		return "IntArrayQueue [que=" + Arrays.toString(que) + ", capacity=" + capacity + ", num=" + num + "]";
	}

	@SuppressWarnings("serial")
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() {
		}

		public void print() {
			System.out.println("큐가 비어있습니다.");
		}
	}

	@SuppressWarnings("serial")
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() {
		}

		public void print() {
			System.out.println("큐가 가득차있습니다.");
		}
	}

	int x;

	/*
	 * enque
	 * enque 불가상황? full : num >= capacity : overflow
	 */
	public int enque(int x) throws OverflowIntArrayQueueException {
		if (num >= capacity)
			throw new OverflowIntArrayQueueException();
		// num(데이터 개수) = index
		// num = num+1 : 이후 enque 위치설정
		que[num++] = x;
		return x;
	}

	/*
	 * deque
	 * 값 빼기
	 * 모든 요소 한칸씩 앞으로 당겨오기
	 * deque 불가상황? num <= 0 : empty
	 */
	public int deque() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		x = que[0];
		for (int i = 0; i < num; i++) {
			if(i+1 >= num)
				break;
			que[i] = que[i + 1];
		}
		num--;
		return x;
	}

	/*
	 * peek : 마지막에 넣은 데이터 값 확인하기
	 * peek 불가상황? num <= 0 : empty
	 */
	public int peek() {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		return que[num - 1];
	}

	// clear
	public void clear() {
		num = 0;
	}

	// indexOf : 큐에서 x를 검색하여 인덱스(찾지못하면 -1) 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i] == x)
				return i;
		return -1;
	}

	// size : 큐에 쌓여있는 데이터 갯수 num 출력
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

	/* dump
	 * 큐 안의 모든 데이터 출력
	 * dump 불가상황? num <= 0 : empty
	 */
	public void dump() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		for (int i = 0; i < num; i++) {
			System.out.print(" " + que[i]);
		}
	}
}
