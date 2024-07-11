package singlyLinkedList3;

public class SinglyLinked3 {
    //creating  a singlyLinkedList Node
      private ListNode head;
      private static class ListNode {
             private int data;
             private ListNode next;

             public ListNode(int data){
                this.data = data;
                this.next = null;
             }
      }

//display
public void display(ListNode head){
    ListNode current = head;
    while (current != null) {
        System.out.print(current.data+"-->");
        current = current.next;
    }
    System.out.println("Null");
}

//How to reverse a singlyLinkedList
public ListNode reverse(ListNode head){
     if(head == null){
        return head;
     }
     ListNode current = head ;
     ListNode previous = null ;
     ListNode next = null ;
     while (current != null) {
        next = current.next;
        current.next = previous;
        previous = current;
        current = next ;
     }
     return previous;
}

//How to find Middle Node from a singlyList Node
public ListNode getMiddleNode(ListNode head){
       if (head == null) {
          return null;
       }
       ListNode slowPtr = head;
       ListNode fastPtr = head;
       while(fastPtr != null && fastPtr.next != null){
               slowPtr = slowPtr.next;
               fastPtr =fastPtr.next.next;
       }
       return slowPtr;
}
//How to find nth node from the end of a singlyListNode
public ListNode getNthNodeFromEnd(ListNode head,int n){
     if (n<0) {
        throw new IllegalArgumentException("n -->"+n);
     }
     if (head == null) {
        return null;
     }
     ListNode mainPtr = head;
     ListNode refPtr = head;
     int count = 0;
     while (count<n) {
        refPtr = refPtr.next;
        count++;
     }
     while (refPtr != null) {
        refPtr = refPtr.next;
        mainPtr = mainPtr.next;
     }
     return mainPtr;
}

//How to remove data from the sorted linkedList
public void removeDuplicates(ListNode head){
      if(head == null){
        return;
      }
      ListNode current = head;
      while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                   current.next =current.next.next;
            }else{
                current = current.next;
            }
      }
}

//How to insert a node in sorted likedList
public ListNode insertNodeInShortedList(int value){
    ListNode newNode = new ListNode(value);
     if (head == null || head.data>newNode.data) {
        newNode.next = head;
        head = newNode;
        return head;
     }
     ListNode current = head;
     ListNode temp = null;
     while (current != null && current.data < newNode.data) {
           temp = current;
           current = current.next;
     }
     newNode.next = current;
     temp.next = newNode ;

     return head;
}


public static void main(String[] args) {
    //  SinglyLinked3 sll = new SinglyLinked3();
     ListNode head = new ListNode(7);
     ListNode second = new ListNode(12);
     ListNode third = new ListNode(3);
     ListNode fourth = new ListNode(3);
     ListNode fifth = new ListNode(34);

     head.next = second ; //7-->12-->NULL
     second.next = third ; //7-->12-->3-->NULL
     third.next = fourth; //7-->12-->3-->3 -->null
     fourth.next = fifth; //7-->12-->3-->3 -->34-->null

     SinglyLinked3 sll = new SinglyLinked3();
     sll.display(head);

    //  ListNode reversListHead = sll.reverse(head);
    //  sll.display(reversListHead); //34-->3-->3-->12-->7-->null
    //  ListNode middle = sll.getMiddleNode(reversListHead);
    //  System.out.println(middle.data);

    // ListNode nthNode = sll.getNthNodeFromEnd(head, 3);
    // System.out.println(nthNode.data);

    // sll.removeDuplicates(head);
    // sll.display(head);

    //for sorted linked list
      head = new ListNode(7);
      second = new ListNode(12);
      third = new ListNode(14);
      fourth = new ListNode(17);
      fifth = new ListNode(34);

     head.next = second ; 
     second.next = third ; 
     third.next = fourth; 
     fourth.next = fifth; //7-->12-->14-->17 -->34-->null

     sll.display(head);
     sll.insertNodeInShortedList(20);
     sll.display(head);

}


}
