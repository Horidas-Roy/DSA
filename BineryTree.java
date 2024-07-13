import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BineryTree {
     private Treenode root;
     private class Treenode {
         private int data; //can be generic Type
         private Treenode left;
         private Treenode right;

         public Treenode(int data){
                 this.data = data;
         }
     }
//creating a Binary Tree
public void createBinaryTree(){
           Treenode first = new Treenode(1);
           Treenode second = new Treenode(2);
           Treenode third = new Treenode(3);
           Treenode fourth = new Treenode(4);
           Treenode fifth = new Treenode(5);
           Treenode sixth = new Treenode(6);
           Treenode seventh = new Treenode(7);

           root = first; // root --> first
           first.left = second;
           first.right = third; // second <-- first --> third
           second.left = fourth;
           second.right = fifth;
           third.left = sixth;
           third.right = seventh;
   }

//Recursive preOrder traversal of a Binary Tree
public void preOrder(Treenode root){
     if (root == null) {
         return;
     }
     System.out.print(root.data+" ");
     preOrder(root.left);
     preOrder(root.right);
}

//Iterative preOrder traversal of a Binary Tree
public void itrePreOrder(){
    if( root == null){
        return;
    }
    Stack<Treenode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
        Treenode temp = stack.pop();
        System.out.print(temp.data+" ");
        if (temp.right != null) {
            stack.push(temp.right);
        }
        if(temp.left != null){
            stack.push(temp.left);
        }
    }
    System.out.println("");
}

//Recursive inOrder traversal of a Binary Tree
public void inOrderRecursive(Treenode root){
    if (root == null) {
        return;
    }
    inOrderRecursive(root.left);
    System.out.print(root.data+"");
    inOrderRecursive(root.right);
}
//Iterative inOrder traversal of a Binary Tree
public void inOrderIterative(){
     if (root == null) {
        return;
     }
     Stack<Treenode> stack = new Stack<>();
     Treenode temp = root;
     while (!stack.isEmpty() || temp != null) {
          if(temp != null){
                stack.push(temp);
                temp = temp.left;
          }else{
            temp = stack.pop();
            System.out.print(temp.data+" ");
            temp = temp.right;
          }
     }
}
//Recursive post Order traversal
public void postOrderRecursive(Treenode root){
     if(root == null){//Base case
        return;
     }
     postOrderRecursive(root.left);
     postOrderRecursive(root.right);
     System.out.print(root.data+" ");
}
//Iterative post Order traversal
public void postOrderIterative(){
     Treenode current = root;
     Stack<Treenode> stack = new Stack<>();
     while (current != null || !stack.isEmpty()) {
        if (current != null) {
            stack.push(current);
            current =current.left;
        }else{
            Treenode temp = stack.peek().right;
            if (temp == null) {
                temp = stack.pop();
                System.out.print(temp.data);
                while (!stack.isEmpty() && temp == stack.peek().right) {
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                }
            }else{
                current = temp;
            }
        }
     }
}

//Level order traversal of a binary tree
public void levelOrder(){
     if (root == null) {
        return;
     }
     Queue<Treenode> queue = new LinkedList<>();
     queue.offer(root);
     while (!queue.isEmpty()) {
        Treenode temp = queue.poll();
        System.out.print(temp.data+" ");
        if (temp.left != null) {
            queue.offer(temp.left);
        }
        if (temp.right != null) {
            queue.offer(temp.right);
        }
     }
}

public static void main(String[] args) {
      BineryTree bT = new BineryTree();
      bT.createBinaryTree();
    //   bT.itrePreOrder();
    //   bT.preOrder(bT.root);
    //   bT.inOrderRecursive(bT.root);
    //   bT.inOrderIterative();
    //   bT.postOrderRecursive(bT.root);
    //   bT.postOrderIterative();
      bT.levelOrder();
}


}
