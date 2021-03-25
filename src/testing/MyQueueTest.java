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

    public static MyQueue<Integer> rearrange(MyQueue<Integer> list){
        MyQueue <Integer> evenList = new MyQueue<Integer>();
        MyQueue <Integer> oddList = new MyQueue<Integer>();

        while(!list.isEmpty()){
            int temp = list.remove();
            if (temp % 2 == 0){
                evenList.addAfter(temp);
            }else{
                oddList.addAfter(temp);
            }
        }
        while(!evenList.isEmpty()){
            list.addAfter(evenList.remove());
        }
        while(!oddList.isEmpty()){
            list.addAfter(oddList.remove());
        }
        return list;
    }

    public static void libraryVersionTest(){
        System.out.println("------------ Library Queue --------------");
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
        System.out.println("------------My Queue --------------");
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

    public static void myRearrangeTest(){
        System.out.println();
        System.out.println("-----------------------------------------");
        MyQueue<Integer> list = new MyQueue<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(17);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(12);
        list.add(9);
        list.add(16);
        System.out.println("Before Rearranging");
        System.out.print(list);
        System.out.println();
        rearrange(list);
        System.out.println();
        System.out.println("After Rearranging");
        System.out.print(list);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
        myRearrangeTest();



    }
}
