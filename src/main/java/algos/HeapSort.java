package algos;

public class HeapSort {

	public static void main(String[] args) {

		Heap h = new Heap();
		HeapSort hs = new HeapSort();
		int a[] = { 12, 57, 19, 87, 15, 44, 23 };
		int heap[] = h.buildHeap(a);
		heap = hs.heapSort(heap);
		for (int value : heap) {
			System.out.println(value);
		}

	}

	public int[] heapSort(int heap[]) {
		int sortedHeap[] = new int[heap.length];
		Heap h = new Heap();
		int i = 0;
		while (heap.length >= 1 && i < sortedHeap.length) {
			sortedHeap[i++] = heap[0];
			heap = h.deleteHeap(heap[0], heap);
		}
		return sortedHeap;
	}
}
