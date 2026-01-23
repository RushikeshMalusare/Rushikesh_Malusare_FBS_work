package p1;

public class Postorder {

			Node root;
			public static void main(String[] args) {
				Postorder m1=new Postorder();
				  m1.insert("yash");
			      m1.insert("Aditya");
			      m1.insert("Raj");
			      System.out.println("Added Data");
			      
			      System.out.println("Postorder Traversal:");
			        m1.postorder(m1.root);
			
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
				
		
			    public void postorder(Node root) {
			        if (root == null)
			            return;
			        
			        postorder(root.left);       
			        postorder(root.right);      
			        
			        System.out.println(root.data);  
			        
			    }
				
			}
			
