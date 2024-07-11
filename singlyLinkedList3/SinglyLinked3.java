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

//display
public void display(ListNode head){
    ListNode current = head;
    while (current != null) {
        System.out.print(current.data+"-->");
        current = current.next;
    }
    System.out.println("Null");
}

public static void main(String[] args) {
    //  SinglyLinked3 sll = new SinglyLinked3();
     ListNode head = new ListNode(7);
     ListNode second = new ListNode(12);
     ListNode third = new ListNode(9);
     ListNode fourth = new ListNode(3);

     head.next = second ; //7-->12-->NULL
     second.next = third ; //7-->12-->9-->NULL
     third.next = fourth; //7-->12-->9-->3 -->null
     fourth.next = null; //7-->12-->9-->3 -->null

     SinglyLinked3 sll = new SinglyLinked3();
     sll.display(head);
     ListNode reversListHead = sll.reverse(head);
     sll.display(reversListHead);

}


}
