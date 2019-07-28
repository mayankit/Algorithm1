package com.mayank.algorithm1.week2;

import java.util.Iterator;

public class LinkedStack<Item> implements Stack<Item>,Iterable<Item>{

    private Node<Item> head = null;

    private int size = 0;

    public void push(Item item){
        Node<Item> node = new Node<>(item);

        if(head == null){
            head = node;
            size++;
            return;
        }

        Node<Item> temp = head;
        node.next = temp;
        this.head = node;
        size++;
    }

    public Item pop(){
        if(head == null){
            //This is not supported;
            return null;
        }
        Item value = head.item;
        if(head.next != null){
            head = head.next;
        }else{
            head = null;
        }
        size--;
        return value;
    }

    public Item peek(){
       return head.item;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return this.size;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }


    public class ListIterator implements Iterator<Item> {

        private Node<Item> current = null;

        public ListIterator(){
            this.current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }

    public class Node<Item>{
        Item item;
        Node<Item> next;

        public Node(Item item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();

        linkedStack.push("Mayank");
        linkedStack.push("Vikalp");
        linkedStack.push("Kapil");
        linkedStack.pop();
        linkedStack.push("Mayank1");
        linkedStack.push("Mayank2");
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.isEmpty();
        linkedStack.pop();
    }

}
