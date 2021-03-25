package testing;

import java.util.Stack;
import utility.MyStack;

public class MyStackTest {
    public static void intro() {
        System.out.println();
        System.out.println("T E S T   P R O G R A M");
        System.out.println();
    }

    public static boolean isSorted(MyStack<Integer> list) {
        int size = list.size();
        if (size == 0 || size == 1) {
            return true;
        }
        int temp1 = list.pop();
        int temp2 = list. pop();
        while(!list.isEmpty()){
            if(temp1 > temp2){
                return false;
            }
            temp1 = temp2;
            temp2 = list.pop();
        }
        return true;
    }

    public static void libraryVersionTest() {
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

    public static void myVersionTest() {
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

    public static void myIsSortedTest(){
        // With sorted test Expected: true
        MyStack<Integer> list = new MyStack<Integer>();
        list.push(17);
        list.push(11);
        list.push(8);
        list.push(8);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(2);
        list.push(1);
        System.out.print("Is the stack sorted: ");
        System.out.println(isSorted(list));

        // having 0 element. Expected : true
        System.out.print("Is the stack sorted: ");
        System.out.println(isSorted(list));

        // Not sorted Expected: false
        list.push(17);
        list.push(11);
        list.push(8);
        list.push(15);
        list.push(6);
        list.push(5);
        list.push(8);
        list.push(2);
        list.push(1);
        System.out.print("Is the stack sorted: ");
        System.out.println(isSorted(list));

    }
    public static void mmySwitchParis(){
        MyStack<Integer> list = new MyStack<Integer>();
        list.push(13);
        list.push(9);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(2);
        list.push(1);
        System.out.println("Before switch:");
        System.out.println(list);
        switchPairs(list);
        System.out.println("After switch:");
        System.out.println(list);
    }
    public static MyStack<Integer> switchPairs(MyStack<Integer> list){
        MyStack<Integer> holds = new MyStack<Integer>();
        int tempVal1;
        int tempVal2;
        while(!list.isEmpty()){
            tempVal1 = list.pop();
            if(list.isEmpty()){
                holds.push(tempVal1);
            } else{
                tempVal2 = list.pop();
                holds.push(tempVal2);
                holds.push(tempVal1);
            }
        }
        for (int i = holds.size(); i > 0 ; i--) {
            list.push(holds.pop());
        }
        return list;
    }


    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        System.out.println();
        myVersionTest();
        myIsSortedTest();
        mmySwitchParis();



    }
}
