public void merge(int X[], int inicio, int meio, int fim) {

    int i, esquerda, direita;
    int aux[] = new int[X.length];

    for (i = inicio; i <= fim; i++) aux[i] = X[i];

    esquerda = inicio;
    direita = meio + 1;
    i = inicio;
