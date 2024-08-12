

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}

class BinaryTree{

	//Building Binary Tree from Array
	int index = -1;
	TreeNode buildTree(int nodes[]){
		index++;
		if(nodes[index] == -1){
			return null;
		}	

		TreeNode newNode = new TreeNode(nodes[index]);

		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);
		return newNode;
	}

	public static void main(String [] args){
		TreeNode root = null;

		//Pre-Order Binary Tree Array
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree bt = new BinaryTree();
	}
}
