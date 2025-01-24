//Task1: Fibonacci Series

package com.studyopedia;

public class Fibonacci1 {

    // Iterative method to calculate Fibonacci series
    public static void printFibonacci1(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");  // Print first two numbers

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n=20;//Example value for n
        System.out.println("Fibonacci series up to " + n + "th number:");
        printFibonacci1(n);
    }
}