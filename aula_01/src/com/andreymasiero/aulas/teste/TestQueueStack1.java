package com.andreymasiero.aulas.teste;

import com.andreymasiero.aulas.encadeada.Queue;
import com.andreymasiero.aulas.encadeada.Stack;

public class TestQueueStack1{

    public static void main(String... args) {
    		System.out.println("Teste da Fila -------------");
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        
        System.out.println("\n\n\n\n");
        System.out.println("Teste da Pilha -------------");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        s.pop();
        System.out.println("Fim do Teste -------------");
    }
}
