package com.easyspub.datastructure_04_stackqueue;

import java.util.Arrays;

public class IntStack {

	private int[] stk;		// 배열선언
	private int capacity;	// 배열크기
	private int ptr;		// 현재위치
	
	public class EmptyIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// serialize : 디스크에 기록, 직렬화 <-> deserialize
		// 만들어진 클래스의 버전관리 - 불필요시 어노테이션 처리해도 됨
		// 클래스에 있는 값들을 디스크에 기록 > 필드가 변경되면 버전 변경

		public EmptyIntStackException() {
		}
		
		public void print() {
			System.out.println("스택이 비어있습니다.");			
		}
	}
	
	@SuppressWarnings("serial")
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException () {	
		}
		
		public void print() {
			System.out.println("스택이 가득차있습니다.");			
		}
	}
	
	public IntStack() {
		
	}
	
	// 생성자 : 값 초기화, 배열 크기를 매개변수로 설정
	public IntStack(int maxlen) {
		ptr = 0;
		// capacity로 입력값 가져오기
		capacity = maxlen;
		// 스택 배열 생성
		try {
		stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			// OutOfMemoryError : heap 영역 공간 부족으로 생기는 오류
			// 메모리를 초과하는 값을 주면 메모리 할당을 하지 않음
			capacity = 0;
		}
	}
	
	public int[] getStk() {
		return stk;
	}

	public void setStk(int[] stk) {
		this.stk = stk;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPtr() {
		return ptr;
	}

	public void setPtr(int ptr) {
		this.ptr = ptr;
	}

	@Override
	public String toString() {
		return "IntStack [stk=" + Arrays.toString(stk) + ", capacity=" + capacity + ", ptr=" + ptr + "]";
	}
	
	/* push
	 * - 배열요소로 x 넣어주기
	 * - 다음 push에서 ptr = ptr+1
	 * - push할 수 없는 경우? 배열이 full : ptr이 인덱스 값 초과 : ptr>=capacity
	 */
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	/* pop
	 * - 마지막 push된 값 가져오기
	 * - 다음 pop에서 ptr = ptr-1
	 * - pop할 수 없는 경우? push된 값이 없는 경우 : ptr=0 > empty 예외처리 
	 */
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	/* peek
	 * - 마지막 push된 값 가져오기
	 * - peek할 수 없는 경우? push된 값이 없는 경우 : ptr=0 > empty 예외처리 
	 */
	public int peek() throws EmptyIntStackException {
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	/* clear
	 * 배열요소를 결정하는 모든 동작이 ptr을 기준으로 적용되므로
	 * ptr=0이 되면 첫 인덱스부터 새롭게 push 가능
	 */
	public void clear() {
		ptr = 0;
	}
	
	/* indexOf : x를 찾아 인덱스(없으면 -1) 반환
	 * - stk[] 배열 돌면서 x 찾기
	 * - 일치하는 i 반환 없으면 -1 반환
	 */
	public int indexOf(int x) {
		for(int i = 0; i < stk.length; i++)
			if(stk[i] == x)
				return i;
		return -1;
	}
	
	// size : 스택에 쌓여있는 데이터 갯수
	public int size() {
		return ptr;
	}
	
	// isEmpty : 스택 비어있는지 판단
	public boolean isEmpty() {
		// boolean 초기값 : true
		return ptr <= 0;
	}
	
	// isFull : 스택 가득차있는지 판단
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	/* dump : 스택 안의 무든 데이터를 바닥->꼭대기 순서로 출력
	 * - for문으로 값 가져오기
	 * - dump 할 수 없는 경우? 스택이 비어있음 : ptr<=0 : empty 예외처리
	 */
	public void dump() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		// stk를 다 돌면 ptr과 관계없이 전체를 출력하기 때문에 안됨
		// 확장 for문이 아닌 일반 for문 사용 필요
		for(int i=0; i<ptr; i++) {
			System.out.print(" " + stk[i]);
		}
	}
	
}

