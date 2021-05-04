package com.tasks.java.miscellaneous;

public class FindNumbers {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            String[] divided = String.valueOf(num).split("");
            if (divided.length % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
