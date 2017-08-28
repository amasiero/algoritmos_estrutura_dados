package com.andreymasiero.aulas.encadeada;

import com.andreymasiero.aulas.encadeada.Node;

public class Queue {

    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(int number) {
        Node newNode = new Node();
        newNode.setNext(null);
        newNode.setValue(number);
        if(this.head == null) {
            this.head = newNode;
        } else if(this.tail == null){
        		this.tail = newNode;
        		this.head.setNext(this.tail);
        } else {
            this.tail.setNext(newNode);
            this.tail = new Node();
            this.tail = newNode;
        }
        this.size++;
    }

    public Node dequeue() {
        if(this.isEmpty()) {
            System.err.println("Queue is empty.");
            return null;
        }
        Node value = this.head;
        this.head = this.head.getNext();
        this.size--;
        if(size == 0) {
        		this.head = null;
        		this.tail = null;
        }
        return value;
    }

    public Node head() {
        return this.head;
    }

    public Node tail() {
        return this.tail;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!this.isEmpty()) {
	        Node aux = this.head;
	        while(aux != null) {
	            sb.append(aux.getValue());
	            sb.append(", ");
	            aux = aux.getNext();
	        }
	        return sb.replace(sb.lastIndexOf(","), sb.length(), "]").toString();
        } else {
        		return sb.append(" ]").toString();
        }
        
    }

}
