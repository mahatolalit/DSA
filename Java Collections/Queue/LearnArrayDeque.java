package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ardeq = new ArrayDeque<>();

        ardeq.offer(70);
        ardeq.offer(10);
        ardeq.offerFirst(30);
        ardeq.offer(20);
        ardeq.offerLast(65);

        System.out.println(ardeq);

        System.out.println(ardeq.peek());
        System.out.println(ardeq.peekFirst());
        System.out.println(ardeq.peekLast());

        System.out.println(ardeq.poll());
        System.out.println("Poll "+ardeq);

        System.out.println(ardeq.pollFirst());
        System.out.println("PollFirst " + ardeq);

        System.out.println(ardeq.pollLast());
        System.out.println("PollLast "+ardeq);

    }
}
