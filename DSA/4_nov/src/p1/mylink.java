package p1;

public class mylink {
	
	    Node start;

	    // Add at Position
	    void addPos(int data, int pos) {
	        Node newNode = new Node(data);

	        // Position 1 => begin me insert
	        if (pos == 1) {
	            newNode.next = start;
	            start = newNode;
	            return;
	        }

	        Node temp = start;
	        int count = 1;

	        // STOP temp at (pos-1)
	        while (count < pos - 1 && temp != null) {
	            temp = temp.next;
	            count++;
	        }

	        // Invalid Position
	        if (temp == null) {
	            System.out.println("Invalid Position!");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // Display
	    void display() {
	        Node t = start;
	        while (t != null) {
	            System.out.print(t.data + " → ");
	            t = t.next;
	        }
	        System.out.println("NULL");
	    }
	}

