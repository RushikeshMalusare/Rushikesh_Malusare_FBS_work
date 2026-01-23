package p1;

public class Doubly_linkedList {
	Node start;
	Node end;
	
	
	public void insertBegi(int ele) {
		
		Node temp=new Node(ele);
		if(start==null) {
			start=temp;
			end=temp;
		}
		else {
			temp.next=start;
			start.prev=temp;
			start=temp;
			
		}
		System.out.println("Node Add At Beginning");
	}
	public void insertEnd(int ele) {
		Node temp =new Node(ele);
		
		if(start==null) {
			start=temp;
			end=temp;
		}
		else {
			end.next=temp;
			temp.prev=end;
			end=temp;
		}
		System.out.println("Node At The End");
	}
	public void display(){
		if(start==null) {
			System.out.println("List is Empty");
		}
		else {
			Node itr=start;
			while(itr.next!=null) {
				System.out.print(itr.getData()+" <-->");
				itr=itr.next;
			}
			System.out.print(itr.getData()+" <-->NULL");
		}
	}
}

	

