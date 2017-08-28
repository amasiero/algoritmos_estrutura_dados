package com.andreymasiero.aulas.encadeada;

import com.andreymasiero.aulas.encadeada.Node;

public class Stack {

    private Node top;
    private int size;
    
    public void push(int number) {
        Node newNode = new Node();
        newNode.setNext(null);
        newNode.setValue(number);
        if(this.top == null) {
        		this.top = newNode;
        } else {
        		newNode.setNext(this.top);
        		this.top = new Node();
        		this.top = newNode;
        }
        this.size++;
    }

    public Node pop() {
        if(this.isEmpty()) {
            System.err.println("Stack is empty.");
            return null;
        }
        Node aux = this.top;
        this.top = this.top.getNext();
        size--;
        return aux;
    }
    
    public int size() {
    		return this.size;
    }
    
    public Node top() {
        return this.top;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if(this.top != null) { 
        		Node aux = this.top;
        		while(aux != null) {
        			sb.append("\n|");
	            sb.append(aux.getValue());
	            sb.append("|\n ");
	            aux = aux.getNext();
	        }
        		return sb.toString();
        } else {
        		return sb.append("| |").toString();
        }
    }

}
