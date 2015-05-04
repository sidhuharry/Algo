package Algos;

public class HeapSort {

	public static void main(String[] args) {

		Heap h = new Heap();
		HeapSort hs = new HeapSort();
		int a[] = { 0, 12, 57, 19, 87, 15, 44, 23 };
		int heap[] = h.buildHeap(a);
		for (int value : heap) {
			System.out.println(value);
		}
		heap = hs.heapSort(heap);

	}

	public int[] heapSort(int heap[]) {
		int sortedHeap[] = new int[heap.length];
		Heap h = new Heap();
		int i = 1;
		while (i < heap.length - 1) {
			System.out.println("length: " + heap.length);
			sortedHeap[i] = heap[i];
			heap = h.deleteHeap(heap[i], heap);
			i++;
		}
		return sortedHeap;
	}
}
