package com.andreymasiero.aulas.teste;

import com.andreymasiero.aulas.sequencial.List;

public class TestList {

	public static void main(String[] args) {
		// Seu código aqui.		
		List list = new List(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list.toString());
		list.remove(list.get(1));
		System.out.println(list.toString());
		list.remove(list.get(3));
		System.out.println(list.toString());
		list.remove(list.get(5));
		System.out.println(list.toString());
		list.remove(list.get(2));
		System.out.println(list.toString());
		list.remove(list.get(4));
		System.out.println(list.toString());
		list.remove(list.get(1));
	} 
	
}
