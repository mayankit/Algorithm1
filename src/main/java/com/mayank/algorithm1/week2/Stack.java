package com.mayank.algorithm1.week2;

public interface Stack<Item>{

    void push(Item item);

    Item pop();

    Item peek();

    boolean isEmpty();

    int size();

}
