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
    
    public static int fibonacciNonRecursive(int n) {
    		int f = -1;
    		int fibMenos1 = 1;
    		int fibMenos2 = 0;
    		for (int i = 3; i <= n; i++) {
    			f = fibMenos1 + fibMenos2;
    			fibMenos2 = fibMenos1;
    			fibMenos1 = f;
    		}    		
    		return f;
    }
    
    public static int fibonacciRescursive(int n) {
    		if (n == 0 || n == 1) return 0;
    		if (n == 2) return 1;
    		return fibonacciRescursive(n - 2) + fibonacciRescursive(n - 1);
    }

}
