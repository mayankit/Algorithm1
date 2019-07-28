package com.mayank.algorithm1.week2;

import java.lang.Integer;

public class SpecialStack<Item extends Comparable<Item>> implements Stack<Item> {

    Stack<Item> firstStack = new LinkedStack<>();
    Stack<Item> secondStack = new LinkedStack<>();

    @Override
    public void push(Item item) {
        firstStack.push(item);

        if(secondStack.isEmpty()){
           secondStack.push(item);
           return;
      }

      if(item.compareTo(secondStack.peek()) > 0){
          secondStack.push(item);
      }
    }


    @Override public Item pop() {
       Item item = firstStack.pop();

       if(item.compareTo(secondStack.peek()) == 0){
           secondStack.pop();
       }
       return item;
    }

    @Override
    public Item peek() {
        return firstStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return firstStack.isEmpty();
    }

    @Override
    public int size() {
        return firstStack.size();
    }

    public Item max(){
        return secondStack.peek();
    }

    public static void main(String[] args) {
        SpecialStack<Integer> specialStack = new SpecialStack<>();
        specialStack.push(7);
        specialStack.push(2);
        specialStack.push(8);
        specialStack.pop();
        specialStack.push(3);
        specialStack.push(10);
        specialStack.push(5);
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
    }
}
