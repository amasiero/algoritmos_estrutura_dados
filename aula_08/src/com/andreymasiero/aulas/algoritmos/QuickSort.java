package com.andreymasiero.aulas.algoritmos;

public class QuickSort {

    public void sort(int X[], int inicio, int fim) {
        if (inicio < fim) {
            int pivot = this.divide(X, inicio, fim);
            this.sort(X, inicio, pivot - 1);
            this.sort(X, pivot + 1, fim);
        }
    }

    public int divide(int X[], int inicio, int fim) {
        int pivot = X[inicio];
        int postPivot = inicio;
        for (int i = inicio + 1; i <= fim; i++) {
            if(X[i] < pivot) {
                X[postPivot] = X[i];
                X[i] = X[postPivot + 1];
                postPivot++;
            }
        }
        X[postPivot] = pivot;
        return postPivot;
    }
}
