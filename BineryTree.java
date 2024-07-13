

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

public static void main(String[] args) {
      BineryTree bT = new BineryTree();
      bT.createBinaryTree();
      bT.preOrder(bT.root);
}


}
