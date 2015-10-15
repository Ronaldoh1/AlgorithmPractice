package pg7;

public class TreeNode {
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(Integer data)
	{
		this.data = data;
	}
	
	public TreeNode find(Integer data){
		if (this.data == data)
			return this;
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		
		if(rightChild != null){
			return rightChild.find(data);
			}
		return null;
	}
	
	//insert method.
	
	public void insert(Integer data){
		
		if (data >= this.data){
			if(this.rightChild == null){
				this.rightChild = new TreeNode(data);
			}else{
		      this.getRightChild().insert(data);	
			}
		}else{
			if(this.leftChild == null){
				this.leftChild = new TreeNode(data);
			}else{
				this.leftChild.insert(data);
			}
		}
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setFightChild(TreeNode fightChild) {
		this.rightChild = fightChild;
	}
	

}
