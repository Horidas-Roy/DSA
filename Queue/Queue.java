package Queue;
import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
              this.data = data;
              this.next = null;
        }
        
    }
    public Queue(){
         this.front = null;
         this.rear = null;
         this.length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    //print a queue
    public void print(){
        if (isEmpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    //ENQUEUE data
    public void enQueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
            // rear = temp;
        }else{
            rear.next = temp;
            // rear = temp;
        }
        rear = temp;
        length++;
    }

//DEQUEUE 
public int deQueue(){
    if (isEmpty()) {
        throw new NoSuchElementException("Queue is already Empty!!");
    }
    int result = front.data;
    front = front.next;
    if(front == null){
        rear = null;
    }
    length--;
    return result;
}

//return fisrt value of a queue
public int first(){
    if (isEmpty()) {
        throw new NoSuchElementException("Queue is Empty!");
    }
    return front.data;
}

//return last value of a queue
public int last(){
    if (isEmpty()) {
        throw new NoSuchElementException("Queue is Empty!");
    }
    return rear.data;
}

    public static void main(String[] args) {
          Queue queue = new Queue();

          queue.enQueue(1);
          queue.enQueue(5);
          queue.enQueue(10);
          queue.enQueue(15);
          queue.print();
        //   queue.deQueue();
        //   queue.deQueue();
        //   queue.deQueue();
        //   queue.deQueue();
        //   queue.print();
          System.out.println("first: "+queue.first());
          System.out.println("last: "+queue.last());
    }
}
