package p1;
public class Node {
	int data;
	Node next;
	
	public Node() {
		
	}

	public Node(int data) {//node ka object banaya to next node nhi rahega
	super();
	this.data = data;
	
}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
	
