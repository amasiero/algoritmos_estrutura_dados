public Object pop() {
    topo = topo - 1;
    return pilha[topo + 1];
}
