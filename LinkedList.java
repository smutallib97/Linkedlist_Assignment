package com.bridgelabz;

public class LinkedList<T> {
    class Node <T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
        }
    }
    Node<T> head;
    Node<T> tail;
    public void push(T data) {
        Node<T> newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void show(){
        if(head == null){
            System.out.println("Linked list is Empty");
        }
        else{
            Node<T> temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    //UC4 - Ability to insert 30 between 56 and 70
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp, current;
            current = head;
            temp = head.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();
        // UC2 - Adding 30 and 56 to 70 by using add()
        System.out.println("By Using Add() Linked list is: ");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.show();
        //UC3 - Create Linkedlist by appending 30 and 70 to 56
        System.out.println("By using append() Linked list is: ");
        LinkedList<Integer>list3 = new LinkedList<>();
        list3.append(56);
        list3.append(30);
        list3.append(70);
        list3.show();

        //UC4 - Ability to insert 30 between 56 nd 70
        System.out.println("Inserting 30 between 56 and 70 Linked list is: ");
        LinkedList<Integer>list4 = new LinkedList<>();
        list4.insert(56);
        list4.insert(70);
        list4.insert(30);
        list4.show();
    }
}
