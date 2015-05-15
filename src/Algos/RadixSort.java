package Algos;

public class RadixSort {
	public static void main(String args[]) {
		int a[] = { 4353, 2325, 2374, 4343, 6396, 3467, 3467, 8459, 9848 };
		RadixSort rs = new RadixSort();
		int b[][]=rs.radixSort(a);
		for(int i =0; i < b.length; i++){
			for(int j=0;j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			System.out.println("------------------");
		}
			
	}

	public int[][] radixSort(int a[]) {
		int digit = 4;
		int b[][] = new int[digit] [a.length];
		digit--;
		for (int i = 1; a[0] / i > 0; i *= 10) {
			b[digit]=countSort(a,i);
			digit--;
		}
		return b;
	}

	public int[] countSort(int a[], int d) { // d is always in the power of 10
		int c[] = new int[getRange(a,d)+1];
		int result[] = new int[a.length];
		//get the occurrence of every radix
		for (int i = 0; i < a.length; i++) {
			int val = (a[i]/d)%10;
			c[val]++;
		}
		
		for(int i =1; i< c.length; i++) {
			c[i] = c[i]+ c[i-1];
		}
		
		for(int i=0; i<a.length; i++) {
			result[c[(a[i]/d)%10]-1] = a[i];
			c[(a[i]/d)%10]--;
		}

			return result;
	}

	public int getRange(int a[], int d) {
		int max = (a[0]/d)%10;
		for (int i = 0; i < a.length; i++) {
			if (max < ((a[i]/d)%10)) {
				max = (a[i]/d)%10;
			}
		}
		return max;
	}
}
