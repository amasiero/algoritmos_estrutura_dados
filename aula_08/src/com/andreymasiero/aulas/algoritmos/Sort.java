package com.andreymasiero.aulas.algoritmos;

public class Sort {

	public static void bubblesort (int[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data.length - 1; j++)
				if (data[j] > data[j + 1])
					swap(data, j, j + 1);
	}

    public static void selectionSort (int[] data) {
        for (int i = 0; i < data.length; i++) {
        		int sindex = i;
        		for (int j = i + 1; j < data.length; j++)
        			if (data[j] < data[sindex]) sindex = j;
        		swap(data, i, sindex);
        }
    }

	public static void insertionSort (int[] data) {
		for (int i = 0; i < data.length; i++) {
			int x = data[i];
			for (int j = i - 1; j >= 0 && data[j] > x; j--) {
				data[j + 1] = data[j];
				data[j] = x;
			}

		}
	}

	public static void swap(int[] d, int a, int b) {
		int aux = d[a];
		d[a] = d[b];
		d[b] = aux;
	}
}
