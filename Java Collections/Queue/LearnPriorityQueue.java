package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> priq = new PriorityQueue<>(Comparator.reverseOrder());

        priq.offer(100);
        priq.offer(20);
        priq.offer(300);
        priq.offer(40);
        priq.offer(500);

        System.out.println(priq);

        System.out.println(priq.peek());

        priq.poll();

        System.out.println(priq);

    }
}
