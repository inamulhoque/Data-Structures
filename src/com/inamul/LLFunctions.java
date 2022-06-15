package com.inamul;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LLFunctions {
    static Node firstNode;
    public static void insertFirst(int data){
        Node node = new Node(data);
        node.data = data;
        node.next = firstNode;
        firstNode = node;
    }

    public static void insertLast(int data){
        Node temp = firstNode;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(data);
        node.data = data;
        temp.next = node;
    }

    public static void insertBetween(int firstData, int lastData){
    }

    public static void printData(){
        Node temp = firstNode;
        while (temp!=null){
            System.out.print("Data -> "+temp.data+" ");
            temp = temp.next;
        }
    }

}
