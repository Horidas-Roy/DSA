package singlyLinkedList3;

public class SinglyLinkedList4 {
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
        if(head == null){
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //How to insert a node in sorted likedList
public ListNode insertNodeInShortedList(ListNode head,int value){
    ListNode newNode = new ListNode(value);
     if (head == null ) {
        return newNode;
     }
     ListNode current = head;
     ListNode temp = null;
     while (current != null && current.data < newNode.data) {
           temp = current;
           current = current.next;
     }
        
        newNode.next = current;
        temp.next = newNode;
     

     return head;
}



    public static void main(String[] args) {

        ListNode head = new ListNode(7);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(17);
        ListNode fourth = new ListNode(25);
        ListNode fifth = new ListNode(28);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        SinglyLinkedList4 sll = new SinglyLinkedList4();
        sll.display(head);
        sll.insertNodeInShortedList(head,20);
        sll.display(head);
    }
}
