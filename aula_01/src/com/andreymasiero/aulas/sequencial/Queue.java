package com.andreymasiero.aulas.sequencial;

public class Queue {

    private final int array[];
    private final int size;
    private int back;

    public Queue() {
        this.size = 10;
        this.array = new int[this.size];
        this.back = 0;
    }

    public Queue(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.back = 0;
    }

    public void enqueue(int number) {
        if ((this.back + 1) > this.size) {
            System.err.println("Queue is full");
            return;
        }
        this.array[this.back++] = number;
    }

    public int dequeue() {
        if(this.isEmpty()) {
            System.err.println("Queue is empty.");
            return (-1);
        }
        int value = this.array[0];
        for (int i = 0; i < this.back -1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.back--;
        return value;
    }

    public int front() {
        return this.array[0];
    }

    public int back() {
        return this.array[this.back];
    }

    public boolean isEmpty() {
        return this.back == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
	        if(this.back > 0) {
	        for(int i = 0; i < this.back; i++) {
	            sb.append(this.array[i]);
	            sb.append(", ");
	        }
	        return sb.replace(sb.lastIndexOf(","), sb.length(), "]").toString();
        } else {
        		return sb.append(" ]").toString();
        }
    }
}
