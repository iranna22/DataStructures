package com.iranna.threesixty.arrays;

public class SwapNumber {
public static void main(String[] args) {
	swapNumber(3,9);
}
public static void swapNumber(int a, int b) {
    // Write your code here.
    int temp = a;
    a=b;
    b=temp;
    System.out.println("a="+a+" b="+b);
}
}
