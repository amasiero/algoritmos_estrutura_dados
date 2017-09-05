
vetor[10] = {31, 16, 45, 87, 37, 99, 21, 43, 10, 48}

for (i = 0; i < vetor.length - 1; i++) {
    for (j = 0; j < vetor.length - 1; j++) {
        if (vetor[j] > vetor[j + 1]) {
            swap(vetor[j], vetor[j + 1]);
        }
    }
}
