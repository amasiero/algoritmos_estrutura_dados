package com.andreymasiero.aulas.teste;

import com.andreymasiero.aulas.encadeada.List;

public class TestList2 {

	public static void main(String[] args) {
		// Seu código aqui.		
		List list = new List();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		list.remove(1);
		System.out.println(list.toString());
		list.remove(3);
		System.out.println(list.toString());
		list.remove(5);
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
		list.remove(4);
		System.out.println(list.toString());
		list.remove(1);
	} 
	
}
