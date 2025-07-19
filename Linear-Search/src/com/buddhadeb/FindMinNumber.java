package com.buddhadeb;

public class FindMinNumber {

    public static void main(String[] args) {
        int[] arr = {98, 12, 31, 23, 46, 13, 93};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }

        return minimum;
    }
}
