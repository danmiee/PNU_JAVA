package ch06_sorting.date221109;

import java.util.Scanner;

class Element {
	public int key;
	public Element() {
		
	}
	public Element(int key) {
		this.key = key;
	}
}

interface MaxPQ {
	public void Insert(final Element x);
	public Element DeleteMax(Element x);
}

class MaxHeap implements MaxPQ {
	private Element[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap
	
	public MaxHeap() {
	}
	
	public MaxHeap(int sz) {
		sz = MaxSize;
		heap = new Element[MaxSize + 1]; // Don't want to use heap[0]
	}
	
	public void HeapEmpty() {
		System.out.println("Heap Empty");
	}
	
	public void HeapFull() {
		System.out.print("Heap Full");
	}
	
	@Override
	public void Insert(final Element x) {
		int i;
		if (n == MaxSize) {
			HeapFull();
			return;
		}
		n++;
		for (i = n; i > 0;) {
			if (i == 1)
				break; // at root
			if (x.key <= heap[i / 2].key)
				break;
			// move from parent to i
			heap[i] = heap[i / 2];
			i /= 2;
		}
		heap[i] = x;
	}
	
	@Override
	public Element DeleteMax(Element x) {
		int i, j;
		if (n == 0) {
			HeapEmpty();
			return null;
		}
		x = heap[1];
		Element k = heap[n];
		n--;
		
		for (i = 1, j = 2; j <= n;) {
			if (j < n)
				if (heap[j].key < heap[j + 1].key)
					j++;
			// j points to the larger child
			if (k.key >= heap[j].key)
				break;
			heap[i] = heap[j];
			i = j;
			j *= 2;
		}
		heap[i] = k;
		return x;
	}
	
	public void display() {
		int i;
		System.out.println("MaxHeap:: (i, heap[i].key): ");
		for (i = 1; i <= n; i++)
			System.out.println("(" + i + ", " + heap[i].key + ") ");
	}
}

public class HeapSort {
	// simple queue에 대한 성능 비교 실험, 난수를 사용하여 시간 측정
	// MinPQ를 구현

	final static int HeapSize = 1000;

	enum Boolean {
		FALSE, TRUE
	};


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		Element data = null;
		
		MaxHeap heap = new MaxHeap(20);
		Element ele = null;
		
		Element deletedEle = null;

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 delete, >=5 exit");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("input value: ");
				heap.Insert(data);
				heap.display();
				break;
			case 2:
				heap.display();
				break;
			case 3:
				deletedEle = heap.DeleteMax(ele);
				if (deletedEle != null)
					System.out.print("deleted element: " + deletedEle);
				System.out.print("current max heap: ");
				heap.display();
				break;
			case 5:
				break;
			}
		} while (select < 5);
		sc.close();
	}
}
