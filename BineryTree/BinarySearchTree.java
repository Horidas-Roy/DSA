package BineryTree;
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

//How to search in a Binary Tree
public TreeNode search(TreeNode root,int key){
    if (root == null || root.data == key) {
        return root;
    }
    if(key < root.data){
        return search(root.left, key);
    }else{
        return search(root.right, key);
    }
}

//Validate Binary Tree
public boolean isValid(){
    return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
}
public boolean isValid(TreeNode root,long min, long max){
      if (root == null) {
        return true;
      }
      if(min >= root.data || max <= root.data){
          return false;
      }
      boolean left = isValid(root.left, min, root.data);
      if(left){
        boolean right = isValid(root.right, root.data, max);
        return right;
      }
      return false;
}


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertRecursive(5);
        bst.insertRecursive(3);
        bst.insertRecursive(7);
        bst.insertRecursive(1);
        bst.inOrder();
        TreeNode searchKey = bst.search(bst.root, 5);
        System.out.println("\nSearching Result: "+searchKey.data);
        System.out.println("isValid: "+bst.isValid());
    }
}
