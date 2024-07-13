public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
             this.data = data;
        }
    }

//Recursive:How to insert value in a Binary Search Tree
public void insertRecursive(int value){
    root = insertRecursive(root,value);
}

public TreeNode insertRecursive(TreeNode root,int value){
    if (root == null) {
        root = new TreeNode(value);
        return root;
    }
    if (value < root.data) {
        root.left = insertRecursive(root.left, value);
    }else{
        root.right = insertRecursive(root.right, value);
    }
    return root;
}
//Display inorder
public void inOrder(){
    inOrder(root);
}

public void inOrder(TreeNode root){
    if (root == null) {
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
}


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertRecursive(5);
        bst.insertRecursive(3);
        bst.insertRecursive(7);
        bst.insertRecursive(1);
        bst.inOrder();
    }
}
