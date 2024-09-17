package lec44;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        //min heap -> by default
        //max heap -> pass comparator in the constructor {Comparator.reverse()}
        pq.offer(20);
        pq.offer(10);
        pq.offer(40);

        System.out.println(pq.peek());

        pq.remove();
        System.out.println(pq.peek());
    }
}
