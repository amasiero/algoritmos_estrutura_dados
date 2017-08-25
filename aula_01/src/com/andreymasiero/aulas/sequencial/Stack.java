package com.andreymasiero.aulas.sequencial;

public class Stack {

    private final int array[];
    private final int size;
    private int top;

    public Stack() {
        this.size = 10;
        this.array = new int[this.size];
        this.top = -1;
    }

    public Stack(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.top = -1;
    }

    public void push(int number) {
        if((this.top + 1) >= this.size) {
            System.err.println("Stack is  full.");
            return;
        }
        this.array[++this.top] = number;
    }

    public int pop() {
        if(this.isEmpty()) {
            System.err.println("Stack is empty.");
            return (-1);
        }
        return this.array[this.top--];
    }

    public int top() {
        return this.array[this.top];
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i = (this.size - 1); i > -1; i--) {
            sb.append(this.array[i]);
            sb.append(", ");
        }
        return sb.replace(sb.lastIndexOf(","), sb.length(), "]").toString();
    }
}
