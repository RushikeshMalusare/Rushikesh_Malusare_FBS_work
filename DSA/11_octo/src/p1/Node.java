package p1;

public class Node {
	Emp data;
	Node prev,next;
	
	public Node(Emp data) {
		this.data = data;
	}

	public Emp getData() {
		return data;
	}

	public void setData(Emp data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
