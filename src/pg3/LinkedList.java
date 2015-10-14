package pg3;

public class LinkedList {
	private Node head;
	
	public void insertAtHead(int data){
		Node newNode = new Node(data);
		//make the new node point to the head. 
		newNode.setNextNode(this.head);
		this.head = newNode;
		
	}
	public int length(){
		 int length = 0;
		 Node current = this.head;
		 while (current != null){
			 
			 length ++;
			 current.getNextNode();
		 }
		
	 return length;
	}
	@Override 
	public String toString(){
		
		String result = "{";
		Node current = this.head;
		while(current != null){
			result += current.toString() + ",";
			current.getNextNode();
		}
	
	
	result += "}";

	return result;
	}
}
