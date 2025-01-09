package datastructures;

/**
* Implements a Stack data structure from scratch.
*
* <p>This stack supports the following operations with O(1) time complexity:
* <ul>
*   <li>push(T t) - Adds an element to the top of the stack.</li>
*   <li>pop() - Removes and returns the top element of the stack.</li>
*   <li>top() - Returns the top element of the stack without removing it.</li>
*   <li>size() - Returns the current size of the stack.</li>
*   <li>isEmpty() - Checks if the stack is empty.</li>
*   <li>clear() - Clears all elements from the stack.</li>
*   <li>contains(T t) - Checks if a specific element is in the stack.</li>
*   <li>print() - Prints all elements in the stack.</li>
* </ul>
*
* <p>The stack can store elements of type Integer, String, or Character.
*/
public class Stack<T> {
    class Node {
        T val;
        Node next;
        private Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }
    }gi
    private Node head;
    /**
     * Pushes an element onto the stack.
     *
     * @param val the element to be pushed onto the stack
     */
    public void push(T val) {
        if(head == null) {
            head = new Node(val, null);
        } else {
            head = new Node(val, head);
        }
    }
    /**
     * Removes the top element of the stack
     * @return the top element from the stack
     * @throws NullPointerException if the stack is empty
     */
    public T pop() {
        if(head == null) throw new NullPointerException("Stack is empty.");
        T t = head.val;
        head = head.next;
        return t;
    }

    /** Returns the top element from the stack
     *
     * @return the top element of the stack
     */
    public T top() {
        return head.val;
    }

}
