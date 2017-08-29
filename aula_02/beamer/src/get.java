int get(int value) {
    for(int i = 0; i < size; i++) {
        if(data[i] == value) {
            return i;
        }
    }
    return null;
}
