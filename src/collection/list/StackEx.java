package collection.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        System.out.println(stack);

        String lastElement = stack.pop();

        System.out.println(stack);

        System.out.println(lastElement);
    }
}
