/**
 * Heap data structure based on arrays
 * I am here trying to implement max heap-> that means max element should be at the root
 * the element at i th index has parent at i/2 index
 * and left child at (2i) and right child at (2i+1)
 */

package Algos;

import java.util.Arrays;
import java.util.Scanner;

public class Heap {

	public static void main(String args[]) {
		int a[] = { 0, 12, 57, 19, 87, 15, 44, 23 };

		// transfer a into heap and display it

		Heap h = new Heap();
		int heap[] = h.buildHeap(a); 
		for (int value : heap) {
			System.out.println(value);
		}

		Scanner in = new Scanner(System.in);
		System.out.println("Enter node which you want to delete");
		int data = in.nextInt();
		int[] newHeap = h.deleteHeap(data, heap);
		for (int value : newHeap) {
			System.out.println(value);
		}
	}

	/*
	 * inserts one element and percolate it to top if it is biggest element!
	 */
	public int[] buildHeap(int a[]) {
		int heap[] = new int[a.length];
		heap[0] = 0;
		for (int i = 1; i < a.length; i++) {
			heap[i] = a[i];
			heap = heapify(heap, i);
		}
		return heap;
	}

	public int[] deleteHeap(int data, int heap[]) {
		int i = 1;
		int[] newHeap = new int[heap.length-1];
		while (i < heap.length) {
			if (heap[i] == data) {
				int x = heap[i];
				heap[i]=heap[heap.length-1];
				System.arraycopy(heap, 0, newHeap, 0, newHeap.length);
				newHeap = heapify(newHeap, newHeap.length-1);
				return newHeap;
			}
			i++;
		}

		return newHeap;
	}

	public int[] heapify(int heap[], int lastIndex) {
		int kid = lastIndex;
		int parent = kid / 2;
		while (heap[parent] < heap[kid] && parent != 0) {
			if (kid != 0) {
				int x = heap[kid / 2];
				heap[kid / 2] = heap[kid];
				heap[kid] = x;
				kid = kid / 2;
				parent = kid / 2;
			}
		}
		return heap;
	}

}
