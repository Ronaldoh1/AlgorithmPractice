package SingleLinkList;
import java.util.Scanner;

public class SingleLinkedList {
	
	public Node start; //we need a reference to the start of the list. 
	public int n; //number of nodes in the list. 
	
	public SingleLinkedList(){
		
		start = null; //here we are setting the start of the list to null. 
		
	}
	public void displayList(){
		
		Node p = this.start;
		
		if (start == null)
		{
			System.out.println("The List is empty");
		}else{
			
			
			
			while (p != null){
				n++;
				System.out.println(p.info);
				p = p.link;
				
			}
			System.out.println();
		}
		
		System.out.println("Number of nodes is " + n);
}//end of display list. 
	public void countNodes(){
		int n = 0; 
		
		Node p = start; 
		
		while (p != null){
			
			n++;
			p = p.link;
			
		}
		System.out.println("There are " + n + "Nodes in the list");
	}//End of node count. 
	
	public boolean search(int x){
	
		//first we want to get a reference to the list. 
		Node p = start; 
		int position = 1;
		while (p!= null){
			
			if(p.info == x){
				break;
			}
				position++; //increment the position 
				p=p.link; // we also go to the next node.
				
			
		}
		
		if (p == null){
			System.out.println("The number was not found in the list");
			return false;
		}else{
			
			System.out.println("The number was found and it was located at position " + position);
			return true; 
		}
		
		
	}
	public void findLastNode(){
	
		Node p = start;
		while(p!=null)
		{
			p = p.link;
		}
	}
	public void findSecondToLastNode(){
		Node p = start; 
		while(p.link.link != null){
			p = p.link;
		}
		
	}
	
	public void findNumber(int x){
		
		Node p = start; 
		int position = 1; 
		while(p != null){
			
			if(p.info == x){
			break;	
			}
			position++;
			p = p.link;
		}
	
	}
	
	//finding reference to predecesor
	
	public void findPredecesorToNumber(int x){
		
		Node p = start; 
		
		while (p != null){
			
			if(p.link.info == x){
				break;
			}
			p = p.link;
			
		}
	}

	//Find item at the kth position.
	
 public void getInfoAtPosition(int k){
	 Node p = start;
	 
	 for (int i = 1; i<k && p!=null; i++){
		 
	
		 p =p.link;
		 
		 
	 }
	 
 }
 
 //Inserting a single linked list. 
 
 //Inset at the begining. 
 
 public void insertAtHead(int x){
	
	 Node temp = new Node(x);
	 
	 temp.link = start;
	 start = temp; 
	 
 }
 //the only reference you have here is that to the begining of the list. 
 public void insertNodeInEmptyList(int x){
	 Node p  = this.start;
	 Node temp = new Node(x);
	 
	 p.link = temp;
	 
 }
 
 //How to insert at the end of the list. 
 
 public void insertAtEnd(int x){
	 Node p;
	 
	 Node temp = new Node(x);
	 
	 if( start == null){
		 start = temp;
		 return;
	 }
	 p = start; 
	 
	 while(p.link != null){
		 p=p.link;
		 
	 }
	 p.link = temp;
	 
 }
 
 public void createList(){
	 
	 int i, n, data;
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter the number of nodes");
	 
	 n = scan.nextInt();
	 
	 if (n == 0){
		 return;
	 }
	 for (i = 1; i <= n; i++){
		 System.out.print("Enter elements to be inserted :")
		 ;
		 data = scan.nextInt();
		insertAtEnd(data);
	 }
 }
 
 //Inserting between two nodes of a list. 
 
 
 //Inserting after a given node.
 
 public void insertAfterGivenNode( int x){
	 
	 Node p = start; 
	
	 
	 while (p != null){ 
		 if (p.info == x){
			 break;
		 }
		 p = p.link;
		 
	 }
	 
	 if (p == null){
		 System.out.println(x + " not present in the list");
	 }else{
		 Node temp = new Node(x);
		 temp.link = p.link;
		 p.link = temp;
	 }
	
	 
 }
 
//Insert Before A node 
 public void insertBeforeNode(int x){
	 
	 Node p = start; 
	 Node temp = new Node(x);
	 
	 while(p.link != null){
		 if(p.link.info == x){
			 break;
		 }
		 p = p.link;
	 }
	 
	 if (p == null){
		 System.out.println(x + "not present in the list");
	 }
	 
	 //X is in first node, new node is to be inserted before first node. 
	 if(x == start.info){
		temp.link = start;
		start = temp;
	  return;
	 }
	 
	 /*Find reference to predecessor of node containing x. 
	  * 
	  * */
	 
	 while(p.link != null){
		 if(p.link.info == x){
			 break;
		 }
		 p=p.link;
	 }
 }
 
 //Inserting at kth position in the list. 
 
 public void insertAtPosition(int data, int k){
	 
	 Node temp;
	 int i;
	 if (k == 1){
		 temp = new Node (data);
		 temp.link = start;
		 start = temp;
		 return;
	 }
	 
	 Node p = start;
	  for (i = 1; i<k-1 && p!=null; i++){
		  p=p.link;
		  
	  }
	  if(p == null){
		  System.out.println("You can insert only up to " + i + "the position");
	  }else{
		  
		  System.out.println("You can insert only upto " + i + "th position");
	  }
 }
 
 //Deletion of a node in singly Linked List. 

 public void deleteFirstNode(){
	 
	 if(start == null){
		 return;
	 }
	 start = start.link;
 }
 //Delete the Last Node. 
 public void deleteLastNode(){
	 //check if the list is empty
	 if (start.link == null){
		 return; 
	 }
	 //check if the there is only one Node. 
	 if (start.link == null){
		 start = null;
		 return; 
	 }
	 Node p = start;
	 
	 while (p.link.link != null){
		 p = p.link;
		 
	 }
	 p.link = null;
 }

 //delete node which contains value x. 
 
 public void deleteNodeWithValue(int x){
	 //check if the list is empty. 
	 if (start == null){
		 return;
	 }
	 //if there is only one node. 
	 if(start.info == x ){
		 start = null;
	 }
	 
	 Node p = start;
	 while (p != null){
		 if(p.info == x){
			 p = p.link.link;
		 }
	 }
 }
}