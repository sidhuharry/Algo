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
		// We will take an array and then insert into a Binary Tree one by one

		// int a[] = { 76, 23, 64, 123, 6, 123, 76, 3, 6, 7, 353, 37, 43, 678,
		// 23,
		// 78, 934 };
		int a[] = {76, 23, 64, 123, 6, 76};

		BinaryTrees bt = new BinaryTrees();
		BTNode root = null; // root points to null because tree is empty
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				root = bt.insert(root, a[i]); // for first node
				System.out.println(root);
			} else
				bt.insert(root, a[i]);// insertion
		}
		System.out.println(root);
		bt.viewTree(root);

	}

	/**
	 * insertion in Binary tree
	 */
	public BTNode insert(BTNode node, int data) {
		BTNode newnode = getNode(data);
		if (node == null) { // First node
			node = newnode; // assigning first node
			return node;
		} else {
			if (data > node.data) {
				node.r_ptr=insert(node.l_ptr, data);
				return node;
			} else if (data <= node.data) {
				node.l_ptr=insert(node.r_ptr, data);
				return node;
			}
		}
		return node;

	}

	public BTNode getNode(int data) {
		BTNode node = new BTNode();

		node.data = data;
		node.l_ptr = null;
		node.r_ptr = null;
		return node;

	}

	/**
	 * Pre Order traversal
	 * 
	 * @param root
	 */
	public void viewTree(BTNode root) {
		BTNode ptr = root;
		if (ptr.l_ptr != null && ptr.r_ptr != null) {
			System.out.println(ptr.data); // display the data of root
			viewTree(ptr.l_ptr); // move to left
			viewTree(ptr.r_ptr); // move to right
		} else {
			System.out.println("---XX---");
		}

	}

}
