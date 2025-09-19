package com.buddhadeb;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 4};

        System.out.println("Single Number : " + singleNumberFind(nums));
        System.out.println("Find single Number : " + singleNumberOptimal(nums));
    }

// worst case o(n^2)
    static int singleNumberFind(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 0) {
                return nums[i];
            }
        }
        return -1;
    }
// o(n) optimal solns ->>
    static int singleNumberOptimal(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
