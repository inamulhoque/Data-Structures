package com.inamul;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList extends LLFunctions{
    public static void main(String[] args) {
        LinkedList<Integer> newLL = new LinkedList();
        newLL.add(56);
        newLL.add(30);
        newLL.add(40);
        newLL.add(70);
        System.out.println("Before sort:");
        for (Integer i:newLL) {
            System.out.println("Data-> "+i+" ");
        }
        Collections.sort(newLL);
        System.out.println("After sort:");
        for (Integer i:newLL) {
            System.out.println("Data-> "+i+" ");
        }
    }
}
