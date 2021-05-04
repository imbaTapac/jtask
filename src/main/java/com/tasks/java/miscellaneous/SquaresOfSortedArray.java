package com.tasks.java.miscellaneous;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] result = sortedSquares(new int[]{-7, -3, 2, 3, 11});
        System.out.println(result);
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = j;
        while (i <= j) {

            int a = Math.abs(nums[i]);
            int b = Math.abs(nums[j]);

            if (a >= b) {
                result[k--] = a * a;
                i++;
            } else {
                result[k--] = b * b;
                j--;
            }

        }

        return result;
    }
}
