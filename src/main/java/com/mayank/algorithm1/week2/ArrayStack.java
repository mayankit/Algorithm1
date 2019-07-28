package com.mayank.algorithm1.week2;

public class ArrayStack<E> implements Stack<E>{

    private final Object[] stackArray;
    private int size = 0;

    public ArrayStack(int capacity){
        stackArray = new Object[capacity + 1];
    }
    public void push(E item) {
       if(size < stackArray.length-1){
           stackArray[++size] = item;
       }else{
           System.out.println("Stack is full");
       }
    }

    public E pop() {
        if(size != 0){
           E item = (E)stackArray[size];
           stackArray[size] = null;
           size--;
           return item;
        }else{
            System.out.println("No more element present to pop");
            return null;
        }
    }

    public E peek() {
        return (E)stackArray[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        ArrayStack<String> arrayStack = new ArrayStack<String>(5);

        arrayStack.push("Mayank");
        arrayStack.push("Vikalp");
        arrayStack.push("Kapil");
        arrayStack.pop();
        arrayStack.push("Mayank1");
        arrayStack.push("Mayank2");
        arrayStack.push("Mayank1");
        arrayStack.push("Mayank2");
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.isEmpty();
        arrayStack.pop();
    }
}
