package testing;

import utility.ArrayList;
import utility.List;
//import utility.List;

public class ArraListTest {
    public static void intro(){
        System.out.println();
        System.out.println("TEST PROGRAM ");
        System.out.println();
    }

    public static void libraryVersionTest(){
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);
        list.set(3, "Will");
        System.out.println(list);


    }
//    public static void MyVerstionTest(){
//        List<String> list = new ArrayList<E>();
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            String item = itr.next();
//            if(item.equals("John")){
//                itr.remove();
//            }
//            System.out.println(itr.next(item));
//        }
//        System.out.println(list);
//    }



}
