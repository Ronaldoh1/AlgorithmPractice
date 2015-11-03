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
		}
		
		System.out.println("Number of nodes is " + n);
}
}