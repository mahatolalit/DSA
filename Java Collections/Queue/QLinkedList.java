package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(20);
        queue.offer(40);
        queue.offer(60);
        queue.offer(80);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());


    }
}
