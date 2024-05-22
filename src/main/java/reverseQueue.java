import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer>queue = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        reverseKthQueue(2,queue);
        System.out.println(queue);

    }

    public static void reverseKthQueue(int k, Queue<Integer>queue ){
        Stack<Integer> stack = new Stack<>();
          int index = k;
        while (k!=0){
            stack.push(queue.peek());
            queue.remove();
            k--;

        }
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();

        }
//       while ( queue.size()!=0){
//           stack.push(queue.peek());
//           queue.remove();
//       }
        for (int i = 0; i < queue.size() - index; i++) {
            queue.add(queue.peek());
            queue.remove();
        }

        // Push the first K elements into a Stack
//        for (int i = 0; i < k; i++) {
//            stack.push(queue.peek());
//            queue.remove();
//        }
//
//        // Enqueue the contents of stack
//        // at the back of the queue
//        while (!stack.empty()) {
//            queue.add(stack.peek());
//            stack.pop();
//        }
//
//        // Remove the remaining elements and enqueue
//        // them at the end of the Queue
//        for (int i = 0; i < queue.size() - k; i++) {
//            queue.add(queue.peek());
//            queue.remove();
//        }
    }


    }


