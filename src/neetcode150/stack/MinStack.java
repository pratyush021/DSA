package neetcode150.stack;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {

   class Node {
       int val;
       int min;
       Node next;

       private Node(int val, int min, Node next) {
           this.val = val;
           this.min = min;
           this.next = next;
       }
   }
    private Node head;
    public MinStack() {

    }

    public void push(int val) {
        if(head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Test case 1: Push elements and get minimum
        minStack.push(3);
        minStack.push(5);
        System.out.println("Expected: 3, Result: " + minStack.getMin()); // Expected output: 3
        minStack.push(2);
        minStack.push(1);
        System.out.println("Expected: 1, Result: " +minStack.getMin()); // Expected output: 1
        minStack.pop();
        System.out.println("Expected: 2, Result: " +minStack.getMin()); // Expected output: 2
        minStack.pop();
        System.out.println("Expected: 5, Result: " +minStack.top());    // Expected output: 5
        System.out.println(minStack.getMin()); // Expected output: 3

        // Test case 2: Push and pop elements
        minStack.push(4);
        minStack.push(6);
        minStack.pop();
        System.out.println("Expected: 4, Result: " +minStack.top());    // Expected output: 4
        System.out.println("Expected: 3, Result: " +minStack.getMin()); // Expected output: 3

        // Test case 3: Edge case with single element
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println("Expected: 3, Result: " +minStack.getMin()); // Expected output: 3
    }
}

