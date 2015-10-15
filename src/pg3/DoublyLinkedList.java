package pg3;

public class DoublyLinkedList {
	DoublyLinkedNode head;
	
	public void insertAtHead(int data){
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		
		newNode.setNextNode(this.head);
		
		if(this.head != null){
			this.head.setPreviousNode(newNode);
			
		}
		this.head = newNode;
	}
	
	public int length(){
		
		if(head == null)
			return 0;
		int length = 0;
		DoublyLinkedNode current = this.head;
		
		while(current != null){
			length += 1;
			current = current.getNextNode();
			
		}
		
		return length;
	}

}
