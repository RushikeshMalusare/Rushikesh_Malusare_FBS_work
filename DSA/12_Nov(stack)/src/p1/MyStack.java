package p1;

public class MyStack {
	
	private int top=0;
	private Node [] arr=new Node[10];
	static MyStack ref=new MyStack();//constructor call
	
	public MyStack() {
		
	}
	
	private MyStack(Node[] ref) {
		arr=ref;
	}

	public static MyStack getObject() {
		return ref;
	}
	
	public Node[] getArr() {
		return arr;
	}

	public void setArr(Node[] arr) {
		this.arr = arr;
	}
	
	
	public void push(int value) {
		Node ref=new Node(value);
		arr[top]=ref;
		top++;
		
	}
	public void display() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
	
	
	