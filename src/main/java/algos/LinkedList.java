package algos;


class Node {
	Node node;
	int data;
}

public class LinkedList {
	
	public static void main(String args[]) {
		Node head = new Node();
		Node pointer = head;
		
		pointer.node = new Node();
		pointer.data = 10;
		pointer = pointer.node;
		
		pointer.node = new Node();
		pointer.data = 20;
		pointer = pointer.node;
		
		pointer.node = new Node();
		pointer.data = 30;
		pointer = pointer.node;
		
		pointer.node = new Node();
		pointer.data = 40;
		pointer = pointer.node;
		
		pointer.node = new Node();
		pointer.data = 50;
		pointer = pointer.node;
		
		pointer.node = null;
		pointer.data = 60;
		pointer = pointer.node;
		
		// -- traverse
		
		pointer = head;
		
		while(pointer != null ){
			pointer = pointer.node;
			pointer = pointer.node;
			pointer = pointer.node;
			System.out.println(pointer.data);
		}
	}
}
