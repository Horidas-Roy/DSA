public class SinglyLinkedList2 {
    
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    //print of a singlyListNode
    public void display(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Delete first Node of a singlyListNode
    public ListNode deleteFirst(){
        if (head == null) {
            return head;
        }
        ListNode firstNode = head;
        head = firstNode.next;
        firstNode.next = null;
        return firstNode;
    }

    //Delete last
    public ListNode deleteLast(){
           if (head == null || head.next == null) {
              return head;
           }
           ListNode current = head;
           ListNode previous = null;
           while (current.next != null) {
                previous = current;
                current = current.next;
           }
           previous.next = null;

           return current;
    }

    //delete a note at a given position
    public void delete(int position){
        if (position == 1) {
            head = head.next;
            return;
        }
        
        ListNode previous = head;
        int count = 1;
        while(count<position-1){
               previous = previous.next;
               count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
    }

    //How to search an element in a Linked List in Java
    public boolean search(int searchKey){
           ListNode current = head;
           while(current != null){
                if (current.data == searchKey) {
                    return true;
                }
                current = current.next;
           }
           return false;
    }




    public static void main(String[] args) {
        SinglyLinkedList2 sll = new SinglyLinkedList2();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next = second;
        second.next = third ;
        third.next = fourth ;
        fourth.next = null ;
        sll.display();
        // sll.deleteFirst();
        // sll.deleteLast();
        // sll.delete(3);
       System.out.println( sll.search(1));
        sll.display();
    }
}
