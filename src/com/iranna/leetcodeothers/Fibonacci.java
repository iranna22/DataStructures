package com.iranna.leetcodeothers;


public class Fibonacci {

    public static int fib(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: F(1) = 1
        }

        int prev1 = 1; // F(1)
        int prev2 = 0; // F(0)
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // Calculate F(i)
            prev2 = prev1;           // Update F(i-2)
            prev1 = current;         // Update F(i-1)
        }

        return current;
    }

    public static void main(String[] args) {
    	//0,1,1,2,3,5,8
        int n = 4; // Change the value of n to test other cases
        System.out.println("F(" + n + ") = " + fib(n));
    }
}
