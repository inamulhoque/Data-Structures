package com.inamul;
import java.util.LinkedList;
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> myLL = new LinkedList();
        myLL.add(56);
        myLL.add(30);
        myLL.add(70);
        boolean result = myLL.isEmpty();
        if (result){
            System.out.println("List is Empty.");
        } else {
            System.out.println("LinkedList elements are: ");
            for (Integer s : myLL) {
                System.out.print(s+" -> ");
            }
        }
    }
}
