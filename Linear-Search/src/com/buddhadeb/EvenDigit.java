package com.buddhadeb;

public class EvenDigit {

    public static void main(String[] args) {
        int[] arr = {762, 1642, 121, 129, 1442, 111, 23};
        System.out.println(findNumbers(arr));
    }

// worst case
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            int digitCount = 0;
            if (number == 0) {
                digitCount = 1;
            }
            while (number > 0) {
                digitCount++; 
                number /= 10;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
