package testing;

import utility.LinkedList;
import utility.List;



public class LinkedListTest {
    public static void intro(){
        System.out.println();
        System.out.println("T E S T   P R O G R A M");
        System.out.println();
    }

    public static void libraryVersionTest(){

        System.out.println("");
        java.util.List<String> list = new java.util.LinkedList<String>();
        System.out.println("----------------adding to the list--------------------");
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);

        System.out.println(" -------------- testing set----------------");
        list.set(3, "Will");
        System.out.println(list);


        System.out.println("------------ testing get, contains, indexOf---------------------");
        System.out.println("Item at Index 3: " + list.get(3));
        System.out.println();
        System.out.println("Is Ben in the list? " + list.contains("Ben"));
        if(list.contains("Ben")){
            System.out.println("What is the Index: " + list.indexOf("Ben"));
        }
        System.out.println();
        System.out.println("----------------Testing for remove index-----------------");
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

        System.out.println("--------------test for remove item-----------------");
        list.add("Tom");
        list.add("Tim");
        list.add("John");
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Middle? " + list.remove("Tom"));
        System.out.println(list);
        System.out.println();
        System.out.println("---------adding an item to an index--------------");
        System.out.println(list);
        System.out.println();

        System.out.println("----------Add to Front --------");
        list.add(0, "Angus");
        System.out.println(list);
        System.out.println();

        System.out.println("--------Add to Back----------- ");
        list.add(list.size(), "Zeus");
        System.out.println(list);
        System.out.println();

        System.out.println("--------Add to Middle----------- ");
        list.add(list.size()/2, "Douglas");
        System.out.println(list);
        list.add(3,"Ken");
        System.out.println();

        System.out.println("---------------testing for size------------------");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        list.remove("John");
        System.out.println(list.size());
        System.out.println(list);
    }


    public static void myVersionTest(){

        List<String> list = new LinkedList<String>();
        System.out.println("----------------adding to the list--------------------");
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);

        System.out.println(" -------------- testing set----------------");
        list.set(3, "Will");
        System.out.println(list);


        System.out.println("------------ testing get, contains, indexOf---------------------");
        System.out.println("Item at Index 3: " + list.get(3));
        System.out.println();
        System.out.println("Is Ben in the list? " + list.contains("Ben"));
        if(list.contains("Ben")){
            System.out.println("What is the Index: " + list.indexOf("Ben"));
        }
        System.out.println();
        System.out.println("----------------Testing for remove index-----------------");
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

        System.out.println("--------------test for remove item-----------------");
        list.add("Tom");
        list.add("Tim");
        list.add("John");
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Middle? " + list.remove("Tom"));
        System.out.println(list);
        System.out.println();
        System.out.println("---------adding an item to an index--------------");
        System.out.println(list);
        System.out.println();

        System.out.println("----------Add to Front --------");
        list.add(0, "Angus");
        System.out.println(list);
        System.out.println();

        System.out.println("--------Add to Back----------- ");
        list.add(list.size(), "Zeus");
        System.out.println(list);
        System.out.println();

        System.out.println("--------Add to Middle----------- ");
        list.add(list.size()/2, "Douglas");
        System.out.println(list);
        list.add(3,"Ken");
        System.out.println();

        System.out.println("---------------testing for size------------------");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        list.remove("John");
        System.out.println(list.size());
        System.out.println(list);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        System.out.println();
        myVersionTest();

    }
}
