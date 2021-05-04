package com.tasks.java.miscellaneous;

public class DuplicateZeros {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }

    public static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int tempedVal = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (tempedVal != 0) {
                if (i + 1 == arr.length-1) {
                    result[i + 1] = tempedVal;
                    continue;
                }
                result[i] = tempedVal;
                tempedVal = arr[i];
                continue;
            }
            if (arr[i] == 0) {
                result[i] = arr[i];
                tempedVal = arr[i + 1];
                result[i + 1] = 0;
                i++;
                continue;
            } else if (i - 1 >= 0) {
                if (arr[i - 1] == 0) {
                    result[i] = 0;
                    tempedVal = arr[i];
                    result[i + 1] = 0;
                    continue;
                }
            }
            result[i] = arr[i];
        }
    }
}
