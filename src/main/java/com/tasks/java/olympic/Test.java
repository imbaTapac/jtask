package com.tasks.java.olympic;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 1};
        System.out.println(findDuplicate(array));
    }

    public static int findDuplicate(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return -1;
    }

    public static int findDuplicates(int[] array) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(integers.contains(array[i])){
                return array[i];
            }
            integers.add(array[i]);
        }
        return -1;
    }
}
