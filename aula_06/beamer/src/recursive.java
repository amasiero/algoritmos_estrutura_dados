public static int fatorialRecursive(int n) {
    if (n == 0)
        return 1;

    return n * fatorialRecursive(n - 1);
}
