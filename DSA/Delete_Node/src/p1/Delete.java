package p1;

public  class Delete {
	Node start;
	
	void insert(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
            return;
        }

        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
	
	public void DeleteBeg() {
	if (start == null) {
        System.out.println("List is empty!");
           return;
      }
	start=start.next;
	}
	
	public void DeleteEnd() {
		if (start == null) {
	        System.out.println("List is empty!");
	           return;
	      }
		if(start.next==null) {
			start=null;
			return;
		}
		Node temp=start;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next=null;
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
	
	public void display() {
        if (start == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = start;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

	public void deleteBeg() {
		// TODO Auto-generated method stub
		
	}
}

