package ch06_sorting.date221109;

import java.util.Scanner;

class Element {
	private int key;

	public Element() {

	}

	public Element(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "" + key + "";
	}
}

interface MaxPQ {
	public void Insert(Element x);

	public Element DeleteMax();
}

class MaxHeap implements MaxPQ {
	private Element[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap

	public MaxHeap(int sz) {
		MaxSize = sz;
		n = 0;
		heap = new Element[MaxSize + 1]; // Don't want to use heap[0]
	}

	public int size() {
		return n;
	}
	
	public void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	public void HeapFull() {
		System.out.print("Heap Full");
	}

	@Override
	public void Insert(Element x) {
		if (n == MaxSize) {
			HeapFull();
			return;
		}
		// 힙 크기 증가
		n++;
		// 정렬
		for (int i = n; i >= 1; i /= 2) {
			// x를 리프에 넣어주기
			heap[i] = x;
			// 루트까지 돌고 반복문 중단
			if (i == 1)
				break; // at root
			// x의 키값이 부모의 키값보다 작으면 반복문 중단
			else if (x.getKey() < heap[i / 2].getKey())
				break;
			// 반복문 중단되지 않았으면 자리 바꾸기
			// move from parent to i
			heap[i] = heap[i / 2];
			heap[i / 2] = x;
		}
	}

	@Override
	public Element DeleteMax() {

		int i, j;
		Element temp = heap[1];

		if (n == 0) {
			HeapEmpty();
			return null;
		}

		// 값이 1개이면 해당값 리턴하고 포인터 -
		if (n == 1) {
			n--;
			return temp;
		}

		// 아직 리턴 안됐으면 리턴할 k 고정
		Element k = heap[n];
		n--;

		// 정렬하기(i:부모인덱스, j:자식인덱스)
		for (i = 1, j = 2; j <= n; j *= 2) {
			// 자식인덱스가 힙의 크기보다 작을 때 더 큰 자식의 인덱스 선택
			// j points to the larger child
			if (j < n && heap[j].getKey() < heap[j + 1].getKey())
				j++;
			// 부모가 자식보다 크거나 같으면 패스
			if (heap[i].getKey() >= heap[j].getKey())
				continue;
			// 패스되지 않았으면 자리바꾸기
			temp = heap[j];
			heap[j] = heap[i];
			heap[i] = temp;
		}
		return k;
	}

	public void display() {
		System.out.printf("MaxHeap::\n(i, heap[i].getKey()):\n");
		for (int i = 1; i <= n; i++)
			System.out.println("(" + i + ", " + heap[i].getKey() + ") ");
	}
}

public class HeapSort {
	// simple queue에 대한 성능 비교 실험, 난수를 사용하여 시간 측정
	// MinPQ를 구현

	static int HeapSize = 1000;

	enum Boolean {
		FALSE, TRUE
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select = 0;
		int size = 0;
		MaxHeap heap = new MaxHeap(20);
		Element deletedEle = null;

		do {
			System.out.println("Max Tree. Select: (1) insert, (2) display, (3) delete, (5) exit");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("input value: ");
				int ipv = sc.nextInt();
				Element data = new Element(ipv);
				heap.Insert(data);
				break;
			case 2:
				heap.display();
				break;
			case 3:
				deletedEle = heap.DeleteMax();
				size = heap.size();
				if (deletedEle != null)
					System.out.println("deleted element: " + deletedEle);
				System.out.println("current max heap: " + size);
				break;
			case 5:
				break;
			}
		} while (select < 5);
		sc.close();
	}
}
