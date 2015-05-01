package Algos;
/**
 *
 * There are two steps for merge sort.
 * 
 * 1. Divide
 * 2. Merge
 *
 */
public class MergeSort {
	
	public static void main(String args[]){
		
		int a[] = {232,6,1,5,7,761,23};
		int lb = 0;
		int ub = a.length-1;
		MergeSort m = new MergeSort();
	
		m.divide(a, lb, ub);		
		
	}
	
	public void divide(int a[], int lb, int ub){
		
		if(lb<ub) {
			int mid = (lb+ub)/2;
			//call recursive
			divide(a, lb, mid);
			divide(a, mid+1, ub);
			merger(a, lb, mid, ub);
		}
	}
	
	public void merger(int a[], int lb, int mid, int ub) {
		int leftPtr = lb;
		int rightPtr = mid+1;
		
		while(leftPtr <= mid && rightPtr <= ub ) {
			if( a[leftPtr] > a[rightPtr] ) {
				//swap'em
				int temp = a[leftPtr];
				a[leftPtr] = a[rightPtr];
				a[rightPtr] = temp;
				rightPtr++;
			}
			else
				leftPtr++;
			
		}
		
		for(int value: a) {
			System.out.println(value);
		}
		System.out.println("---XX---");
		
	}

}
