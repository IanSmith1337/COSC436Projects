package LinkedList;

/* 
Linked List assignment by Ian Smith and Melissa Trick. 
Written using pair programming, both of us had about equal contribution as we interchanged positions many times and discussed possible solutions.
Most of the code in the inner class was written by Melissa as driver, and most of the code in the main 436 class was written by Ian.

*/

public class LinkedList436 {
	private int counter;
	private Node head;
 
	// appends the specified element to the end of this list.
	// Ian
	public void add(Object data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			Node traverse = head;
			while (traverse.next != null) {
				traverse = traverse.getNext();
			}

			traverse.setNext(node);
		}
		counter++;
	}
	
	// inserts the specified element at the specified position in this list
	// Both Ian and Melissa
	public void add(Object data, int index) {
		 
		Node node = new Node(data);
		if(head == null || index == 0) {
			head = node;
		} else {
			Node temp = null;
			while(index < size()) {
				node = (Node) get(index-1);
				temp = node.getNext();
				node = (Node) get(index);
				node.setNext(temp);
				node.setData(data);
				index+=2;
			}

		}
		counter++;
	}
	
	// returns the element at the specified position in this list.
	public Object get(int index) {
		try {
			int repeats = 0;
			Node traverse = head;
			while (repeats < index) {
				traverse = traverse.getNext();
				repeats++;
			}
			return traverse;
		} catch (Exception e) {
			return null;
		}
	}
 
	// removes the element at the specified position in this list.
	// Driver: Melissa, Navigator: Ian
	public boolean remove(int index) {
		 
		//find index using get
		//if index found, delete and return true
		//if not, return false.

		Node currentNode = head;
		Node prev = null;
		int attempts = 0;

		if(index == 0)
		{
			head = currentNode.getNext();
			counter--;
			return true;
		}

		while((currentNode != null) && (index < size()))
		{
			prev = currentNode;
			currentNode = currentNode.getNext();
			attempts++;

			if(attempts == index)
			{
				prev.next = currentNode.next;
				counter--;
				return true;
			}
		}
		
		return false;

	}
 
 
	// returns the String content of all the nodes in this list. 
	public String toString() {
		String list = "";
		for (int i = 0; i < (size()); i++) {
			Node ntp = (Node) get(i);
			try {
				Object data = ntp.getData();
				if(list.equals("")){
					list = (String) data;
				} else {
					list = list + ", " + (String) data;
				}
			} catch (Exception e) {
				list = list + ", " + "null";
			}
		}	
		return list;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return counter;
	}
	
	
	private class Node {

		//TODO: PLEASE FINISH THIS INNER CLASS.
		// reference to the next node in the chain, or null if there isn't one.
		Node next;
 
		// data carried by this node. could be of any type you need.
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			this.setData(dataValue);
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		public void setData(Object dataValue) {
			this.data = dataValue;
		}
 		
		// return the next node of the current node
		public Node getNext() {
			return next;
		}


		public void setNext(Node nextValue) {
			this.next = nextValue;
		}
	}
}