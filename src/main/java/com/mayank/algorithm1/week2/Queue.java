package com.mayank.algorithm1.week2;

public interface Queue<Item> {

    void enqueue(Item item);

    Item dequeue();

    boolean isEmpty();

    int size();

}
