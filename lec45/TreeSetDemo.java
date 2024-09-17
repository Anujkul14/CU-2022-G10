package lec45;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<>(Comparator.reverseOrder());

        set.add(40);
        set.add(10);
        set.add(50);
        set.add(10);

        System.out.println(set);

//        set.remove(20);
//        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(45));
        System.out.println(set.tailSet(35));
    }
}
