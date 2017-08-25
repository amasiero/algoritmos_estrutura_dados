public Object dequeue() {
    x = fila[inicio];
    if (inicio == tamanho)
        inicio = 0;
    else
        inicio = inicio + 1;
    return x;
}
