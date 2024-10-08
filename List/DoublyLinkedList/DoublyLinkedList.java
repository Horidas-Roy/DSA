package List.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
     private ListNode head;
     private ListNode tail;
     private int length;
     
     private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
     }

     public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
     }

     public boolean isEmpty(){
        return length == 0; ///head == null
     }

     public int length(){
        return length;
     }

//print element of DoublyLinkedList in forward direction
public void displayForward(){
     if(head == null){
      return;
     }
     ListNode temp = head;
     while (temp != null) {
         System.out.print(temp.data+"-->");
         temp = temp.next;
     }
     System.out.println("null");
}

//print element of DoublyLinkedList in backward direction
public void displayBacward(){
   if(head == null){
      return;
   }
   ListNode temp = tail;
   while (temp != null) {
      System.out.print(temp.data+"-->");
      temp = temp.previous;
   }
   System.out.println("null");
}

//How to insertLast at the doublyLinked List
public void insertLast(int value){
   
   ListNode newNode = new ListNode(value);

   if (isEmpty()) {
      head = newNode;
      tail = newNode;
   }else{
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
   }
   length++;
}

//How to insertFast of a doublyLinkedList
public void insertFast(int value){
    ListNode newNode = new ListNode(value);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    }else{
      head.previous = newNode;
      newNode.next = head;
      head = newNode;
    }
    length++;
}

//How to deleteFirst of a doublyLinkedList
public ListNode deleteFirst(){
   if(isEmpty()){
      throw new NoSuchElementException();
   }

   ListNode temp = head;
   if(tail == head){
      tail = null;
      head = null;
   }else{
      head = head.next;
      head.previous = null;
   }
   temp.next = null;
   length--;
   return temp;
}

//How to deleteLastNode of a doublyLinkedList
public ListNode deleteLast(){
   if (isEmpty()) {
      throw new NoSuchElementException();
   }
   ListNode temp = tail;
   if(head == tail){
      head = null;
      tail = null;
   }else{
      tail = tail.previous;
      tail.next = null;
   }
   temp.previous = null;
   length--;
   return temp;
}


     public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();
            
            dll.insertLast(1);
            dll.insertLast(2);
            dll.insertFast(3);
            dll.insertFast(4);

            dll.displayForward();
            // dll.displayBacward();

            // dll.deleteFirst();
            // dll.displayForward();

            dll.deleteLast();
            dll.deleteLast();
            dll.deleteLast();
            dll.deleteLast();
            dll.displayForward();
            
     }
}
