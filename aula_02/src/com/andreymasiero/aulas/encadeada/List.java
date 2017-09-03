package com.andreymasiero.aulas.encadeada;

import com.andreymasiero.aulas.encadeada.Node;

public class List {
	
	private Node first;
	private Node last;
	private int size;
	
	public List() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void add(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		newNode.setNext(null);
		if (this.first == null) {
			this.first = newNode;
		} else if(this.last == null) {
			this.last = newNode;
			this.first.setNext(this.last);
		} else {
			this.last.setNext(newNode);
            this.last = new Node();
            this.last = newNode;
		}
		this.size++;		
	}
	
	public Node get(int value) {
		if(this.isEmpty()) {
            System.err.println("List is empty.");
            return null;
        }
		Node aux = this.first;
		while(aux != null) {
			if (aux.getValue() == value) {
				return aux;
			}
		}
		return null;
	}
	
	public void remove(int value) {
		if(this.isEmpty()) {
            System.err.println("List is empty.");
            return;
        }
		if (this.first.getValue() == value) {
			Node aux = this.first.getNext();
			this.first = null;
			this.first = aux;
		} else {
			Node aux = this.first;
			while (aux != null) {
				if(aux.getNext().getValue() == value) {
					aux.setNext(aux.getNext().getNext());
					break;
				}
				aux = aux.getNext();
			}
		}
		this.size--;
		if(size == 0) {
	    		this.first = null;
	    		this.last = null;
	    }
	}
	
	public boolean isEmpty() {
		return this.first == null && this.last == null;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!this.isEmpty()) {
	        Node aux = this.first;
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
