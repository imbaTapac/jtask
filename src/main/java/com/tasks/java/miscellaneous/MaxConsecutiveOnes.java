package com.tasks.java.miscellaneous;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int finalResult = 0;
        int tempResult = 0;
        for (int num : nums) {
            if (num == 1) {
                tempResult++;
                if (tempResult > finalResult){
                    finalResult = tempResult;
                }
            } else {
                if (tempResult > finalResult){
                    finalResult = tempResult;
                }
                tempResult = 0;
            }
        }
        return finalResult;
    }
}
