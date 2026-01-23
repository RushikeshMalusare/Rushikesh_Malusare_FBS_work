package p2;

public class delete{
	Node start;
	
	

    // Add at Position
    void addPos( int pos) {
        Node newNode = new Node(pos);

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
	
 void deletePos(int pos) {
		        // Position 1 => begin me insert
		        if (start ==null) {
		           System.out.println("List is empty");
		            return;
		        }
		        if(pos==1) {
		        	start=start.next;
		        	System.out.println("Node delete "+pos);
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
		        if (temp == null||temp.next==null) {
		            System.out.println("Invalid Position!");
		            return;
		        }

		        temp.next = temp.next.next;
		        System.out.println("Node delete"+pos);
		    }
 		void display() {
 			Node t = start;
 			while (t != null) {
 				System.out.print(t.data + " → ");
 				t = t.next;
 			}
 			System.out.println("NULL");
 		}
	}

		 
		




