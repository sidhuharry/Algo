/**
 * A binary is a tree such that.. left_child 
 */

package algos;

import java.util.Scanner;

class BTNode {

	BTNode l_ptr;
	BTNode r_ptr;
	int data;

}

public class BinaryTrees {

	public static void main(String args[]) {
		// We will take an array and then insert into a Binary Tree one by one

		int a[] = { 76, 23, 64, 123, 176, 100, 101, 55, 21 }; /*
															 * , 123, 76, 3, 6,
															 * 7, 353, 37, 43,
															 * 678, 23, 78, 934
															 * };
															 */

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
		Scanner in = new Scanner(System.in);
		System.out.println("enter node to delete");
		int value = in.nextInt();
		root = bt.deleteNode(root, root, value);
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
			if (data > node.data) { // data is greater than node then move to
									// right side.
				node.r_ptr = insert(node.r_ptr, data); // assign the r_ptr so
														// move to the right
														// side.
				return node;
			} else if (data <= node.data) { // data is smaller than node then
											// move to the left side
				node.l_ptr = insert(node.l_ptr, data); // assign to l_ptr so
														// that you can move to
														// the left
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
		if (ptr != null) {
			System.out.println("|" + ptr.data + '|'); // display the data of
														// root
			viewTree(ptr.l_ptr); // move to left
			viewTree(ptr.r_ptr); // move to right
		} else {
			System.out.println("X"); // NULL POINTER
		}

	}

	public BTNode deleteNode(BTNode node, BTNode root, int data) { // ptr
																	// point
																	// to
																	// root
		// while calling
		// function
		/*
		 * There are 3 cases in deleting a node in BT 1. node with no kids 2.
		 * node with one kids 3. node with two kids
		 */
		if (node == null) // exit condition
			return root;
		if (node.data == data) {
			if (node.l_ptr == null && node.r_ptr == null) { // case 1
				if (node == root) { // in case there is only one node in the
									// tree
					root = null;
					return root;
				} else
					node = null;
			} else if (node.l_ptr == null) { // that means the node has only one
												// child which is on right side
				BTNode min_node = minNode(node); // find the min node
				node.data = min_node.data; // copy the data at present node
				node.r_ptr = deleteNode(node.r_ptr, root, min_node.data); // delete
																			// the
																			// poor
																			// min
																			// node
				return node;
			} else if (node.r_ptr == null) {
				BTNode min_node = minNode(node);
				node.data = min_node.data;
				node.l_ptr = deleteNode(node.l_ptr, root, min_node.data);
				return node;
			} else {
				BTNode min_node = minNode(node);
				node.data = min_node.data;
				node.r_ptr = deleteNode(node.r_ptr, root, min_node.data);
			}

		} else if (data <= node.data)
			node.l_ptr = deleteNode(node.l_ptr, root, data);
		else if (data > node.data)
			node.r_ptr = deleteNode(node.r_ptr, root, data);

		return node;
	}

	/*
	 * Find the minimum node in the right subtree of node to be deleted.
	 */
	public BTNode minNode(BTNode node) {
		if (node.r_ptr != null)
			node = node.r_ptr; // go one right!
		while (node.l_ptr != null) {
			node = node.l_ptr;
		}
		return node;
	}

}
