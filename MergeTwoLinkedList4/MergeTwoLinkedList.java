package MergeTwoLinkedList4;

public class MergeTwoLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

//Display Linked List
public void display(ListNode head){
    if(head == null){
        return;
    }
    ListNode current = head;
    while (current != null) {
        System.out.print(current.data+"-->");
        current = current.next;
    }
    System.out.println("null");
}

//created two singlyLinkedList
public ListNode a(){
     ListNode first = new ListNode(1);
     ListNode second = new ListNode(3);
     ListNode third = new ListNode(5);

     head = first;
     first.next = second;
     second.next = third;
     third.next = null;

     return head;
}

public ListNode b(){
    ListNode first = new ListNode(2);
    ListNode second = new ListNode(4);
    ListNode third = new ListNode(6);

    head = first;
    first.next = second;
    second.next = third;
    third.next = null;

    return head;
}

//how to merge two singlyList Node
public ListNode mergeTwoList(ListNode a, ListNode b){
       ListNode dummy = new ListNode(0);
       ListNode tail = dummy;
       while (a != null && b != null) {
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
       }
       if (a == null) {
           tail.next = b;
       }else{
          tail.next = a;
       }
       return dummy.next;
}


    public static void main(String[] args) {
        MergeTwoLinkedList sll = new MergeTwoLinkedList();
        ListNode a = sll.a();
        ListNode b = sll.b();

        sll.display(a);
        sll.display(b);
        ListNode resultHead = sll.mergeTwoList(a, b);
        sll.display(resultHead);
    }
}
