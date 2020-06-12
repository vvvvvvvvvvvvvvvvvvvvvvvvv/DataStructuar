package Stack;

import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

       // System.out.println(queue.peek());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.offer(2);
        deque.add(3);
       // System.out.println(deque.getFirst());
       // System.out.println(deque.getLast());

        Stack stacks = new Stack();
        stacks.add("test");
        stacks.add(1);
        System.out.println(stacks.peek());
    }
}
