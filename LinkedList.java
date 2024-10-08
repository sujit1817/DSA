# DSA
Important Questions on Linked list

Q1. Explain linked list and its structure?
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.
Representation of Linked List
Let's see how each node of the linked list is represented. Each node consists:

1.A data item(data)
2.An address of another node (next)

first is head, last is tail. last node contains null.

--Linked List Applications
1.Dynamic memory allocation
2.Implemented in stack and queue
In undo functionality of softwares
Hash tables, Graphs

Q2. List various operations performed on Linked list.
Traversal: To traverse all the nodes one after another.

Insertion: To add a node at the given position.

Deletion: To delete a node.

Searching: To search an element(s) by value. (search for index)


Updating: To update a node.

Sorting: To arrange nodes in a linked list in a specific order.

Merging: To merge two linked lists into one.


Q4.Difference between Array and Linklist
Array and Linked list are the two ways of organizing the data in the memory.
1_In array, all the elements are need to be store in an contiguous manner. 
1_In Linked list, all nodes are not in contiguous manner and linked toghether via references.

2_Increasing size in array is time taking process
2_Increasing size is not a problem till memory space is available.

3_Array elements are independent of each other.
3_Linked list elements are dependent on each other.
As each node contains the address of the next node so to access the next node, we need to access its previous node.

4_An array is a collection of elements of a similar data type.
4_A linked list is a collection of objects known as a node where node consists of two parts, i.e., data and address.

5_Accessing any element in an array is faster as the element can be accessed directly through index.
5_Accessing an element in a linked list is slower as it starts traversing from first element of the linked list.



Q5. List types of Linked List.
Following are the types of linked list

1)Singly Linked List.
2)Doubly Linked List.
3)Circular Linked List.

1)Singly Linked List
A Singly-linked list is a collection of nodes linked together in a sequential way where each node of the singly linked list contains 
a data field and an address field that contains the reference of the next node.

for understanding
class Node {
    int data // variable to store the data of the node
    Node next // variable to store the address of the next node
}
//imp point next = null
The nodes are connected to each other in this form where the value of the next variable of the last node is NULL 
i.e. next = NULL, which indicates the end of the linked list.

2)Doubly Linked List
A Doubly Linked List contains an extra memory to store the address of the previous node, together with the address of the next node 
and data which are there in the singly linked list. So, here we are storing the address of the next as well as the previous nodes.

3)Circular Linked List
A circular linked list is a variation of a linked list in which the last node points to the first node, completing a full circle of nodes.
There are basically two types of circular linked list:

1. Singly Circular Linked List

Here, the next of the last node consists of the address of the first node.

2. Doubly Circular Linked List

Here, in addition to the last node storing the address of the first node, the first node will also store the address of the last node.

//Linked list operartions
package com.collections;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size=0;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}
	
	public void add(int index, int data) {
		if(index == 0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i=0;
		while(i<index-1){
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void print() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public int removeFirst() {
		if(size == 0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size=0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.print();
		list.addFirst(1);
		list.print();
		list.addFirst(2);
		list.print();
		list.addFirst(3);
		list.print();
		list.addFirst(4);
		list.print();
		
		list.addLast(5);
		list.print();
		list.addLast(6);
		list.print();
		
		list.add(4,0);
		list.print();
		
		System.out.println("size : "+list.size);
		
		list.removeFirst();
		list.print();
	}
}

