package dersNotIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {

        List<Integer> sayılar= new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

//        iterator kullanarak bu sayılardan 15 ile 35 arasında olanları silin

        Iterator it1=sayılar.iterator();
        Integer element;

        while (it1.hasNext()){
            element=(Integer) it1.next();

            if (element>15 && element<35){
                it1.remove();

            }
        }

        System.out.println(sayılar);
    }
}
