/**
 * A binary is a tree such that.. left_child 
 */

package Algos;


class BTNode {
	
	BTNode l_ptr;
	BTNode r_ptr;
	int data;
	
}

public class BinaryTrees {
	
	public static void main(String args[]) {
		//We will take an array and then insert into a Binary Tree one by one
		
		int a[] = {76,23,64,123,6,123,76,3,6,7,353,37,43,678,23,78,934};
		
		BinaryTrees bt = new BinaryTrees();
		BTNode root = new BTNode(); // root points to 1st node of a BT
		bt.insert(a, root); // insertion
		
	}
	
	/**
	 * insertion in Binary tree
	 * @param a
	 * @param root - root to BT
	 */
	public void insert(int a[], BTNode root) {
		//first node will be root
		BTNode ptr = root;
		for(int i =0; i< a.length; i++) {
			if( i == 0 ) { // for the first node
				ptr.data = a[i];
				ptr.l_ptr = null;
				ptr.r_ptr = null;
			}
			
		}
	}

}
