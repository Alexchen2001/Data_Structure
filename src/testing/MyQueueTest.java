package testing;

import utility.MyQueue;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueueTest {
    public static void intro(){
        System.out.println();
        System.out.println("T E S T   P R O G R A M");
        System.out.println();
    }

    public static void libraryVersionTest(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();

        System.out.println(queue);
    }

    public static void myVersionTest(){

        System.out.println();
        System.out.println("------------ M Y   Q U E U E --------------");
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();

        System.out.println(queue);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
    }
}
