public void sort(int X[], int inicio, int fim) {
    if (inicio < fim) {
        int pivot = this.divide(X, inicio, fim);
        this.sort(X, inicio, pivot - 1);
        this.sort(X, pivot + 1, fim);
    }
}
