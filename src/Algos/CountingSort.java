/**
 * This sort runs in a linear time
 * 	
 */

package Algos;

public class CountingSort {
	public static void main(String args[]) {
		int a[] = { 1, 4, 1, 2, 7, 5, 2, 6, 0, 2, 4 };
		int result[] = new CountingSort().countSort(a,7);
		for(int val: result)
			System.out.println(val);
	}

	public int[] countSort(int a[], int setRange) {
		int temp[] = new int[setRange+1];
		int result[] = new int[a.length];

		// get the occurrence of each element
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			temp[element]++;
		}
		// Now the temp array contains occurrence of every element
		// element is indicated by it's indices

		// Now every element indicated by indices
		// should store value of numbers which are less
		// than or equal to it

		for (int i = 1; i < temp.length; i++) {
			temp[i] = temp[i - 1] + temp[i];
		}

		// Now the temp array contains
		// the original numbers represented by indices
		// and the number of elements which are less or equal to it
		// represented by value at indices
		// for eg: temp[3] = 2 means number is 3 and there are
		// 2 numbers which are less than or euqal to it.
		// So now we know where to put element 3 in result array which is at
		// position 2
		// after putting it there don't forget to decrease temp[3] by 1

		for (int i = result.length-1; i >= 0; i--) {
			int element = a[i];
			int count = temp[a[i]]; //count is the number of elements which are less then or equal to element
			result[count-1] = element; //because indices start from Zero so decrease count by 1
			temp[a[i]]--;
		}

		return result;
	}

}
