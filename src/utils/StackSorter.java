package utils;

import java.util.Stack;

public class StackSorter {

    public static void sortAscending(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            while (!aux.isEmpty() && aux.peek() > tmp) {
                stack.push(aux.pop());
            }
            aux.push(tmp);
        }
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }   
    }

    public static boolean isSortedAscTopMin(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();
        boolean sorted = true;
        Integer prev = null; 
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (prev != null && cur < prev) { 
                sorted = false;
            }
            aux.push(cur);
            prev = cur;
        }
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
        return sorted;
    }
}