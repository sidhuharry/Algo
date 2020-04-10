/**
 * Heap data structure based on arrays
 * I am here trying to implement max heap-> that means max element should be at the root
 * the element at i th index has parent at i/2 index
 * and left child at (2i) and right child at (2i+1)
 */

package algos;

import java.util.Scanner;

public class Heap {

	public static void main(String args[]) {
		int a[] = { 23 };

		// transfer a into heap and display it

		Heap h = new Heap();
		int heap[] = h.buildHeap(a);
		for (int value : heap) {
			System.out.print(value + ", ");
		}

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("Enter node which you want to delete");
			int data = in.nextInt();
			heap = h.deleteHeap(data, heap);
			for (int value : heap) {
				System.out.print(value + ", ");
			}
		}

	}

	/*
	 * inserts one element and percolate it to top if it is biggest element!
	 */
	public int[] buildHeap(int a[]) {
		int heap[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			heap[i] = a[i];
			int kid = i;
			int parent = getParent(kid);
			if (parent < 0)
				parent = 0;
			while (parent >= 0 && heap[parent] <= heap[kid]) {
				int x = heap[parent];
				heap[parent] = heap[kid];
				heap[kid] = x;
				kid = parent;
				parent = getParent(parent);
			}
		}
		return heap;
	}

	public int[] deleteHeap(int data, int heap[]) {
		if (heap.length > 1) {
			int i = 0;
			int[] newHeap = new int[heap.length - 1];
			while (i < heap.length) {
				if (heap[i] == data) {
					heap[i] = heap[heap.length - 1];
					System.arraycopy(heap, 0, newHeap, 0, newHeap.length);
					newHeap = heapify(newHeap, 0);
					return newHeap;
				} else
					i++;
			}
		} else
			return heap;
		
		return heap;
	}

	public int[] heapify(int a[], int index) { // index is the root when we
												// first time call this function
		int largest = index; // parent
		int leftKid = (2 * index) + 1;
		int rightKid = (2 * index) + 2;
		if (leftKid < a.length && a[largest] <= a[leftKid]) {
			largest = leftKid;
		}
		if (rightKid < a.length && a[largest] <= a[rightKid]) {
			largest = rightKid;
		}
		if (index != largest) {
			int x = a[largest];
			a[largest] = a[index];
			a[index] = x;
			return heapify(a, largest);
		}
		return a;
	}

	public int getParent(int kid) {
		return (kid % 2 == 0) ? (kid / 2) - 1 : (kid / 2);
	}
}
