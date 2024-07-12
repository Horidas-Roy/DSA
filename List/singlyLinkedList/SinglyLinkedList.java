package List.singlyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // display a listNode 1
    public void printListNode() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Find length of a singly Linked list
    public int findLegth() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count = count + 1;
            current = current.next;
        }
        return count;
    }

    // Insert Node at the begining of the singlyLikedList
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert Node at a given position in singlyLinkedList
    public void insert(int value, int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }

    }

    // Insert Node at the last of the singlyLinkedList
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(11);
        // ListNode third = new ListNode(12);
        // ListNode fourth = new ListNode(13);

        // //Now we will connect them together to form a chain
        // sll.head.next = second; //10 --> 11
        // second.next = third; //10 --> 11 --> 12
        // third.next =fourth; //10 --> 11 --> 12 --> 13
        // sll.printListNode();
        // System.out.println("Length: "+sll.findLegth());

        sll.insertFirst(6);
        sll.insertFirst(5);
        sll.insertLast(0);
        sll.printListNode();
        sll.insert(65, 4);
        sll.printListNode();
    }

}
