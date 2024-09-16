package lec44;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("G10");
        hashSet.add("G9");
        hashSet.add("G11");

        System.out.println(hashSet);

        //repetions not allowed
        hashSet.add("G10");
        //set size -> 3
        System.out.println(hashSet);

        HashSet <String> hashSet2 = new HashSet<>();
        hashSet2.add("G8");
        hashSet2.add("G7");
        hashSet2.add("G10");

        //union
        HashSet <String> unionSet = new HashSet<>(hashSet);
        unionSet.addAll(hashSet2);

        System.out.println(unionSet);

        //IntersectionSet
        //G9 G10 G11
        HashSet <String> intersectionSet = new HashSet<>(hashSet);
        intersectionSet.retainAll(hashSet2);

        System.out.println(intersectionSet);

        //DifferenceSet
        HashSet <String> differenceSet = new HashSet<>(hashSet);
        differenceSet.removeAll(hashSet2);

        System.out.println(differenceSet);


    }
}
