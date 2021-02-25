package sjjb.binarysorttree;

public class BinarySortTreeDemo {

	public static void main(String[] args) {
		//7,3,10,12,5,1,9
		BinarySortTree t = new BinarySortTree();
		t.add(new Node(7));
		t.add(new Node(3));
		t.add(new Node(10));
		t.add(new Node(12));
		t.add(new Node(5));
		t.add(new Node(1));
		t.add(new Node(9));
		t.infixOrder();
	}
	
}
	
	class BinarySortTree{
		private Node root;
		
		public BinarySortTree() {
			super();
		}

		public void add(Node node) {
			if(node == null) {
				return;
			}
			if(root == null) {
				root = node;
			}else {
				root.add(node);	
			}
		}
		
		public void infixOrder() {
			if(root == null) {
				return;
			}
			root.infixOrder();
		}
	}
	
	class Node{
		int value;
		Node left;
		Node right;
		public Node(int value) {
			super();
			this.value = value;
		}
		
		//添加结点的方法
		public  void add(Node node) {
			if(node.value < this.value ) {
				if(this.left == null) {
					this.left = node;
				}else {
					this.left.add(node);
				}
			}else {
				if(this.right == null) {
					this.right = node;
				}else {
					this.right.add(node);
				}
			}
		}
		
		public void infixOrder() {
			if(this.left != null) {
				this.left.infixOrder();
			}
			System.out.println(value);
			if(this.right != null) {
				this.right.infixOrder();
			}
		}
	}

