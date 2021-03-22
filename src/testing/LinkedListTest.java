package testing;

import utility.LinkedList;
import utility.List;


public class LinkedListTest<E> {

    //problem with set, adding to end of arraylist.
    //also remove, removes the string found in the array, but returns false.
    public static void myVersionTest(){

        //LinkedList<String> list = new LinkedList<String>();
        List<String> list = new LinkedList<String>();
        //System.out.println(list);
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);
        list.set(3, "Will");
        System.out.println(list);
        System.out.println("Item at Index 3: " + list.get(3));
        System.out.println();
        System.out.println("Is Ben in the list? " + list.contains("Ben"));
        if(list.contains("Ben")){
            System.out.println("What is the Index: " + list.indexOf("Ben"));
        }
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Will? " + list.remove(3));
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Front? " + list.remove(0));
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Back? " + list.remove(2));
        System.out.println();
        System.out.println(list);

        list.add("Tom");
        list.add("Tim");
        list.add("John");
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Middle? " + list.remove("Tom"));
        System.out.println(list);
        System.out.println();
        System.out.println(list);
        System.out.println("Add to Front ");
        list.add(0, "Angus");
        System.out.println();
        System.out.println(list);
        System.out.println("Add to Back ");
        list.add(list.size(), "Zeus");
        System.out.println();
        System.out.println(list);
        System.out.println("Add to Middle ");
        list.add(list.size()/2, "Douglas");
        System.out.println();
        System.out.println(list);
//        List.add(3,"Ken");
//        System.out.println(List.size());
//        System.out.println(List);
//        List.remove(1);
//        System.out.println(List.size());
//        System.out.println(List);
//        List.remove("John");
//        System.out.println(List.size());
//        System.out.println(List);
    }

    public static void main(String[] args) {
        System.out.println("testing linkedlist");
        myVersionTest();

    }
}
