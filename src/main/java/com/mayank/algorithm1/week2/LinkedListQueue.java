package com.mayank.algorithm1.week2;

public class LinkedListQueue<Item> implements Queue<Item> {

    private int size = 0;
    private Node<Item> head;
    private Node<Item> tail;
    @Override
    public void enqueue(Item item) {
        Node<Item> node = new Node(item);

        if(tail != null){
            Node temp = tail;
            tail.next = node;
            tail = tail.next;
            size++;
        }else{
            head = tail = node;
        }
    }

    @Override
    public Item dequeue() {
        if(head != null){
            Item item = head.item;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return item;
        }else{
            System.out.println("Queue is empty this operation have no effect");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null || tail == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    public class Node<Item>{
        Item item;
        Node<Item> next;

        public Node(Item item){
            this.item = item;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
