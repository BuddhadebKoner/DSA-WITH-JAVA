package com.buddhadeb;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {98, 12, 31, 23, 46, 13, 93};

        int target = 93;
        int start = 0;
        int end = 4;

        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
