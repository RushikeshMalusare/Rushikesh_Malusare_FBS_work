package p1;
public class MyQue {
    Node head;   // front
    Node tail;   // rear

    // Insert at tail
    private Node [] arr=new Node[2];
    
    static MyQue ref=new MyQue();
    
    public void enqueue(int value) {
        Node temp = new Node(value);

        if (head == null) {   // empty queue
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        System.out.println(value + " inserted");
    }

    // Remove from head
    public int dequeue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return -1;
        }

        int removed = head.data;
        head = head.next;

        if (head == null)
            tail = null;

        return removed;
    }

    public void display() {
        Node t = head;
        if (t == null) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.print("Queue: ");
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

	public static MyQue getObject() { 
			return ref;
	}

	public void push(int value) {
		if (tail== arr.length) {
            System.out.println("Queue is full");
            return;
        }
		
	}
}


//package p1;
//
//public class MyQue {
//	
//		private int head;
//		private int tail;
//		private Node [] arr=new Node[10];
//		static MyQue ref=new MyQue();//constructor call
//		
//		public MyQue() {
//			
//		}
//		
//		private MyQue(Node[]ref) {
//			arr=ref;
//		}
//
//		public static MyQue getObject() {
//			return ref;
//		}
//		
//		public Node[] getArr() {
//			return arr;
//		}
//
//		public void setArr(Node[] arr) {
//			this.arr = arr;
//		}
//		
//		
//		public void push(int value) {
//			if (tail== arr.length - 1) {
//	            System.out.println("Queue is full");
//	            return;
//	        }
//			Node ref=new Node(value);
//			arr[tail]=ref;
//			tail++;
//			
//		}
//		
//		
//}
//		
//		
//		
//		
////		public void display() {
////	        if (head == 0) {
////	            System.out.println("empty");
////	        } else {
////	            System.out.print("Que elements: ");
////	            for (int i = head; i >= 0; i--) {
////	                System.out.print(arr[i] + " ");
////	            }
////	            System.out.println();
////	        }
////	    }
//	
//		
//
