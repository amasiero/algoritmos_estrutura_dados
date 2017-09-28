package com.andreymasiero.aulas.teste;

import java.util.Scanner;

import com.andreymasiero.aulas.algoritmos.Recursion;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("O fatorial de " + n + " eh " + Recursion.fatorialNonRecursive(n));
		
		System.out.println("O fatorial recursivo de " + n + " eh " + Recursion.fatorialRecursive(n));
		s.close();
	}
	
}
