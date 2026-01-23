package p1;

public class Preorder {
		
		Node root;
		public static void main(String[] args) {
			Preorder m1=new Preorder();
			  m1.insert("yash");
		      m1.insert("Aditya");
		      m1.insert("Raj");
		      System.out.println("Added Data");
		      
		      System.out.println("Preorder Traversal:");
		        m1.preorder(m1.root);
		
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
			
			// ✅ Preorder Traversal
		    public void preorder(Node root) {
		        if (root == null)
		            return;

		        System.out.println(root.data);     // 1. Visit
		        preorder(root.left);              // 2. Left
		        preorder(root.right);             // 3. Right
		    }
			
		}
		

