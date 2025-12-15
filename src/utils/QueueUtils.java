package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {
    public static boolean isPalindromeQueues(String string) {
        if (string == null) return false;

        Queue<Character> original = new LinkedList<>();
        for (char c : string.toCharArray()) {
            original.offer(c);
        }
        Queue<Character> work = new LinkedList<>(original); 
        Queue<Character> inverted = reverseQueueUsingAuxQueues(work);
    
        while (!original.isEmpty() && !inverted.isEmpty()) {
            if (!original.poll().equals(inverted.poll())) {
                return false;
            }
        }
        return original.isEmpty() && inverted.isEmpty();
    }

    private static Queue<Character> reverseQueueUsingAuxQueues(Queue<Character> queue) {
        Queue<Character> aux = new LinkedList<>();
        Queue<Character> inverted = new LinkedList<>();

        while (!queue.isEmpty()) {
            
            while (queue.size() > 1) {
                aux.offer(queue.poll());
            }

            Character last = queue.poll();
            inverted.offer(last);

            Queue<Character> tmp = queue;
                       queue = aux;
            aux = tmp;
        }
        return inverted;
    }
}
