package p1;
public class MyLinkedList {
	Node start;
	
	public void addFirst(int data) {
		Node temp=new Node(data);
		temp.next=start;
		start=temp;
	}
	
	public void addLast(int data) {
		Node temp=new Node(data);//node ka object
		
		if(start==null) {
			start=temp;
		}
		else {
			Node itr=start;
			while(itr.next!=null) {
				itr=itr.next;
			}
			itr.next=temp;
		}
		
		System.out.println("Data Added!");
	}
	
	public void display() {
		if(start==null) {
			System.out.println("Data Not Found ");
		}
		else {
			Node itr=start;
			while(itr.next!=null) {
				
				System.out.print(itr.getData()+"->");
				itr=itr.next;
				
			}
			
			System.out.print(itr.getData()+"->Null");
			System.out.println();
		}
	}

	public void addPosition(int data) {
		
	}


	
}
 