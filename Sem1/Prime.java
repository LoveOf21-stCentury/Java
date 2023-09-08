package Sem1;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        printPrime(20);
    }

    private static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrime(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
