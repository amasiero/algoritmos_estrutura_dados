void add(int value) {
    if (size < capacidade) {
        data[size] = value;
        size = size + 1;
    }
}
