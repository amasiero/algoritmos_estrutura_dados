package com.andreymasiero.aulas.teste;

import java.util.Arrays;

import com.andreymasiero.aulas.algoritmos.Sort;

public class Test {

	public static void main(String[] args) {
		int data[] = {20, 4, 15, 7, 10};
		Sort.insertionSort(data);
		System.out.println(Arrays.toString(data));
	}
	
}
