package com.inamul;

import java.util.LinkedList;

public class MyLinkedList extends LLFunctions{
    public static void main(String[] args) {
        insertFirst(56);
        insertLast(30);
        insertLast(70);
        printData();
        searchNode(30);
        insertInBetween(30,40);
        printData();
        System.out.println("\n");
        deleteAnyNode(40);
        printData();
        LinkedList<Integer> newLL = new LinkedList();
        newLL.add(56);
        newLL.add(30);
        newLL.add(70);
        System.out.println("\nSize:"+newLL.size());
    }
}
