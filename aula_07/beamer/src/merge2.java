    while (esquerda <= meio && direita <= fim) {
        if (aux[esquerda] <= aux[direita]) X[i++] = aux[esquerda++];
        else X[i++] = aux[direita++];
    }

    while (esquerda <= meio) X[i++] = aux[esquerda++];
}
