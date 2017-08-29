void remove(int index) {
    if (size > 0) {
        if (index < size) {
            for(int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size = size - 1;
        }
    }
}
