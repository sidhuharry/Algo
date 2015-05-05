package Algos;

public class HeapSort {

	public static void main(String[] args) {

		Heap h = new Heap();
		HeapSort hs = new HeapSort();
		int a[] = { 0, 12, 57, 19, 87, 15, 44, 23 };
		int heap[] = h.buildHeap(a);
		heap = hs.heapSort(heap);
		for (int value : heap) {
			System.out.println(value);
		}

	}

	public int[] heapSort(int heap[]) {
		int sortedHeap[] = new int[heap.length];
		Heap h = new Heap();
		int i = 1;
		while (heap.length > 2 && i < sortedHeap.length) {
			sortedHeap[i++] = heap[1];
			heap = h.deleteHeap(heap[1], heap);
		}
		return sortedHeap;
	}
}
