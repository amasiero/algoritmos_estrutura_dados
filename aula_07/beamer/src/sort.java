public void sort(int X[], int inicio, int fim) {
    if (inicio < fim) {
        int meio = (inicio + fim) / 2;
        this.sort(X, inicio, meio);
        this.sort(X, meio + 1, fim);
        this.merge(X, inicio, meio, fim);
    }
}
