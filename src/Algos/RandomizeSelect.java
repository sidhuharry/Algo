/**
 * This program find ith smallest element in the given array
 * This is also based on quick sort 
 * 
 * Complexity: we will discuss later
 */
package Algos;

/**
 * @author Harvinder
 *
 */
public class RandomizeSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 325, 32, 2, 5, 33, 334, 9, 984 };
		RandomizeSelect rs = new RandomizeSelect();
		System.out.println(rs.radomizeSelection(a, 0, a.length-1, 4));
	}

	/*
	 * the same method used in Quick Sort
	 */
	public int randomizePartition(int a[], int low, int high) {
		int pivot = a[high];
		int i = low;
		int smallerIndex = low - 1;
		for (; i < high; i++) {
			if (a[i] <= pivot) {
				smallerIndex++;
				int x = a[i];
				a[i] = a[smallerIndex];
				a[smallerIndex] = x;
			}
		}
		int x = a[high];
		a[high] = a[smallerIndex + 1];
		a[smallerIndex + 1] = x;

		return smallerIndex + 1;
	}

	/*
	 * this method will return you kth smaller number in array
	 */
	public int radomizeSelection(int a[], int low, int high, int k) {
		if (low == high) {
			return a[low];
		}
		int p = randomizePartition(a, low, high); // the partition index
		int index = p - low + 1;
		if (index == k) {
			return a[k];
		} else if (k < index) {
			return radomizeSelection(a, low, p - 1, k);
		} else {
			return radomizeSelection(a, p, high, k);
		}
	}

}
