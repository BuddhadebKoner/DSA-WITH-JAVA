package com.buddhadeb;

public class Main {

    public static void main(String[] args) {
        int[] nums = {12, -7, 34, -21, 0, 5, -3, 19, -15, 8};
        int targateElement = 34;
        int ans = linearSearch(nums, targateElement);
        System.err.println(ans);
    }

    static int linearSearch(int[] arr, int targateElement) {
        if (arr.length == 0) {
            return -2;
        }

        //  fun a for loop 
        for (int i = 0; i < arr.length; i++) {
            // check for element index if it is equal to target 
            int element = arr[i];
            if (element == targateElement) {
                return i;
            }
        }

        //  if no element is not exist in the array 
        return -1;
    }
}
