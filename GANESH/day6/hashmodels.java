package day6;

import java.util.ArrayList;
import java.util.Iterator;


public class hashmodels {
    public static void main(String [] args){
        ArrayList list = new ArrayList<>();
        list.add("ganesh");
        list.add(4006);
        list.add("cse");
        list.add("A");
        list.remove(3);
        list.set(2,"computer");

        System.out.println(list);
        System.out.println(list.isEmpty());

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
