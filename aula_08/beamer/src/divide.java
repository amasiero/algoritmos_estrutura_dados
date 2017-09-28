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
