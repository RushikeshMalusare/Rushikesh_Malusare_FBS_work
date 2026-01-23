package p1;

public class Node {
	
		int data;
		public Node next;

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

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
		
		
}
