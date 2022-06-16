package com.inamul;

public class MyLinkedList extends LLFunctions{
    public static void main(String[] args) {
        insertFirst(56);
        insertLast(30);
        insertLast(70);
        printData();
        System.out.println("\n");
        searchNode(30);
        insertInBetween(30,40);
        printData();

    }
}
