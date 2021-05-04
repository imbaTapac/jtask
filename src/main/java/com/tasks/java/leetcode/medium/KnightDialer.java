package com.tasks.java.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class KnightDialer {
    public static void main(String[] args) {
        knightDialer(1);
        knightDialer(2);
    }

    public static int knightDialer(int n) {
        int[] availableNums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        return generate(availableNums.length, n);
    }

    public static int generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        int[] combination = new int[r];
        int count = 0;

        // initialize with lowest lexicographic combination
        for (int i = 0; i < r; i++) {
            combination[i] = i;
        }

        while (combination[r - 1] < n) {
            combinations.add(combination.clone());

            // generate next combination in lexicographic order
            int t = r - 1;
            while (t != 0 && combination[t] == n - r + t) {
                t--;
            }
            combination[t]++;
            for (int i = t + 1; i < r; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }
        return combinations.size();
    }
}
