package p1;

public class Main {

	public static void main(String[] args) {
		
				Main m1=new Main();
				m1.insert(10);
				m1.insert(20);
			}
			
			public void insert(int value) {
				MyQue ref=MyQue.getObject(); //only one object can create
				ref.push(value);
			}
			
		}
