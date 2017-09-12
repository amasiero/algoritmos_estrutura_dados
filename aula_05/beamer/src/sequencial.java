
vetor[10] = {31, 16, 45, 87, 37, 99, 21, 43, 10, 48}
valorProcurado = 87
indice = -1

for (i = 0; i < vetor.length - 1; i++) {
    if (vetor[i] == valorProcurado) {
        indice = i
    }
}
