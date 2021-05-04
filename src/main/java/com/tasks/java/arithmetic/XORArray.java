package com.tasks.java.arithmetic;

public class XORArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }

    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + 2 * i;
            result ^= arr[i];
        }
        return result;
    }
}
