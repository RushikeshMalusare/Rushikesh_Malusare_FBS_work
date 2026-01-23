package p1;

public class Node {
	
	int data;
	Node prev;
	
	 Node next;
	 
	 
	public Node() {
	
	}
	public Node(int data) {

		this.data = data;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
	
}
