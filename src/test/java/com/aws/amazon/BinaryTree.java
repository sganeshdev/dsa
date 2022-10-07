package com.aws.amazon;

import java.util.LinkedList;

class Node{
    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class BinaryTree {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for(int i=1;i<=5;i++){
            linkedList.push(i);
        }
        System.out.println(linkedList.stream().count());


    }
}
