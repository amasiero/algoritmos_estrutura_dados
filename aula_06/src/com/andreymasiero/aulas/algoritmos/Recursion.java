package com.andreymasiero.aulas.algoritmos;


public class Recursion {

    public static int fatorialNonRecursive(int n) {
        int result = 1;
        for (int i = result; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fatorialRecursive(int n) {
    		if (n == 0)
    			return 1;
    		
        return n * fatorialRecursive(n - 1);
    }

}
