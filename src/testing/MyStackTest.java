package testing;

import java.util.Stack;
import utility.MyStack;

public class MyStackTest {
    public static void intro(){
        System.out.println();
        System.out.println("T E S T   P R O G R A M");
        System.out.println();
    }
//    public static boolean IsSorted(Stack<Integer> s){
//        int temp1 = s.pop();
//        int temp2 = s.pop();
//        for (int i = 0; i < s.size()+2; i++) {
//            System.out.println(" compare temp1: " + temp1 +"> temp2:" + temp2);
//            if (temp1 > temp2){
//                return false;
//            }
//            temp1 = temp2;
//            temp2 = s.pop();
//        }
//        return true;
//    }

    public static void libraryVersionTest(){
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println("------------ M Y   S T A C K --------------");
        MyStack<String> stack = new MyStack<String>();
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<String>();
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peak());
//        System.out.println(stack.size());


    }
}
