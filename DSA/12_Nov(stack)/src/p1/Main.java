package p1;

public class Main {

	public static void main(String [] arg) {
		Main m1=new Main();
		m1.insert(10);
		m1.insert(20);
	}
	
	public void insert(int value) {
		MyStack ref=MyStack.getObject(); //only one object can create
		ref.push(value);
	}
	
}