public void enqueue(Object valor) {
    fila[fim] = valor;
    if (fim = tamanho)
        fim = 0;
    else
        fim = fim + 1;
}
