package com.andreymasiero.aulas.algoritmos;

public class Sort {

	public static void bubblesort (int[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data.length - 1; j++)
				if (data[j] > data[j + 1])
					swap(data, j, j + 1);
	}

    public static void selectionSort (int[] data) {
        // CODIGO AQUI
    }

	public static void insertionSort (int[] data) {
		// CODIGO AQUI
	}

	public static void swap(int[] d, int a, int b) {
		int aux = d[a];
		d[a] = d[b];
		d[b] = aux;
	}
}
