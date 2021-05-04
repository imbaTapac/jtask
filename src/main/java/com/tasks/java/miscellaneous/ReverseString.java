package com.tasks.java.miscellaneous;

public class ReverseString {
    public static void main(String[] args) {
        String myStr = "Test";
        String reversed = reverseString(myStr);
        System.out.println("The reversed string is: " + reversed);
    }


    //Method take string parameter and check string is empty or not
    public static String reverseString(String myStr) {
        if (myStr.isEmpty()) {
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println(myStr.charAt(0));
        System.out.println("String to be passed in Recursive Function: " + myStr.substring(1));
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }


}
