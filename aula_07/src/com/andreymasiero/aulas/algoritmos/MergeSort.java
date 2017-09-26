package com.andreymasiero.aulas.algoritmos;

public class MergeSort {

    public void sort(int X[], int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;
            this.sort(X, inicio, meio);
            this.sort(X, meio + 1, fim);
            this.merge(X, inicio, meio, fim);

        }

    }

    private void merge(int X[], int inicio, int meio, int fim) {

        int i, esquerda, direita;
        int aux[] = new int[X.length];

        for (i = inicio; i <= fim; i++) aux[i] = X[i];

        esquerda = inicio;
        direita = meio + 1;
        i = inicio;

        while (esquerda <= meio && direita <= fim) {
            if (aux[esquerda] <= aux[direita]) X[i++] = aux[esquerda++];
            else X[i++] = aux[direita++];
        }

        while (esquerda <= meio) X[i++] = aux[esquerda++];
    }

}
