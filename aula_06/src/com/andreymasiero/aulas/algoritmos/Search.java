package com.andreymasiero.aulas.algoritmos;

public class Search {
	
	public static int sequentialSearch(int[] data, int value) {		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return i;
			}
		}		
		return -1;
	}
	
	public static int binarySearch(int[] data, int value) {
		int begin = 0;
		int end = data.length - 1;
		
		while (begin < end) {
			int middle = (begin + end) / 2;
			if (data[middle] > value)
				end = middle - 1;
			else if (data[middle] < value)
				begin = middle + 1;
			else
				return middle;
		}
		return -1;
	}
}
