package com.andreymasiero.aulas.encadeada;

public class Node {

    private Node next;
    private int value;

    public Node() {
        this.next = null;
        this.value = -1;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        final Node other = (Node) obj;
        return (this.next == other.next) &&
                (this.value == other.value);
    }

}
