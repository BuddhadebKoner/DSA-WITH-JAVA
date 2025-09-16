package com.buddhadeb;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 1, 2};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        System.out.println("Original : " + Arrays.toString(arr1));

        insertion(arr1, true);
        selection(arr2, true);
        bubble(arr3, true);

        System.out.println("\nSorted (Insertion): " + Arrays.toString(arr1));
        System.out.println("Sorted (Selection): " + Arrays.toString(arr2));
        System.out.println("Sorted (Bubble)   : " + Arrays.toString(arr3));
    }

    /* -------------------------------------------------- *
     * Insertion Sort
     * -------------------------------------------------- */
    static void insertion(int[] arr) {
        insertion(arr, false);
    }

    static void insertion(int[] arr, boolean verbose) {
        if (!isSortable(arr)) {
            return;
        }
        for (int i = 1; i < arr.length; i++) { // start from second element
            int key = arr[i];
            int j = i - 1;
            // shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            if (verbose) {
                printStep("Insertion i=" + i, arr);
            }
        }
    }

    /* -------------------------------------------------- *
     * Selection Sort (chooses max each pass and places at end)
     * -------------------------------------------------- */
    static void selection(int[] arr) {
        selection(arr, false);
    }

    static void selection(int[] arr, boolean verbose) {
        if (!isSortable(arr)) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
            if (verbose) {
                printStep("Selection pass=" + i, arr);
            }
        }
    }

    /* -------------------------------------------------- *
     * Bubble Sort (optimized: stop early if no swaps in a pass)
     * -------------------------------------------------- */
    static void bubble(int[] arr) {
        bubble(arr, false);
    }

    static void bubble(int[] arr, boolean verbose) {
        if (!isSortable(arr)) {
            return;
        }
        for (int pass = 0; pass < arr.length - 1; pass++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - pass; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (verbose) {
                printStep("Bubble pass=" + pass, arr);
            }
            if (!swapped) {
                break;
            }
        }
    }

    /* -------------------------------------------------- *
     * Helpers
     * -------------------------------------------------- */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static boolean isSortable(int[] arr) {
        return arr != null && arr.length > 1;
    }

    private static void printStep(String label, int[] arr) {
        System.out.println(String.format("%-18s => %s", label, Arrays.toString(arr)));
    }
}
