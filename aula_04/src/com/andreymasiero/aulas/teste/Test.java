package com.andreymasiero.aulas.teste;

import java.util.Arrays;

import com.andreymasiero.aulas.algoritmos.Search;
import com.andreymasiero.aulas.algoritmos.Sort;

public class Test {

	public static void main(String[] args) {
		int data[] = {31, 16, 45, 87, 37, 99, 21, 43, 10, 48};
		System.out.println(Arrays.toString(data));
		int index = Search.sequentialSearch(data, 87);
		System.out.printf("Position of %d is %d\n", 87, index);
		Sort.bubblesort(data);
		System.out.println(Arrays.toString(data));
		index = Search.binarySearch(data, 87);
		System.out.printf("Position of %d is %d\n", 87, index);
	}
	
}
