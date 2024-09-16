package lec44;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque <Integer> arr = new ArrayDeque<>();

        arr.offer(20);
        arr.offer(40);
        arr.offer(10);
        //20 40 10
        System.out.println(arr.peek());

        //Deque Interface methods -> addFirst,addLast
        arr.addFirst(50);
        //50 20 40 10
        System.out.println(arr.peek());
        arr.removeLast();
        //10 remove arr

    }
}
