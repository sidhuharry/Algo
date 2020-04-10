package Algos;

public class QuickSort {

	public static void main(String args[]) {
		int a[] = { 34, 43, 100, 11, 33, 54, 9, 42, 65, 2 };
		QuickSort qs = new QuickSort();
		a = qs.quickSort(a, 0, a.length - 1);
		for (int value : a)
			System.out.println(value);
	}

	/*
	 * pivot point is first element
	 */
	public int partitionByFirst(int a[], int low, int high) {
		int pivot = a[low]; // pivot point is starting point
		int leftIndex = low;
		int rightIndex = high;

		while (true) {
			while (a[leftIndex] != pivot && pivot > a[leftIndex])
				leftIndex++;
			while (a[rightIndex] != pivot && pivot < a[rightIndex])
				rightIndex--;
			if (leftIndex < rightIndex) {
				int temp = a[leftIndex]; // swap'em
				a[leftIndex] = a[rightIndex];
				a[rightIndex] = temp;
			} else
				return rightIndex;
		}
	}

	/*
	 * Pivot point is last element
	 */
	public int partitionByLast(int a[], int low, int high) {
		int pivot = a[high]; // pivot
		int pivotIndex = low; // elements left to pivot index should be smaller
								// than
								// element at pivot and at right elements should
								// be greater than pivot

		for (int currentElement = low; currentElement <= high - 1; currentElement++) {
			// If current element is smaller than or equal to pivot
			if (a[currentElement] <= pivot) {
				int t = a[currentElement]; // Swap current element with
											// pivotIndex
				a[currentElement] = a[pivotIndex];
				a[pivotIndex] = t;
				pivotIndex++;
			}
		}
		int t = a[pivotIndex];
		a[pivotIndex] = a[high];
		a[high] = t;
		return pivotIndex;
	}

	/*
	 * this one uses the another method of partition
	 * 
	 * In this method we divide array into 4 regions 1. elements smaller than or
	 * equal to pivot 2. elements greater than pivot 3. unrestricted 4. pivot
	 * itself
	 */
	public int partitionByLast2(int a[], int low, int high) {
		int indexSmaller = low - 1;
		int index = low;
		int pivot = a[high];

		for (; index < high; index++) {
			if (a[index] <= pivot) {
				indexSmaller++;
				int x = a[indexSmaller];
				a[indexSmaller] = a[index];
				a[index] = x;
			}
		}
		int x = a[high];
		a[high] = a[indexSmaller + 1];
		a[indexSmaller + 1] = x;

		return indexSmaller + 1;
	}

	public int[] quickSort(int a[], int low, int high) {
		if (low < high) {
			int p = partitionByLast2(a, low, high);
			quickSort(a, low, p - 1);
			quickSort(a, p + 1, high);
		}
		return a;
	}

}
