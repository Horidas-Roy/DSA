

import java.util.EmptyStackException;

public class Stack1 {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
        }
    }

    public Stack1(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;

        return result;
    }

//created a peek method which hold the data of the top node
public int peek(){
    if(top == null){
        throw new EmptyStackException();
    }
    return top.data;
}


    public static void main(String[] args) {
          Stack1 stack = new Stack1();
          stack.push(5);
          stack.push(10);
          stack.push(15);

          System.out.println(stack.peek());
          stack.pop();
          System.out.println(stack.peek());
          stack.pop();
          System.out.println(stack.peek());

    }
}
