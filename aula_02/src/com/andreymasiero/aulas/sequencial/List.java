package com.andreymasiero.aulas.sequencial;

public class List {

	private final int capacity;
	private final int data[];
	private int size;
	
	public List() {
		this.capacity = 10;
		this.data = new int[this.capacity];
		this.size = -1;		
	}
	
	public List(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		this.size = -1;
	}
	
	public void add(int number) {
		if((this.size + 1) >= this.capacity) {
			System.err.println("List is full.");
			return;
		}
		this.data[++this.size] = number;
	}
	
	public int get(int number) {
		for(int i = 0; i < this.size + 1; i++) {
			if(this.data[i] == number) 
				return i;
		}
		return -1;
	}
	
	
	public void remove(int index) {
		if (this.size < 0) {
			System.err.println("List is empty.");
			return;
		}
		
		if (this.size < index) {
			System.err.println("Index out of boundaries");
			return;
		}
		
		for (int i = index; i < this.size; i++) 
			this.data[i] = this.data[i+1];
		
		this.size--;
		
	}
	
	public int size() {
		return this.size + 1;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
	        if(this.size >= 0) {
	        for(int i = 0; i < this.size + 1; i++) {
	            sb.append(this.data[i]);
	            sb.append(", ");
	        }
	        return sb.replace(sb.lastIndexOf(","), sb.length(), "]").toString();
        } else {
        		return sb.append(" ]").toString();
        }
    }
}
