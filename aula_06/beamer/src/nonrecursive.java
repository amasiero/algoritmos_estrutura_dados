public static int fatorialNonRecursive(int n) {
    int result = 1;
    for (int i = result; i <= n; i++) {
        result *= i;
    }
    return result;
}
