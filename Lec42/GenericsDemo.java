package Lec42;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        Object[] arr = new Object[5];

        arr[0] = 10;
        arr[1] = new StringBuilder("hello");
        arr[2] = 'A';

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        ((StringBuilder)arr[1]).append(" G10");
        System.out.println(arr[1]);

        //type safety
        if(arr[0] instanceof StringBuilder)
            ((StringBuilder)arr[0]).append("Chitkara");

        ArrayList <Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

    }

}
