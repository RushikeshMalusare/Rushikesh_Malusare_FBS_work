package p1;

public class Main {
	
	Node root;
	public static void main(String[] args) {
		Main m1=new Main();
		  m1.insert("yash");
	      m1.insert("Aditya");
	      m1.insert("Raj");
	      System.out.println("Added Data");
	      
	
	
	}	
		private void insert(String value) {
			root=insertValue(root,value);
			
		}
		private Node insertValue(Node root,String value) {
			if(root==null) {
				return new Node(value);
			
			}
			if(value.compareTo(root.data)>0) {
				root.right=insertValue(root.right,value);
			}
			else if(value.compareTo(root.data)<0) {
					root.left=insertValue(root.left,value);
				}
			return root;
			}
		
	
		
	}
	
