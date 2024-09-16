package lec44;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        //collection interface -> add,remove,size
        linkedList.add("Karanpreet");
        linkedList.add("Karan");
        linkedList.add("G10");

        System.out.println(linkedList.size());

        linkedList.remove("G10");

        Iterator <String> it = linkedList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
