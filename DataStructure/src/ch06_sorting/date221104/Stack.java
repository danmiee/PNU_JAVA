package ch06_sorting.date221104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point {
	private int ix;
	private int iy;

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

	@Override
	public String toString() {
		return "P(" + ix + ", " + iy + ")";
	}
}

public class Stack<T> {
// p. 133 �ڵ带 General�� Ȱ���Ͽ� ����Ʈ�� ��ġ��

	/*
	 * ���׸�Ŭ������ ��� �Ұ� // ���� ����ó�� public class EmptyStakException extends Exception {
	 * private static final long serialVersionUID = 1L; public void
	 * EmptyStackException() { super(); } } // Ǯ���� ����ó�� public class
	 * OverflowStackException extends RuntimeException { public
	 * OverflowStackException() { } }
	 */

	// private T data[];
	private List<T> data;
	private int capacity;
	private int top;

	// ������(constructor)
	public Stack() {
		top = 0;
		capacity = 0;
		data = new ArrayList<>(Collections.emptyList());
	}
	
	@Override
	public String toString() {
		return "Stack [data=" + data + ", capacity=" + capacity + ", top=" + top + "]";
	}

	public Stack(int maxlen) {
		top = 0;
		capacity = maxlen;
		data = new ArrayList<>(Collections.emptyList());
	}

	// ���ÿ� x�� push
	public void push(T x) {
		if (top < capacity) {
			++top;
			// list ������ Ȯ��
			data.add(x);
			// list ���ҷ� x�� �־��ֱ�
		}
	}

	/*
	 * UnsupportedOperationException �Ϲ������� List ���� new�� �ʱ�ȭ���� �ʴ� ���¿��� Arrays�� �����Ͽ���
	 * �� �ַ� �߻�
	 */
	// ���ÿ��� �����͸� pop(���� �ִ� �����͸� ����)
	public T pop() {
		// pop�ϴ� ���� ������ֱ� ���� return ���
		T temp = null;
		if (top != 0) {
			temp = data.get(top - 1);
			data.remove(--top);
		}
		return temp;
	}

	// ���ÿ��� �����͸� peek(���� �ִ� �����͸� �鿩�ٺ�)
	public T peek() {
		return data.get(top - 1);
		// top�� list.size�� ���� > index = top-1
		// peek�ϴ� ���� ������ֱ� ���� return ���
	}

	// ������ ���
	public void clear() {
		for(int i=0; i<data.size(); i++) {
			data.remove(i);
		}
		top = 0;
		/*
		 * ������ ��Ұ��� ���� �����͸� �������� ó���ǹǷ� ���� �����͸� 0���� �ָ� ��� ������
		 */
	}

	// ���ÿ��� x�� ã�� �ε���(������ -1) ��ȯ
	public int indexOf(T x) {
		for (int i = top - 1; i >= 0; i--) {
			if (data.get(i) == x)
				return i;
		}
		return -1;
	}

	// ������ ũ�� ��ȯ
	public int getCapacity() {
		return capacity;
	}

	// ���ÿ� �׿��ִ� ������ ���� ��ȯ
	public int size() {
		return top;
	}

	// ���� ����ִ��� Ȯ��
	public boolean isEmpty() {
		return top <= 0;
	}

	// ���� ����á���� Ȯ��
	public boolean isFull() {
		return top >= capacity;
	}

	// ���� ���� ��� �����͸� �ٴ� -> ���� ������ ǥ��
	public void dump() {
		if (top <= 0) {
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			for (int i = 0; i < top; i++) {
				System.out.print(data.get(i) + " ");
			}
			System.out.println();
		}

	}
}