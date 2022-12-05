package dersNotCollections;

import java.util.LinkedList;
import java.util.List;

public class collectionsLinkedlist {

    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("K");
        ll1.add("L");

        // Linkedlist 3 tane intarfeci inplement etmiştir
        // List, Queue, Deque

        List<String> ll2= new LinkedList<>();

        ll2.add("F");
        ll2.add("Z");
        ll2.add(0,"A");
        ll2.addAll(1,ll1);
        ll2.set(2,"N");
        ll2.retainAll(ll1);

        System.out.println(ll2);

        ll2.add("O");
        System.out.println(ll2.hashCode());

        System.out.println(ll2.subList(1, 2));


    }
}
