package com.mayank.algorithm1.week2;

public class QueueUsingTwoStacks<Item> implements Queue<Item>{

    Stack<Item> firstStack = new LinkedStack<>();
    Stack<Item> secondStack = new LinkedStack<>();

    @Override public void enqueue(Item item) {
        firstStack.push(item);
    }

    @Override public Item dequeue() {
        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }

         return secondStack.pop();
    }

    @Override public boolean isEmpty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }

    @Override public int size() {
        return firstStack.size() + secondStack.size();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queueUsingTwoStacks = new QueueUsingTwoStacks<>();
        queueUsingTwoStacks.enqueue(1);
        queueUsingTwoStacks.enqueue(2);
        queueUsingTwoStacks.enqueue(3);
        queueUsingTwoStacks.enqueue(4);
        queueUsingTwoStacks.dequeue();
        queueUsingTwoStacks.dequeue();
        queueUsingTwoStacks.enqueue(5);
        queueUsingTwoStacks.enqueue(6);
        queueUsingTwoStacks.dequeue();
        queueUsingTwoStacks.enqueue(7);
        queueUsingTwoStacks.dequeue();
        queueUsingTwoStacks.dequeue();
        queueUsingTwoStacks.dequeue();

    }
}
