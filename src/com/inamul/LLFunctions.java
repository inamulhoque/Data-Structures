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
    public static void printData(){
        Node temp = firstNode;
        while (temp!=null){
            System.out.print("Data -> "+temp.data+" ");
            temp = temp.next;
        }
    }
    /*public static void addData(int data) {
        Node newNode = new Node(data);
        if(firstNode == null) {
            firstNode = newNode;
        }else {
            Node temp = firstNode;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }*/
}
