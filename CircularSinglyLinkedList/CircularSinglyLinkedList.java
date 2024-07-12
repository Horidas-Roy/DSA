package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
       private ListNode last;
       private int length;

       private class ListNode{
           private int data;
           private ListNode next;

           public ListNode(int data){
              this.data = data;
           }
       }
       public CircularSinglyLinkedList(){
             last = null;
             length = 0;
       }
       public int length(){
         return length;
       }
       public boolean isEmpty(){
          return length == 0;
       }

       public void createCircularLinkedList(){
            ListNode first = new ListNode(1);
            ListNode second = new ListNode(5);
            ListNode third = new ListNode(10);
            ListNode fourth = new ListNode(15);
            ListNode fifth = new ListNode(20);

            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = first;

            last = fifth;
            length = 5;
       }
//How to travers and print a CircularSinglyLinkedList
public void disPlay(){
    if(last == null){
        return;
    }
    ListNode first = last.next;
    // while(first != last){
    //     System.out.print(first.data+"-->");
    //     first = first.next;
    // }
    // System.out.println(first.data+"null");
    do{
        System.out.print(first.data+"-->");
        first = first.next;
    }while(first != last.next);
    System.out.println("null");
}

//How to insert node at the start of the Linked List
public void insertFast(int value){
    ListNode temp = new ListNode(value);
    if(last == null){
        last = temp;
    }else{
        temp.next = last.next;
    }
    last.next = temp;
    length++;
}


       public static void main(String[] args) {
           CircularSinglyLinkedList cSll = new CircularSinglyLinkedList();
           cSll.createCircularLinkedList();
           cSll.disPlay();
           cSll.insertFast(0);
           cSll.disPlay();
       }
}
