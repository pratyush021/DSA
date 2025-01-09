import datastructures.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("test");
        stringStack.push("test2");
        stringStack.pop();
        System.out.println(stringStack.top());
    }
}