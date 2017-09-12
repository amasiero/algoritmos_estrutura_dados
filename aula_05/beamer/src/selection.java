vetor[] = {20, 4, 15, 7, 10}

for (i = 0; i < vetor.length - 1; i++)
    indice_menor = i
    for (j = i + 1; j < vetor.length; j++)
        if (vetor[j] < vetor[indice_menor])
            indice_menor = j
    swap(vetor[j], vetor[j + 1])
